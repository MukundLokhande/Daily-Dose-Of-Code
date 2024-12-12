package Day30;

public class Array02LargestSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,44,76,244,336,56,732,35,5, 8};
		int Fmin, Fmax, Smin, Smax;
		Fmin = Integer.MAX_VALUE; Smin = Integer.MAX_VALUE;
		Fmax = Integer.MIN_VALUE; Smax = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length; i++)
		{
			if (arr[i] > Fmax && arr[i] > Smax)
			{
				Smax = Fmax;
				Fmax = arr[i];
			}
			else if (arr[i] > Smax && arr[i] <= Fmax)
			{
				Smax = arr[i];
			}
			
			if (arr[i] < Fmin && arr[i] < Smin)
			{
				Smin = Fmin;
				Fmin = arr[i];
			}
			else if (arr[i] < Smin && arr[i] >= Fmin)
			{
				Smin = arr[i];
			}
			
		}
		System.out.println("First Max Element: "+ Fmax + " Second Max Element: "+ Smax );
		System.out.println("First Min Element: "+ Fmin + " Second Min Element: "+ Smin );
		
	}

}
