class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> que=new PriorityQueue<>();
        
        for(int i=0;i<nums.length;i++){
            que.add(nums[i]);
            if(que.size()>k)que.poll();
        }
        return que.poll();
    }
}