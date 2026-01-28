class Solution {
    public String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");
        StringBuilder a = new StringBuilder();
        for(int i = arr.length-1; i >= 0; i--)
        {
            if(i == 0)    
            {
                a.append(arr[i]);
            }
            else 
            {
                a.append(arr[i]);
                a.append(" ");
            }
        }
        return String.valueOf(a);
    }
}
