import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int input;
        double sum=0;
        int counter=0;
        int countOdd=0;
        while(true)
        {
           input = Integer.parseInt(reader.nextLine());
           if(input == -1)
           {
               System.out.println("Thank you and see you later!");
               break;
           }
           else
           {
               counter++;
               sum+=input;
           }
           if(input%2!=0)
               countOdd++;
        }
        System.out.println("The sum is "+ (int)sum);
        System.out.println("How many numbers: "+ counter);
        System.out.println("Average: "+(sum/counter));
        System.out.println("Even numbers: "+(counter-countOdd));
        System.out.println("Odd numbers: "+(countOdd));

    }
}
