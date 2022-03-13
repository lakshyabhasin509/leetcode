class Solution {
    public String removeOuterParentheses(String s) {
       StringBuilder changed=new StringBuilder();
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(!stack.isEmpty())
                    changed.append(ch);
                stack.push(ch);
            }
            else{
stack.pop();                
                if(!stack.isEmpty()){

                    changed.append(')');
                }
            }
        }
        return changed.toString();
    }
}