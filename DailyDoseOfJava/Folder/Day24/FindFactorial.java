package Day24;
import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N , Multiple = 1;
		System.out.println("Enter a Number: ");
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		
		for (int i = N; i > 0; i--)
		{
			Multiple = Multiple * i;
		}
		System.out.println("Factorial of number: " + N + " is: "+ Multiple);
	}

}
