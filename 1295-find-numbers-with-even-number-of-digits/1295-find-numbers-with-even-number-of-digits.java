class Solution {
//     optimized solution (no of digits = Math.log10(num)+1)
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int c= (int) Math.log10(n)+1;
            if(c%2==0)
                count++;
        }
        return count;
    }
}