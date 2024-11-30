import java.util.Scanner;
public class LogicCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int temp = number;
		
		while (temp >= 10) {
			temp = sumOfDigits(temp);
		}
		System.out.println("The single digit sum of digit of " + number + " is " + temp + ".");
	}
	public static int sumOfDigits(int num) {
		int sum = 0;
		while(num != 0) {
			sum += num % 10;
            num /= 10;
		}
		return sum;
}
}
