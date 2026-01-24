class Solution {
    public boolean isPalindrome(int x) {
      int dup = x;
      int rev = 0;
      while(x > 0)
      {
        rev = (rev * 10) + (x % 10);
        x /= 10;
      }
      if(dup == rev) return true;
      else return false;
    }
}
