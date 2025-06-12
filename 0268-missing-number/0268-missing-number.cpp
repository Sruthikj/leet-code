class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
    
        int totalsum=0;
        for(int i=0;i<=n;i++){
            totalsum = totalsum + i;
        }
    
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
        }
    
        return totalsum-sum; 
    }
};