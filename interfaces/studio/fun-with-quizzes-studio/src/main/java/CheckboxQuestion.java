public class CheckboxQuestion extends Question {

    //Class Variables

    //Constructors
    public CheckboxQuestion(String question, String answer) {
        super(question, answer);
    }
    //Method
    @Override
    public boolean checkAnswer(String answer) {
        //expect answer = "A, B, C"
        //                "a,b,c"
        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
