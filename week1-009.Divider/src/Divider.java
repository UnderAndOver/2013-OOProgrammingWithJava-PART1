
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        float firstNumber = (float)(Integer.parseInt(reader.nextLine()));
        System.out.print("Type another number: ");
        float secondNumber = (float)(Integer.parseInt(reader.nextLine()));
        System.out.println(" ");
        System.out.println("Division: "+ firstNumber + " / " + secondNumber + " = " + (firstNumber/secondNumber));
        // Implement your program here. Remember to ask the input from user.
    }
}
