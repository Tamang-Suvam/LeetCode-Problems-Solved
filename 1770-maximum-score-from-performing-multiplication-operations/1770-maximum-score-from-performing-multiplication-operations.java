class Solution {
    int n,m;
    int[] nums;
    int[] muls;
    Integer[][] dp;
    public int helper(int l, int index) {
        int r = n - (index - l) - 1;
        if(index == m)
            return 0;
        if(dp[l][index] != null)
            return dp[l][index];
        dp[l][index] = Math.max(helper(l+1,index+1) + nums[l]*muls[index],
                                helper(l,index+1) + nums[r]*muls[index]);
        return dp[l][index];
    }
    public int maximumScore(int[] nums, int[] muls) {
        n = nums.length;
        m = muls.length;
        this.nums= nums;
        this.muls = muls;
        this.dp = new Integer[m][m];
        return helper(0,0);
    }
}