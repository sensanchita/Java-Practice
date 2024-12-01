import java.util.Scanner;
public class LogicCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scan.nextInt();
		int fact = 1;
		for (int i = 1;i <= number;i++) {
			fact = fact * i;
  }
		System.out.print("factorial is " + fact);
 }
}
