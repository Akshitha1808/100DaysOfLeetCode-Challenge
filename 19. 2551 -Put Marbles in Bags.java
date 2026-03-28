class Solution {
    public long putMarbles(int[] w, int k) {
        int n = w.length;
        List<Long> arr = new ArrayList<>();
        for(int i = 0; i < n - 1; i++)
        {
            arr.add((long) w[i] + w[i + 1]);
        }
        Collections.sort(arr);
        long max = 0, min = 0;
        for(int i = 0; i < k - 1; i++)
        {
            min += arr.get(i);
        }
        for(int i = arr.size() - (k - 1); i < arr.size(); i++)
        {
            max += arr.get(i);
        }
        return Math.abs(max - min);
    }
}
