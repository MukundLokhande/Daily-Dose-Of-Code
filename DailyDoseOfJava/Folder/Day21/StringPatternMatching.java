package Day21;

public class StringPatternMatching 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "010", source = "hhhdjdo" ;
		if( pattern.charAt(0) == pattern.charAt(1) && pattern.charAt(0) == pattern.charAt(2) )
		{
			for(int i = 0; i < source.length()- 2; i++ )
			{
				if( source.charAt(i) == source.charAt(i+1) && source.charAt(i) == source.charAt(i+2) )
				{
					System.out.println( " " +source.charAt(i) + source.charAt(i+1) + source.charAt(i+2));
					break;
				}
			}
		}
		if( pattern.charAt(0) == pattern.charAt(1) && pattern.charAt(0) != pattern.charAt(2) )
		{
			for(int i = 0; i < source.length()- 2; i++ )
			{
				if( source.charAt(i) == source.charAt(i+1) && source.charAt(i) != source.charAt(i+2) )
				{
					System.out.println( " " +source.charAt(i) + source.charAt(i+1) + source.charAt(i+2));
					break;
				}
			}
		}
		if( pattern.charAt(0) != pattern.charAt(1) && pattern.charAt(0) == pattern.charAt(2) )
		{
			for(int i = 0; i < source.length()- 2; i++ )
			{
				if( source.charAt(i) != source.charAt(i+1) && source.charAt(i) == source.charAt(i+2) )
				{
					System.out.println( " " +source.charAt(i) + source.charAt(i+1) + source.charAt(i+2));
					break;
				}
			}
		}
		else
		{
			for(int i = 0; i < source.length()- 2; i++ )
			{
				if( source.charAt(i) != source.charAt(i+1) && source.charAt(i) != source.charAt(i+2) )
				{
					System.out.println( " " +source.charAt(i) + source.charAt(i+1) + source.charAt(i+2));
					break;
				}
			}
		}
	}

}
