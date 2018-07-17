import java.util.Random;
import java.util.Scanner;

public class GuessinggameClass {
    public static void main(String[] args) {
        int secretNumber = 6;
        int getDate;
        System.out.println("Enter a Number:");
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int newRand = rand.nextInt(10);

        while (newRand >=0 && newRand <10) {

            getDate = keyboard.nextInt();
           if (getDate == secretNumber )
               System.out.println("Congratulations you won!");
            else
              System.out.println("Wrong Number");

        }
    }
}