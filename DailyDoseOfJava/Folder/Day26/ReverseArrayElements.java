package Day26;

public class ReverseArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9};
		for(int y : arr)
		{
			System.out.print(y+ "  " );
		}
		System.out.println(" ");
		int itr = arr.length / 2, temp = 0;
		for(int i = 0 ; i < itr; i++)
		{
			temp = arr[i];
			arr[i] = arr[arr.length -1 -i];
			arr[arr.length -1 -i] = temp;
		}
		
		for(int x : arr)
		{
			System.out.print(x + "  ");
		}
	}

}
