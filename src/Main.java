import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sum =0, input = 0;
        int counter = 0;
        System.out.println("Enter the numbers: (press 0 to exit) ");
        Scanner inp = new Scanner(System.in);

        while((input = inp.nextDouble()) != 0) {
          sum += input;
          counter++;
        }
        if (counter > 0){
            double average = sum/counter;
            System.out.println("The average of " + counter + " numbers is " + average );
        }

    }
}