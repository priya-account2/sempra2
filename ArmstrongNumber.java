import java.util.Scanner;

public class ArmstrongNumber {

    // Function to check if a number is Armstrong or not
    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, digits = 0;
        
        // Assign the number to the originalNumber variable
        originalNumber = number;
        
        // Get the number of digits in the number
        while (originalNumber != 0) {
            originalNumber /= 10;
            digits++;
        }
        
        originalNumber = number;
        
        // Calculate the Armstrong number
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }
        
        // Return true if the number is an Armstrong number
        return result == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}