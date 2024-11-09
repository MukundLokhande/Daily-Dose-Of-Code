package day09;

public class SecondLargeNumber02 
{
	public static int second(int arr[])
	{
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length; i++)
		{
			if(arr[i] > max1 && arr[i] > max2 )
			{
				max2 = max1;
				max1 = arr[i];
			}
			else if (arr[i] > max2)
			{
				max2 = arr[i];
			}
		}
		
		return max2;
	}
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7,8,10,9};
		System.out.println(second(arr));
		
	}

}
