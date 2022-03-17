class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
    public void reverse(char[]s,int i,int j){
        if(i>j)return ;
        
        swap(s,i,j);
        i++;
        j--;
        reverse(s,i,j);
    }
    public void swap(char[]s,int i,int j){
        char temp=s[j];
        s[j]=s[i];
        s[i]=temp;
    }
}