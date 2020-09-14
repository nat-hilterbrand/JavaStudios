package Studio.Quizzes;

import java.util.ArrayList;

public class TrueFalse extends Question {

    private boolean correctAnswer;

    public TrueFalse(String prompt, ArrayList<String> answerOptions, String correctAnswer){
        super(prompt, answerOptions, correctAnswer);
    }

    @Override
    public int isCorrect() {
        return super.isCorrect();
    }
}

