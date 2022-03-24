class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        calculate(0,candidates,list,new ArrayList<>(),target);
        return list;
    }
    public void calculate(int ind,int arr[],List<List<Integer>> list,List<Integer> t,int target){
        if(target==0){
            list.add(new ArrayList<>(t));
            return;
        }
       
        
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1])continue;
            if(arr[i]>target)break;
        t.add(arr[i]);
            calculate(i+1,arr,list,t,target-arr[i]);
            t.remove(t.size()-1);
            
        }
    }
}