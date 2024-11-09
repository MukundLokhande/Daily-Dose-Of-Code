package day09;

public class DuplicateInArray 
{
	public static boolean dupliCheck(int arr[])
	{
		boolean check = false;
		for(int i = 0; i < arr.length-1 ; i++)
		{
			for (int j = i+1 ; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					check = true;
					return check;
				}
			}
		}
		return check;
	}
	
	public static void main(String[] args)
	{
		int arr[] = {2,4,7,8,9,0,4};
		System.out.println(dupliCheck(arr));
	}
}
