class Solution {
    public int maxSubarraySumCircular(int[] nums) {
//         int helpIndex;
//         int curr_sum;
//         int max_sum = Integer.MIN_VALUE;
//         int j;

//         for(int i=0;i<nums.length;i++){
//             helpIndex = i;
//             j = 0;
//             curr_sum = 0;
//             while(j < nums.length){
//                 curr_sum += nums[helpIndex % nums.length];
//                 if(curr_sum > max_sum){
//                     max_sum = curr_sum;
//                 }
//                 if(curr_sum < 0){
//                     curr_sum = 0;
//                 }
//                 helpIndex++;
//                 j++;
//             }
//         }
//         return max_sum;
        int max_sum = nums[0], min_sum = nums[0], curr_sum1 = 0, curr_sum2 = 0, total = 0;
        int result;
        for(int n : nums){
            curr_sum1 += n;
            curr_sum2 += n;
            max_sum = Math.max(curr_sum1, max_sum);
            if(curr_sum1 < 0) curr_sum1 = 0;
            min_sum = Math.min(curr_sum2, min_sum);
            if(curr_sum2 > 0) curr_sum2 = 0;
            total += n;
        }
        if(max_sum < 0){
            result = max_sum;
        }
        else{
            result = Math.max(max_sum, total - min_sum);
        }
        return result;
    }
}