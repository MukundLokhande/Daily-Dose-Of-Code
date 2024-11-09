package day09;

public class SecondLargeNumber 
{
	public static int second(int arr[])
	{
		int max = Integer.MIN_VALUE, temp = 0;
		int arr1[] =arr;
		for(int i = 0 ; i < arr1.length; i++)
		{
			if(max < arr1[i])
			{
				max = arr1[i];
				temp = i;
			}
		}
		arr1[temp] = Integer.MIN_VALUE;
		max = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr1.length; i++)
		{
			if(max < arr1[i])
			{
				max = arr1[i];
				temp = i;
			}
		}
		return max;
	}
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7,8,10,9};
		System.out.println(second(arr));
		
	}
}
