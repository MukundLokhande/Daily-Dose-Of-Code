package day07;

public class ArrayPairs {

	public static void printPairs(int numbers[])
	{
		for(int i = 0 ; i < numbers.length; i++)
		{
			for (int j = i+1; j < numbers.length; j++)
			{
				System.out.print("("+numbers[i]+","+numbers[j]+")");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {2,4,6,8,10};
		printPairs(numbers);
	}

}
