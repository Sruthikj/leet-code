class Solution {
    public int missingNumber(int[] nums) {
        
        int total_len = nums.length+1;
        int total_sum = 0;
        int arr_sum = 0;
        for(int i=0;i<total_len;i++)
        {
            total_sum += i;
        }
        for(int i=0;i<nums.length;i++)
        {
            arr_sum += nums[i];
        }
        return total_sum - arr_sum;
    }
}