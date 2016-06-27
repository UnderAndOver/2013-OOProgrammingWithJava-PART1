
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Up to what number? ");
        int number=1;
        int input = Integer.parseInt(reader.nextLine());
        while(number<=input){
            System.out.println(number);
            number++;
        }
        
    }
}
