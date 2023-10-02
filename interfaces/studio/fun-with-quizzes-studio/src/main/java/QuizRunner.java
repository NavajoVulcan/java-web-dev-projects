package main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();
        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion( Question "Who was the first captain of the Constitution-class USS Enterprise NCC-1701? \nA. James Kirk\nB. Christopher Pike\nC.Robert April\nD. Katrina Cornwell\n.Please enter the letter you think is correct.", answer "C");
        myQuiz.addQuestion(myMultipleChoiceQuestion);

        CheckboxQuestion my CheckboxQuestion = new CheckboxQuestion (Question "Select all that apply, which are members of the United Federation of Planets? \nA. Vulcan\nB.Terrans\nC. Klingons\nD. Betazoids", answer "A,B,D");
        myQuiz.addQuestion(myCheckboxQuestion);

        TrueFalseQuestion my TrueFalseQuestion = new TrueFalseQuestion ( Question "Vulcans have feelings.\nTrue\nFalse", answer "True");
        myQuiz.addQuestion(myTrueFalseQuestion);

        myQuiz.runQuiz();
    }
}
