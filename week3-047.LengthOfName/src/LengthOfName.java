
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        int x = calculateCharacters(reader.nextLine());
        System.out.println("Number of characters: "+ x);
    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    public static int calculateCharacters(String text){
        return text.length();
    }
}
