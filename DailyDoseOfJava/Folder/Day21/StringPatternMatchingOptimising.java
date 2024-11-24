package Day21;
public class StringPatternMatchingOptimising 
{
	public static boolean matchesPattern(String pattern,char c1,char c2,char c3)
	{
		return (pattern.charAt(0) == pattern.charAt(1) && pattern.charAt(0) == pattern.charAt(2) && c1 == c2 && c1 == c3) ||
	               (pattern.charAt(0) == pattern.charAt(1) && pattern.charAt(0) != pattern.charAt(2) && c1 == c2 && c1 != c3) ||
	               (pattern.charAt(0) != pattern.charAt(1) && pattern.charAt(0) == pattern.charAt(2) && c1 != c2 && c1 == c3) ||
	               (pattern.charAt(0) != pattern.charAt(1) && pattern.charAt(0) != pattern.charAt(2) && c1 != c2 && c1 != c3);
	    
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String pattern = "001", source = "hhhdjdo" ;
		
		for(int i = 0 ; i < source.length() -2; i++)
		{
			char c1, c2,c3;
			c1 = source.charAt(i) ;
			c2 = source.charAt(i+1);
			c3 = source.charAt(i+2);
			if(matchesPattern(pattern, c1,c2,c3))
			{
				System.out.println("" + c1 + c2 + c3);
				break;
			}
		}
	}
}
