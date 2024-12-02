package Day27;

public class SortHalfArrInASCandHalfInDESC {

	public static void main(String[] args) 
	{
		int arr[] = {34,56,73,22,56,20,21,46,26,6,74, 15};
		for(int x : arr)
		{
			System.out.print(x + "  ");
		}
		int mid = arr.length / 2;
		
		for(int k = 0; k < mid; k++)
		{
			int minIndex = k;
			for(int i = k+1 ; i <= mid; i++)
			{	 int temp = 0;
				if(arr[minIndex] > arr[i])
				{
					temp = arr[i];
					arr[i] = arr[minIndex];
					arr[minIndex] = temp;
				}
			}
		}
		
		for(int k = mid; k < arr.length - 1; k++)
		{
			int minIndex = k;
			for(int i = k+1 ; i < arr.length; i++)
			{	 int temp = 0;
				if(arr[minIndex] < arr[i])
				{
					temp = arr[i];
					arr[i] = arr[minIndex];
					arr[minIndex] = temp;
				}
			}
		}
		System.out.println(" ");
		for(int x : arr)
		{
			System.out.print(x+ "  ");
		}
	}

}
