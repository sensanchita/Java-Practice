import java.util.Scanner;
public class FibSquare {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.print("How many number");
	 int n = scan.nextInt();
	 printFibonacciSeries(n);
	}
	static void printFibonacciSeries(int n)
	{
		int fib1 = 0;
		int fib2 = 1;
		System.out.print((fib1*fib1)+" "+(fib2*fib2)+" ");
		for(int i = 3;i<=n;i++) 
		{
			int fib3 = fib1 + fib2;
			System.out.print(findSquare(fib3)+" ");
			fib1 = fib2;
			fib2 = fib3;
		}
	}
	static int findSquare(int num) 
	{
		return num*num;
	}

}
