class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        
        
        while(start<end){
            int mid=start+(end-start)/2;
            
        int sum=numbers[start]+numbers[end];
        if(sum==target)return new int[]{start+1,end+1};
        else if(sum>target){
            if(target<(numbers[start]+numbers[mid]))
                end=mid-1;
            else if(target==(numbers[start]+numbers[mid]))return new int[]{start+1,mid+1};
            else end--;
        }
        else{
           if(target>(numbers[end]+numbers[mid])){
               start=mid+1;
           }
            else if(target==(numbers[end]+numbers[mid]))return new int[]{mid+1,end+1};
            else start++;
        }
        }
        return new int[2];
    }
}