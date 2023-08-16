class Solution {
    public char findTheDifference(String s, String t) {
        int ssum=0,tsum=0;
        for(int i=0;i<t.length();i++){
            if(i<s.length())
            ssum+=s.charAt(i);
            tsum+=t.charAt(i);
        }
        
        return (char)(tsum-ssum);
    }
}