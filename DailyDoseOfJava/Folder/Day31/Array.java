package Day31;
public class Array { 
	
    public static long findScore(int[] nums) {
        int var = nums.length;
        //int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        int arr[] =new int[var] ;
        int k = 0; int t = 0;
        while (var > 0)
        {
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < nums.length; i++)
            {
                if (nums[i] < min)
                {
                    min = nums[i];
                    t = i;
                }
            }
            arr[k] = min; 
            k++;
            if(t == 0 )
            {
                nums[t] = max; var--;
                if (nums.length > 1)
                    {
                        nums[t+1] = max;
                        var--;
                    }
            }
            else if (t == nums.length -1)
            {
                nums[t] = max; var--;
                nums[t-1] = max; var--;
            }
            else 
            {
                nums[t] = max; var--;
                nums[t-1] = max; var--;
                nums[t+1] = max; var--;
            }
        }
        long sum = 0;
        for (int x : arr)
        {
            sum = sum + x;
        }
        return sum;
    }


	public static void main(String[] args)
	{
		int[] nums = {2,5,6,7,8,9,43,4};
		System.out.println(findScore(nums));
	}
}
