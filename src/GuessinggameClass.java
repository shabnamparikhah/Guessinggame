import java.util.Random;
import java.util.Scanner;

public class GuessinggameClass {
    public static void main(String[] args) {

        int getDate;
        System.out.println("Enter a Number:");
        Scanner keyboard = new Scanner(System.in);
        getDate = keyboard.nextInt();
        Random rand = new Random();
        int newRand =1+ rand.nextInt(10);

        while (getDate != newRand) {

            System.out.println("The number is incorrect");
            getDate = keyboard.nextInt();

        }
        System.out.println("The number is correct");
    }
}