import java.util.Scanner;
public class driversLicenseEvaluator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.nextLine();

        if (age >= 18) {
            System.out.println("You are of legal age.");

            System.out.print("Do you already have a driver's license? Y/N: ");
            String hasLicense = input.nextLine();

            if (hasLicense.equalsIgnoreCase("Y")) {
                System.out.println("Great! Drive responsibly.");
            } else if (hasLicense.equalsIgnoreCase("N")) {
                System.out.println("You should apply when you're ready.");
                System.out.println("To process your driver's license, please visit your local licensing office with required documents.");
            } else {
                System.out.println("Invalid input. Please answer Y or N.");
            }
        } else {
            System.out.println("You are a minor yet. You are not yet eligible to apply.");
        }
        input.close();
    }
}