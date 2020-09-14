package Studio.Quizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    private String prompt;
    private ArrayList<String> answerOptions;
    private String correctAnswer;
    private String userAnswer;
    private int numberCorrect;
    Scanner input;

    public Question(String prompt, ArrayList<String> answerOptions, String correctAnswer) {
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public ArrayList<String> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(ArrayList<String> answerOptions) {
        this.answerOptions = answerOptions;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    
    public void displayPromptAndOptions() {
        input = new Scanner(System.in);
        System.out.println(prompt);
        System.out.println(answerOptions);
        this.userAnswer = input.nextLine();

    }

    public int isCorrect() {
        if(userAnswer.toLowerCase().equals(correctAnswer.toLowerCase())) {
            System.out.println("Correct!");
            this.numberCorrect ++;

        } else {
            System.out.println(("Incorrect"));
        } return numberCorrect;
    }
}
