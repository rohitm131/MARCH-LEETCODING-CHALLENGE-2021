class Solution {
    public int countSubstrings(String s) {
        int[][]dp=new int[s.length()][s.length()];
        int count=0;
        
        
        for(int i=0;i<s.length();i++){
            dp[i][i]=1;
            count++;
        }
        
        
        for(int i=0;i<s.length()-1;i++){
            dp[i][i+1]=s.charAt(i)==s.charAt(i+1)?1:0;
            count+=dp[i][i+1];
        }
        
        
        for(int col=2;col<s.length();col++){
            for(int row=0;row<s.length()&&row+col<s.length();row++){
                dp[row][row+col]=(s.charAt(row)==s.charAt(row+col)?dp[row+1][(row+col)-1]:0);
                count+=dp[row][row+col];
            }
        }
        return count;
    }
}
