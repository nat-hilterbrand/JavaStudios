package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Miles Driven:");
        Integer miles = input.nextInt();

        System.out.println("Gallons of Gas Consumed:");
        Integer gas = input.nextInt();

        Integer milesPerGallon = miles / gas;

        System.out.println("Your miles per gallon is " + milesPerGallon);

    }
}

