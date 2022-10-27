class Solution {
    public List<String> letterCombinations(String digits) {
        String array[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()==0)return new ArrayList<>();
        return solve(digits,"",array);
    }
    
    public List<String> solve(String digits,String res,String array[]){
        if(digits.length()==0){
            List<String> temp=new ArrayList<>();
            temp.add(res);
            return temp;
        }
        List<String> temp=new ArrayList<>();
        
        String charInkey=array[digits.charAt(0)- '0'];
        for(int i=0;i<charInkey.length();i++){
           temp.addAll(solve(digits.substring(1),res+charInkey.charAt(i),array));
        }
        
        return temp;
    }
}