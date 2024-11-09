package day09;

public class FindPairsWithGivenSum 
{

	public static void main(String[] args) 
	{
		int arr[] = {1,5,7,-1,5}, Target = 6;
		
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] + arr[j] == Target)
				{
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
	}

}
