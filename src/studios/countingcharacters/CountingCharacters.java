package studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args){
//        String userString = "If the product of two terms is zero then common sense says at least one of the two terms" +
//                "has to be zero to start with. So if you move all the terms over to one side, you can put the" +
//                "quadratics into a form that can be factored allowing that side of the equation to equal zero." +
//                "Once you’ve done that, it’s pretty straightforward from there.";
//
//        char[] charactersInString = userString.toCharArray();
//        System.out.println(charactersInString.length); //335

        HashMap<Character, Integer> countingCharacters = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase to count:");
        String userPhrase = input.nextLine();

        String testString = "This is a test string";
        char[] charactersInString = userPhrase.toCharArray();

        for (char letter : charactersInString) {
            if(countingCharacters.containsKey(letter)){
                countingCharacters.put(letter, countingCharacters.get(letter) +1);
            }else{
                countingCharacters.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> oneChar : countingCharacters.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }
    }
}
