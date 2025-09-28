import java.util.Scanner;
public class OddEven {
				
				public static void main(String[] args) {
								Scanner evaluator = new Scanner(System.in);
								System.out.print("Enter your number: ");
								double input = evaluator.nextDouble();
								
								if (input % 2 == 0) {
												System.out.print("Your input is an even number.");
								} else {
												System.out.print("Your input is an odd number.");
								}
								evaluator.close();
				}
}