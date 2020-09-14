package Studio.Quizzes;

import java.util.ArrayList;

public class Checkbox extends Question {

    public Checkbox(String prompt, ArrayList<String> answerOptions, String correctAnswer) {
        super(prompt, answerOptions, correctAnswer);
    }

    @Override
    public int isCorrect() {
        return super.isCorrect();
    }
}

