class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int tot = n * (n+1)/2;
        int sum = nums[0]; 
        for(int i = 1; i < n; i++)
        {
            sum+=nums[i];
        }
        return tot - sum;
    }
}
