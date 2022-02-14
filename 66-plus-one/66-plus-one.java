class Solution {
    public int[] plusOne(int[] digits) {
    int carry=0;
        int i=digits.length-1;
        while(i>=0){
            if(digits[i]+1>9)
            {
                carry=1;
                digits[i]=0;
                i--;
                
            }
            else {
                carry=0;
                digits[i]=digits[i]+1;
            }
            if(carry==0)break;
                
            
        }
        
        if(i==-1){
            int []arr=new int[digits.length+1];
            arr[0]=1;
          for(int j=1;j<arr.length;j++)
              arr[j]=digits[j-1];
            return arr;
        }
        return digits;
    }
}