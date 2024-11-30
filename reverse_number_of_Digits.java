import java.util.Scanner;
public class LogicCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int temp = number;
		int sum = 0,r;
		while(temp !=0) {
			r = temp % 10;
			sum = sum * 10 + r;
			temp=temp/10;
		}
		System.out.println("The reverse number of digit " +sum);
	}
}
