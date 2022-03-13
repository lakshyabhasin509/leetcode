class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       
        
        for(int i=0;i<nums1.length;i++){
             Stack<Integer> stack=new Stack<Integer>();
            for(int j=nums2.length-1;j>=0;j--){
               
                int ans;
                if(stack.isEmpty()){
                    ans=-1;
                }
                else {
                    if(stack.peek()>nums2[j])
                        ans=stack.peek();
                    else{
                        while(!stack.isEmpty() && stack.peek()<=nums2[j]){
                            stack.pop();
                            
                        }
                        if(stack.isEmpty())ans=-1;
                        else ans=stack.peek();
                    }
                }
                stack.push(nums2[j]);
                if(nums1[i]==nums2[j]){
                    nums1[i]=ans;
                break;}
            }
        }
   return nums1; }
}