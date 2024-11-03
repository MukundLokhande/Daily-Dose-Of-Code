package day04;
//Identifying Vowel Positions in a String
import java.util.ArrayList;

public class VowelPositions 
{
	public static int[] positions(String K)
	{	//int arr[] = new int[100];
		ArrayList<Integer> vowelPositions = new ArrayList<>();
		int p = 0;
		for(int i = 0; i < K.length(); i++)
		{
			if(K.charAt(i) == 'a')
			{
				vowelPositions.add(i);
				
			}
			if(K.charAt(i) == 'i')
			{
				vowelPositions.add(i);
			}
			if(K.charAt(i) == 'e')
			{
				vowelPositions.add(i);
			}
			if(K.charAt(i) == 'o')
			{
				vowelPositions.add(i);
			}
			if(K.charAt(i) == 'u')
			{
				vowelPositions.add(i);
			}
		}
		
		int[] result = new int[vowelPositions.size()];
		for(int i = 0; i < vowelPositions.size(); i++)
		{
			result[i] = vowelPositions.get(i);
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		String K = "jhfiuehhw";
		int arr2[] = positions(K);
		
		for(int x:arr2)
		{
			System.out.println(x);
		}
	}
}
