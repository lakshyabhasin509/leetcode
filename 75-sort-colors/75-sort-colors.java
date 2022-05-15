class Solution {
    public void sortColors(int[] nums) {
       int [] colors=new int[3];
        for(int i :nums){
            colors[i]++;
        }
        int k=0;
        for(int i=0;i<nums.length;i++){
            while(k<3 && colors[k]==0)k++;
            if(colors[k]!=0){
                nums[i]=k;
                colors[k]--;
            }
            
            
        }
    }
}