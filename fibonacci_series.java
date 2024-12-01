import java.util.Scanner;
public class LogicCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("how many number:");
		int num = scan.nextInt();
		int first = 0,second = 1;
		int fibo;
		System.out.print(first+" "+second);
		for(int i = 3;i<=num;i++) {
			fibo = first + second;
			System.out.print(" "+fibo);
			first = second;
			second = fibo;
  }
		System.out.println();
 }
}
