class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int[] res = new int[2];
        HashSet<Integer> hs = new HashSet<>();
        
        int eSum = 0;
        int total = 0;
        
        for(int n:nums){
            if(hs.contains(n)){
                res[0]=n;
                continue;
            }
            eSum = eSum + n;
            hs.add(n);
        }
        
		total = nums.length * ( nums.length + 1 ) / 2;
        res[1] = total - eSum;
        
        return res;
        
    }
}
