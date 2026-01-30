class Solution {
    public int[] twoSum(int[] num, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < num.length; i++)
        {
            int bal = target - num[i];
            if(hm.containsKey(bal))
            {
                ans[1] = i + 1;
                ans[0] = hm.get(bal);
            }
            hm.put(num[i], i + 1);
        }
        return ans;
    }
}
