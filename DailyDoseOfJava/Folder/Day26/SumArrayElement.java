package Day26;

public class SumArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,4,6,8,9,0,7,5,7,3};
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		System.out.println("Sum: "+ sum);
	}

}
