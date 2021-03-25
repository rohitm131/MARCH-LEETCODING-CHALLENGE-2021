class Solution {
    public int removePalindromeSub(String s) {
        if(s.length() == 0){
            return 0;
        } else if(checkPalindrome(s)){
            return 1;
        } else{
            return 2;
        }
    }

    private boolean checkPalindrome(String s){
        int i=0;
        int j = s.length() -1;
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            } else{
                return false;
            }
        }

        return true;
    }
}
