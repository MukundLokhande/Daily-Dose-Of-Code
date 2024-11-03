package day04;

public class SecondSmallestArrayElement {

	public static int printSecondMin(int arr[])
	{
		int Firstmin = Integer.MAX_VALUE;
		int Secondmin = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++)
		{
			if (arr[i] < Firstmin)
			{
				Secondmin = Firstmin;
				Firstmin = arr[i];
			}
			else if(Secondmin > arr[i] && arr[i] != Firstmin)
			{
				Secondmin = arr[i];
			}
		}
		
		return Secondmin;
	}
	public static void main(String[] args)
	{
		int arr[] = {34,656,655,33,67,99,21,334,67,90};
		System.out.println(printSecondMin(arr));
	}
}
