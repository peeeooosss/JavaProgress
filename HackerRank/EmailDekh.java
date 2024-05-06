import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailDekh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[gmail.outlook]+\\.[a-zA-Z]{2,}");

        System.out.println("Welcome to Our Newsletter Subscription!");
        System.out.println("Enter  your email address to subscribe (type 'exit' to finish):");

        while (scanner.hasNext()) {
            String userInput = scanner.next();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for considering our newsletter! Have a great day!");
                break;
            } else if (emailPattern.matcher(userInput).matches()) {
                System.out.println("Subscription successful! Thank you for subscribing with " + userInput);
            } else {
                System.out.println("Invalid email address. Please enter a valid email or type 'exit' to finish.");
            }
        }

        scanner.close();
    }
}
