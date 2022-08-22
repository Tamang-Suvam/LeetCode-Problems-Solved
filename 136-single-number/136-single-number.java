class Solution {
    public int singleNumber(int[] nums) {
        ArrayList <Integer> helper = new ArrayList<>();
        if(nums.length == 1){
            return nums[0];
        }
        helper.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(helper.contains(nums[i])){
                helper.remove(Integer.valueOf(nums[i]));
            }
            else{
                helper.add(nums[i]);
            }
        }
        return helper.get(0);
    }
}