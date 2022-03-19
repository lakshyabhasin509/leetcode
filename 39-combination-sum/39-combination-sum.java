class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        helper(candidates,0,target,list,new ArrayList<Integer>());
        return list;
    }
    public void helper(int []candidates ,int i,int target,List<List<Integer>> Main,List<Integer> internal){
        if(target==0){

        Main.add(new ArrayList<>(internal));
            return;
        }
        if(target<0 || i>candidates.length-1)return;
        
        helper(candidates,i+1,target,Main,internal);
        internal=new ArrayList<>(internal);
        internal.add(candidates[i]);
        helper(candidates,i,target-candidates[i],Main,internal);
    }
}