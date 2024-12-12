package Day30;

public class Array01LargestSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		int arr[] = {9,44,76,244,336,56,732,35,5, 8};
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			
			if(arr[i] < min)
			{
				min = arr[i];
			}
			
		}
		System.out.println("Max: " + max + " Min: "+ min);
	}

}
