package Day10;

import java.util.HashSet;

public class FindFreqInString 
{
	public static void main(String[] args)
	{
		String str = "efndjnndji wdk";
		HashSet<String> hs = new HashSet<>();
		
		for (int i = 0; i < str.length(); i++)
		{
			int count = 0;
			for(int j = 0; j < str.length(); j++ )
			{
				if (str.charAt(i) == str.charAt(j))
				{
					count++;
				}
			}
			if(!hs.contains(str.charAt(i) + " has freq of: "+ count))
			{
				System.out.println(str.charAt(i)+ " has freq of: "+ count);
				hs.add((str.charAt(i)+ " has freq of: "+ count));
			}
		}
	}
}
