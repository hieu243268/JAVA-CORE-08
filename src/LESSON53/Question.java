package LESSON53;

public class Question {
    private String content;
    private String aw1, aw2, aw3,aw4;
    private int correct;
    private int dokho;

    public Question() {
    }

    public Question(String content, String aw1, String aw2, String aw3, String aw4, int correct, int dokho) {
        this.content = content;
        this.aw1 = aw1;
        this.aw2 = aw2;
        this.aw3 = aw3;
        this.aw4 = aw4;
        this.correct = correct;
        this.dokho = dokho;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAw1() {
        return aw1;
    }

    public void setAw1(String aw1) {
        this.aw1 = aw1;
    }

    public String getAw2() {
        return aw2;
    }

    public void setAw2(String aw2) {
        this.aw2 = aw2;
    }

    public String getAw3() {
        return aw3;
    }

    public void setAw3(String aw3) {
        this.aw3 = aw3;
    }

    public String getAw4() {
        return aw4;
    }

    public void setAw4(String aw4) {
        this.aw4 = aw4;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public int getDokho() {
        return dokho;
    }

    public void setDokho(int dokho) {
        this.dokho = dokho;
    }
     public void answercorrect(boolean check){
        if(check==true){
            System.out.println("Dap an dung");
        }else{
            System.out.println("Dap an sai");
        }
     }
}
