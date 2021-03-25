class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = 0, sum = 0;
        
        for(int i=0; i<=n; i++) {
            total += i;
        }
        
        for(int i : nums) {
            sum += i;
        }
        
        return total - sum;
        
    }
}
