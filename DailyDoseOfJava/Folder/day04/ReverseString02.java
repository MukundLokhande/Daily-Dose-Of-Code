package day04;

public class ReverseString02 {

	public String re(String name)
	{
		String RS = "";
		for (int i = name.length()-1 ; i >= 0; i--)
		{
			 RS = RS + name.charAt(i);
		}
		return RS;
	}
	
	public static void main(String[] args)
	{
		ReverseString02 obj = new ReverseString02();
		String name = "Kunal";
		System.out.println(obj.re(name));
	}
}
