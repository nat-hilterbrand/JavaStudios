package exercises;

import java.util.Objects;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String firstSentence = "Alice was beginning to get very tired of sitting /n" +
                " by her sister on the bank, and of having nothing to do: once or twice /n" +
                " she had peeped into the book her sister was reading, but it had no pictures /n" +
                " or conversations in it, 'and what is the use of a book,' thought Alice /n" +
                "'without pictures or conversation?'";
        firstSentence = firstSentence.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("What word would you like to search for:");

        String term = input.nextLine();
        //boolean searchTerm = firstSentence.equals(term);

        if(firstSentence.contains(term)) {
            System.out.println(term + " was found");
        }else System.out.println(term + " was not found");
    }
}
