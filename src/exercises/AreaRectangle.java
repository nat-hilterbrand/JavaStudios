package exercises;
import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Length of Rectangle:");
      Integer length = input.nextInt();

      System.out.println("Width of Rectangle:");
      Integer width = input.nextInt();

      Integer area = length * width;

      System.out.println("The Area of the rectangle is " + area);

    }
}
