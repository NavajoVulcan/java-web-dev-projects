public class MultipleChoiceQuestion extends Question {

    //Class Variables

    //Constructor
    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }
//Methods
    @Override
    public boolean checkAnswer(String answer) {
        //expect answer to be "A", "B", "C" -- as a string not a char
        // answer "a" or "b" still valid, case insensitive
        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
