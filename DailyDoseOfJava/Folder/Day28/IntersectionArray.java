package Day28;

public class IntersectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2,5,8,4,9,0}, arr2[] = {8,4,2,1,22,444};
		int arrI[] = new int[arr1.length], a = 0, p = 0;
		int arrU[] = new int[arr1.length + arr2.length];
		
		for(int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; j < arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					arrI[a] = arr1[i];
					a++;
					break;
				}
			}
			arrU[p] = arr1[i];
			p++;
		}
		
		for(int s = 0; s < arr2.length; s++)
		{
			arrU[p] = arr2[s];
			p++;
		}
		for(int c : arrI)
		{
			System.out.print(c + "  ");
		}
		System.out.println(" ");
		for(int c : arrU)
		{
			System.out.print(c + "  ");
		}
	}

}

/*LeetCode
 * 
 * import java.util.ArrayList;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        for(int i = 0; i < nums1.length; i++)
        {
            for(int j = 0; j < nums2.length; j++)
            {
                if(nums1[i] == nums2[j] && !al.contains(nums1[i]) )
                {
                    al.add(nums1[i]);
                }
            }
        }
        int arr[] = new int[al.size()];
        for(int i = 0 ; i < arr.length; i++)
        {
            arr[i] = al.get(i);
        }
        return arr;
    }
}*/
