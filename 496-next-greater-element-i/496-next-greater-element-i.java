class Solution {
//  Optimized using Stack.
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s  = new Stack<>();
        int[] ans = new int[nums1.length];
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            if(s.isEmpty()){
                m.put(nums2[i],-1);
            }
            else if(s.peek()>nums2[i]){
                m.put(nums2[i],s.peek());
            }
            else{
                while(!s.isEmpty() && s.peek()<=nums2[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    m.put(nums2[i],-1);
                }
                else{
                    m.put(nums2[i],s.peek());
                }
            }
            s.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i] = m.get(nums1[i]);
        }
        return ans;
    }
}