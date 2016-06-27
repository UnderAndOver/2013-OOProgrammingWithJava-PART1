
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable
        read = Integer.parseInt(reader.nextLine());
        sum+= read;
        read = Integer.parseInt(reader.nextLine());
        sum+= read;
        read = Integer.parseInt(reader.nextLine());
        sum+= read;
        System.out.println("Sum: " + sum);
    }
}
