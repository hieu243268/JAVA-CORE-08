package LESSON53;
import java.util.ArrayList;
import java.util.List;

public class QuestionManagement {
    private Question[] questions;

    public QuestionManagement() {
    }

    public QuestionManagement(Question[] questions) {
        this.questions = questions;
    }
    public void tinhdiem(int i, int j){
        System.out.println("Ban da tra loi duoc"+i+"/"+j+"tong so cau");
    }
    // timf kiem cac cau hoi theo do kho
    public List<Question> findQuestionsByDiffLevel(int dokho) {
        List<Question> result = new ArrayList<Question>();
        for (int i = 0; i < questions.length; ++i)
            if (questions[i].getDokho() == dokho)
                result.add(questions[i]);
        return result;
    }
}
