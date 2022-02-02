class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int c=0;
            while(n!=0){
                int d=n%10;
                n=n/10;
                c++;
            }
            if(c%2==0)
                count++;
        }
        return count;
    }
}