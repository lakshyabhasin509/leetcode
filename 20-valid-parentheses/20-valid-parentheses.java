class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else if(ch=='}'||ch==']'||ch==')'){

                if(stack.isEmpty())return false;
            char check=stack.pop();
                if(check=='{' && ch!='}' )return false;
                if(check=='(' && ch!=')' )return false;
                if(check=='[' && ch!=']' )return false;
            }
        }
        
       return stack.isEmpty();
    }
}