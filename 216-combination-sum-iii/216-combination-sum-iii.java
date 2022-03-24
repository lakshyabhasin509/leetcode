class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list=new ArrayList<>();
        calculate(1,k,n,list,new ArrayList<>());
        return list;
    }
    public void calculate(int counter,int k,int target,List<List<Integer>> list,List<Integer>t){
       if(k==t.size())
        if(target==0){
            list.add(new ArrayList<>(t));
            return;
        }
        if(target<0 || counter>9)return;
        
        calculate(counter+1,k,target,list,t);
        t=new ArrayList<>(t);
        t.add(counter);
        calculate(counter+1,k,target-counter,list,t);
        
    }
}