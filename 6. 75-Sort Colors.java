class Solution {
    public void sortColors(int[] nums) {
        int oc = 0, zc = 0, tc = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                oc++;
            }
            else if(nums[i] == 0)
            {
                zc++;
            }
            else if(nums[i] == 2)
            {
                tc++;
            }
        }
        for(int i = 0; i < zc; i++)
        {
            nums[i] = 0;
        }
        for(int i = zc; i < zc + oc; i++)
        {
            nums[i] = 1;
        }
        for(int i = zc + oc; i < zc + oc + tc; i++)
        {
            nums[i] = 2;
        }
    }
}
