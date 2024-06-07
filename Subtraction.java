/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exam.subtraction;

/**
 *
 * @author ADMIN
 */
import java.util.Random;
import java.util.Scanner;
public class Subtraction {


    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate two single-digit integers
        int number1 = random.nextInt(9) + 1; // Adding 1 to avoid 0
        int number2 = random.nextInt(10);

        // Ensure number1 >= number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Display the question to the student
        System.out.print("What is " + number1 + " - " + number2 + "? ");

        // Prompt student for the answer
        int answer = scanner.nextInt();

        // Check if the answer is correct
        if (answer == (number1 - number2)) {
            System.out.println(" That's correct.");
        } else {
            System.out.println("Sorry, the correct answer is " + (number1 - number2) + ".");
        }

        scanner.close();
    }
}
