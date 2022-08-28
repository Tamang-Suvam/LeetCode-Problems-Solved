class Solution {
   
    public int[] maxSlidingWindow(int[] nums, int k) {
        int j = 0;
        int [] result = new int [nums.length-k+1];
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         for(int i = 0; i < k; i++)
//             pq.add(nums[i]);
        
//         for(int i = k; i < nums.length; i++){
//             int maxElement = pq.peek();
//             result[i-k] = maxElement;
//             pq.remove(nums[i-k]);
//             pq.add(nums[i]);
//         }

//        result[nums.length-k] = pq.peek();
        if(nums.length==1)
            return nums;
        Deque<Integer> Qi = new LinkedList<Integer>();
        for(int i=0;i<nums.length;i++){
            while(!Qi.isEmpty() && Qi.peekLast() < nums[i])
                Qi.removeLast();
            Qi.offerLast(nums[i]);
            
            if(i>=(k-1)){
                result[j++] = Qi.peekFirst();
                if(!Qi.isEmpty() && Qi.peekFirst() == nums[i-k+1])
                    Qi.removeFirst();
            }
        }
        return result;
    }
}