class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int res=0;
        for(int i=0;i<tokens.length;i++){
            
            try{
               int num=Integer.parseInt(tokens[i]);
                stack.push(num);
            }catch(NumberFormatException e){
                int b=stack.pop();
                int a=stack.pop();
                
                
                if(tokens[i].equals("+"))res=a+b;
                if(tokens[i].equals("*"))res=a*b;
                if(tokens[i].equals("-"))res=a-b;
                if(tokens[i].equals("/"))res=a/b;
                
                System.out.println(res);
                stack.push(res);
            }
        }
        return stack.pop();
    }
}