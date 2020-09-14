package Studio.Quizzes;

import java.util.ArrayList;
import java.util.Arrays;



public class Quiz {
    private ArrayList<Question> quizQuestions;
    private int totalCorrect;
    private double score;


    public Quiz(int totalCorrect, double score) {
        this.quizQuestions = new ArrayList<Question>();
        this.totalCorrect = totalCorrect;
        this.score = score;
    }

    public ArrayList<Question> getQuizQuestions() {
        return quizQuestions;
    }

    public Quiz(int totalCorrect) {
        this.totalCorrect = totalCorrect;
    }

    public int getTotalCorrect() {
        return totalCorrect;
    }

    public void setTotalCorrect(int totalCorrect) {
        this.totalCorrect = totalCorrect;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void QuizBuilder() {
    ArrayList<String> answerOptions = new ArrayList<>(Arrays.asList("True", "False"));
    ArrayList<String> answerOptions2 = new ArrayList<>(Arrays.asList("Raymond, Sherb, Lucky", "All"));
    ArrayList<String> answerOptions3 = new ArrayList<>(Arrays.asList("Purple", "Green", "Blue", "Puce", "Black", "Red", "Orange", "Yellow"));

    quizQuestions.add(new TrueFalse("Is climate change real?", answerOptions, "True"));
    quizQuestions.add(new MultipleChoice("Who is the best Animal Crossing Villager?", answerOptions2, "All"));
    quizQuestions.add(new Checkbox("What are the colors of the rainbow?", answerOptions3, "Purple, Green, Blue, Red, Orange, Yellow"));

        for (int i = 0; i < quizQuestions.size(); i++) {
            quizQuestions.get(i).displayPromptAndOptions();
            if(quizQuestions.get(i).isCorrect() == 1){
                totalCorrect ++;
            }
        }
        totalCorrect = 0;
        score = (totalCorrect / 100);
    }

}

//
//        input = new Scanner(System.in);
//
//        for (int i = 0; i < quizQuestions.size(); i++) {
//            System.out.println("Please enter the question: ");
//            //scanner question input.nextLine;
//            System.out.println("Please enter the answer options: ");
//            //scanner answerOptions input.nextLine;
//            System.out.println("Please enter the correct answer: ");
//            //scanner correctAnswer input.nextLine;
//            quizQuestions.put(questionNumber, //call Question here)
//            questionNumber += questionNumber;
//        }
//    }


