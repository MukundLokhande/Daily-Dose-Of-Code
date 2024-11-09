package day09;
public class MoveZerosToEnd {

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 4,6,0, 23, 12};
        
        int n = arr.length;
       for (int i = 0; i < n-1; i++)
       {
    	   
    	   if(arr[i] == 0)
    	   {
    		   //shift
    		   for(int y = i; y < n-1; y++)
    		   {
    			   arr[y] = arr[y+1];
    		   }
    		   arr[n-1] = 0;
    		   i--;
    	   }
       }
        
        for (int z : arr) {
            System.out.print(z + " ");
        }
    }
}
