public class TrueFalseQuestion extends Question {

    //Class Variables

    //Constructors
    public TrueFalseQuestion(String question, String answer) {
        super(question, answer);
    }
    //Method
    @Override
    public boolean checkAnswer(String answer) {
        //expect answer = "true", "false"
        //                "TRUE", "FALSE"
        //                "True", "False" etc,
 if (answer.toUpperCase().equals(this.getTheAnswer.toUpperCase())) {
     return true;
 }else {
     return false;
    }
    }
}

