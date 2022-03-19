class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        return subsetIterDup(nums);
    
}
    public List<List<Integer>> subsetIterDup(int[] arr){

        List<List<Integer>> list=new ArrayList<List<Integer>>();

        list.add(new ArrayList<>());

        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=0;
            int n=list.size();
            if(i>0 &&arr[i]==arr[i-1]){
                start=end+1;
            }
            end=n-1;
            for(int j=start;j<n;j++){
                List<Integer> temp=new ArrayList<>(list.get(j));
                temp.add(arr[i]);
                list.add(temp);
            }
        }
        return list;
    }
}