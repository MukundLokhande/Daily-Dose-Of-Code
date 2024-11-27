package Day23;

public class ArrayElementPairMinDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,44,65,7,99,55,4,5};
		int temp = 0, min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length-1; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				temp = arr[i] - arr[j];
				
				if(temp < 0)
					temp = temp * -1;
				
				if (temp < min)
				{
					min = temp;
				}
			}
		}
		System.out.println(min);
	}

}
