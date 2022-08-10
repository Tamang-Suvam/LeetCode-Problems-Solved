class Solution {
    public int climbStairs(int n) {
        int num1 = 0, num2 = 1, steps = 0;
        for(int i=0;i<n;i++){
            steps = num1 + num2;
            num1 = num2;
            num2 = steps;
        }
        return steps;
    }
}