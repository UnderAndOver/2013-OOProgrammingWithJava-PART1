import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int result=1;
        while(number>0){
            result*=number;
            number--;
        }
        System.out.println("Factorial is "+ result);
    }
}
