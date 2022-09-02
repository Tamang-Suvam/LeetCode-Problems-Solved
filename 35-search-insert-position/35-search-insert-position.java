class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1, result = -1;
        while(low<=high){
            int mid = (int)Math.floor((low+high)/2);
            if(nums[mid]>target)
                high = mid - 1;
            if(nums[mid]<target)
                low = mid + 1;
            if(nums[mid]==target){
                result = mid;
                break;
            }
        }
        if(low>high)
            result = low;
        return result;
    }
}