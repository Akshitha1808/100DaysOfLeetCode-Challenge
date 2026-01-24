class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        if (n == 1) return;
        if ( k > n) k = k % n;
        rotate(nums, 0, n - k);
        rotate(nums, n - k, n);
        rotate(nums, 0 , n);
    }
    private static void rotate(int arr[], int l , int r)
    {
        while(l < r)
        {
            int temp = arr[l];
            arr[l] = arr[r - 1];
            arr[r - 1] = temp;
            l++;
            r--;
        }
    }
}
