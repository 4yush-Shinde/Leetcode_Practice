class Solution {
    public boolean isPalindrome(int x) {
        int og = x;
        int digit = 0;
        int rev = 0;
        while (x > 0){
          digit = x%10;
          rev = rev * 10 + digit;
          x = x/10;
        }
        return og == rev;

    }
}
