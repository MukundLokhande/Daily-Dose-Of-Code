package Day24;
import java.util.Scanner;

public class GreatestOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 3 Number to Find the largest");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt(), num2 = scanner.nextInt(), num3 = scanner.nextInt();
		System.out.print("Largest among all numbers is: ");
		
		if(num1 > num2 && num1 > num3)
			System.out.println(num1);
		else if(num2 > num1 && num2 > num3)
			System.out.println(num2);
		else 
			System.out.println(num3);
		}

}
