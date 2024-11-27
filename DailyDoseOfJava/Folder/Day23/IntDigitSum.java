package Day23;

import java.time.temporal.Temporal;

public class IntDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4958, sum = 0;
		System.out.println("Hello");
		
		
		while (num > 0)
		{	
			sum +=  (num % 10);
			num = num / 10;
		}
		
		System.out.println("Sum Of Given Integer Number is: "+ sum);
		
	}

}
