package day09;

import java.util.HashSet;

public class FindUniquePairsInGivenSum 
{
	public static void main(String[] args)
	{
		int arr[] = {1,5,7,-1,5,1};
		int Target = 6;
		
		HashSet<String> uniquePairs =new HashSet<>();
		System.out.println("Unique pairs with sum "+ Target + ":");
		
		for (int i = 0; i < arr.length-1 ; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if (arr[i] + arr[j] == Target)
				{
					int small = Math.min(arr[i], arr[j]);
					int big = Math.max(arr[i], arr[j]);
					
					String pairString = small +","+big;
					
					if(!uniquePairs.contains(pairString))
					{
						System.out.println("("+small+","+big+")");
						uniquePairs.add(pairString);
					}
				}
			}
		}
	}
}
