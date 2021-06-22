package LESSON53;


import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong cau hoi: ");
        int questCount = sc.nextInt();

        Question[] questions = new Question[questCount];
        for (int i = 0; i < questCount; i++) {
            questions[i] = new Question();
            sc = new Scanner(System.in);

            System.out.println("Nhap noi dung: ");
            questions[i].setContent(sc.nextLine());

            System.out.println("Dap an 1: ");
            questions[i].setAw1(sc.nextLine());

            System.out.println("Dap an 2: ");
            questions[i].setAw2(sc.nextLine());

            System.out.println("Dap an 3: ");
            questions[i].setAw3(sc.nextLine());

            System.out.println("Dap an 4: ");
            questions[i].setAw4(sc.nextLine());

            sc = new Scanner(System.in);

            System.out.println("Dap an dung (1 - 4): ");
            questions[i].setCorrect(sc.nextInt());

            System.out.println("Nhap do kho: ");
            questions[i].setDokho(sc.nextInt());
        }

        QuestionManagement qm = new QuestionManagement(questions);

        System.out.println("Nhap do kho muon kiem tra: ");
        int diffLevel = sc.nextInt();

        List<Question> lst = qm.findQuestionsByDiffLevel(diffLevel);

        lst.stream().forEachOrdered((q) -> {
            System.out.println("Cau hoi: " + q.getContent());

            System.out.println("A. " + q.getAw1());
            System.out.println("B. " + q.getAw2());
            System.out.println("C. " + q.getAw3());
            System.out.println("D. " + q.getAw4());
        });

        sc = new Scanner(System.in);
        System.out.println("Nhap lan luot dap an: ");
        int[] answers = new int[lst.size()];
        int correctCount = 0;

        for (int i = 0; i < answers.length; i++) {
            answers[i] = sc.next("^[A-D]").charAt(0) - 'A' + 1;
            if (answers[i] == lst.get(i).getCorrect())
                correctCount++;
        }

        System.out.println("Correct Answer: " + correctCount);
        lst.stream().forEachOrdered((q) -> {
            System.out.print((char)(q.getCorrect() - 1 + 'A') + " ");
        });
    }

}