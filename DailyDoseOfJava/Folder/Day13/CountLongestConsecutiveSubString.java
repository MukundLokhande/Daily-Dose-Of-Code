package Day13;

public class CountLongestConsecutiveSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "aaaabbbccccccdd";
		char tempC = ' ';
		int max = 1;
		for(int i = 0; i < string.length(); i++)
		{
			int count = 1;
			for(int j = i+1; j < string.length(); j++)
			{
				if(string.charAt(i) == string.charAt(j))
				{
					count++;
					if(count > max)
					{
						max = count;
						tempC = string.charAt(i);
					}
				}
				else 
					break;
			}
		}
		System.out.println("Char with Longest substring is: "+ tempC +" with count: " +max);
	}

}
