class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int x : nums)
        {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        } 
        int ans = 0;
        for(int x : hm.keySet())
        {
            if(hm.get(x) > n / 2)
            {
                ans = x;
            }
        }
        return ans;
    }
}
