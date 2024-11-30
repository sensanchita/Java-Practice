import java.util.Scanner;
public class LogicCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int sum = 0;
		for(int i = 1;i <= number;i++) {
			sum = sum + i;
		}
		System.out.println("First natural number " + sum);
}
}
