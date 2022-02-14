class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int arr[]=new int[nums.length];
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int temp=0;
        for(int i:list){
            arr[temp++]=i;
        }
    return arr;}
}