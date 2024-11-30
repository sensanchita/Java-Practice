import java.util.Scanner;
public class LogicCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int temp = number;
		int sum = 0,r;
		while(temp !=0) {
			r = temp % 10;
			sum = sum + r*r*r;
			temp=temp/10;
		}
		if(number == sum) {
		System.out.println("it is a armstrong number");
	} else {
		System.out.println("it is not a armstrong number");
	}
}
}
