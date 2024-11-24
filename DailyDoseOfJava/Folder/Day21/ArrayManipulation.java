package Day21;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8};
		int length = arr.length;
		int newArr[] = new int[length];
		
		newArr[0] = arr[0] + arr[1];
		newArr[length - 1] = arr[length-1] + arr[length-2];
		for(int i = 1; i < length-1; i++)
		{
			newArr[i] = arr[i-1] + arr[i] + arr[i+1];
		}
		
		for(int x : arr)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println( "New Array is ");
		for(int x : newArr)
		{
			System.out.print(x + " ");
		}
	}

}
/*
 Given an array a, your task is to output an array b of the same length by applying the following transformation: 
– For each i from 0 to a.length - 1 inclusive, b[i] = a[i - 1] + a[i] + a[i + 1]
– If an element in the sum a[i - 1] + a[i] + a[i + 1] does not exist, use 0 in its place
– For instance, b[0] = 0 + a[0] + a[1]

Example

For a = [4, 0, 1, -2, 3]: 
– b[0] = 0 + a[0] + a[1] = 0 + 4 + 0 = 4
– b[1] = a[0] + a[1] + a[2] = 4 + 0 + 1 = 5
– b[2] = a[1] + a[2] + a[3] = 0 + 1 + (-2) = -1
– b[3] = a[2] + a[3] + a[4] = 1 + (-2) + 3 = 2
– b[4] = a[3] + a[4] + 0 = (-2) + 3 + 0 = 1

So, the output should be solution(a) = [4, 5, -1, 2, 1].*/
