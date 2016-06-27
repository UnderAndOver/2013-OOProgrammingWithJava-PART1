import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        if(firstNumber != secondNumber){
            System.out.print("Greater number: ");
            if(firstNumber > secondNumber){
                System.out.print(firstNumber);
            }
            else {
                System.out.print(secondNumber);
            }
        }
        else {
            System.out.println("The numbers are equal!");
        }
}
}
