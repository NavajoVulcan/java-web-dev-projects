import java.util.ArrayList;
import java.util.Scanner;
//Add questions
//Run quiz
//Grade
public class Quiz {
   //Class Variables
private ArrayList<Question> questions = new ArrayList<Question>();
private int numberOfQuestionsCorrect = 0;
private Scanner scanner = new Scanner(System.in);
//Constructor
public Quiz() {

}

//Methods
public void addQuestion(Question questions) {
    this.questions.add(question);
}
public void runQuiz(){
    //loop through each question
    //ask question
    for (Question question: question) {
        System.out.println(question.getTheQuestion());
        //get answer
        String usersAnswer = this.getusersAnswers();
        //check answer
       boolean userGetQuestionCorrect = question.checkAnswer(usersAnswer);
       if (userGetQuestionCorrect) {
           this.numberOfQuestionsCorrect++;
       }
    }
    //grade quiz
    double percentCorrect = (this.numberOfQuestionsCorrect / this.questions.size()) *100;
    System.out.println("Users Grade: " + percentCorrect + "%");
    }
    private String getUsersAnswers() {
    String usersAnswer = scanner.nextLine();
    return usersAnswer;
    }
}
