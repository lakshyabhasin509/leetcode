public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
   
        list.add(new ArrayList<>());

       for(int i:nums){
           int n=list.size();
           for(int j=0;j<n;j++){
           List<Integer> temp=new ArrayList<>(list.get(j));
           temp.add(i);
               list.add(temp);
           }
       }
        return list;
    }
//     iterative answer
}