public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();

        helper(nums,0,temp,list);
        return list;
    }
    public void helper(int[]arr,int i,List<Integer> temp,List<List<Integer>> list){
        if(i>=arr.length){
            List<Integer> t=new ArrayList<>(temp);
            list.add(t);
            return;}
//         skip adding
        helper(arr,i+1,temp,list);
        List<Integer> t=new ArrayList<>(temp);
        t.add(arr[i]);
        helper(arr,i+1,t,list);

    }
}