
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 

        // Graph is used as follows:
        /*Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value);
        */
        // Remove or comment out these lines above before trying to run the tests.
        double temperature;
        while(true){
            System.out.println("Enter a temperature");
            temperature = Double.parseDouble(reader.nextLine());
            if(temperature<=40 && temperature>=-30){
                Graph.addNumber(temperature);
            }
        }
    }
}