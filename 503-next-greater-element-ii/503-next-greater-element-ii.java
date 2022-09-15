class Solution {
   public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        for(int i=nums.length-2;i>=0;i--){
            stack.push(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            int n=nums[i];
            if(stack.isEmpty()){
                nums[i]=-1;
            }
            else if(stack.peek()>nums[i]){
                nums[i]=stack.peek();
            }
            else{
                while (!stack.isEmpty() && stack.peek() <=nums[i]){
                    stack.pop();
                }
                if(stack.isEmpty())nums[i]=-1;
                else nums[i]=stack.peek();

            }
            stack.push(n);
        }
        return nums;
    }
}