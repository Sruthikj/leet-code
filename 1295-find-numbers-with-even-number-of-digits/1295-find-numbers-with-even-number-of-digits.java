class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            int temp = nums[i];
            int dc = 0;

            while(temp!=0)
            {
                dc++;
                temp = temp / 10;
            }

            if(dc % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }
}