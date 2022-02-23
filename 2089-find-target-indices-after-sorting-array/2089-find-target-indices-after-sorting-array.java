class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<Integer>();
        int index=BinarySearch(nums,target);
        if(index==-1)
            return list;
        for(int i=index;i<nums.length;i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
        return list;
    }
    int BinarySearch(int arr[],int key){
        ArrayList<Integer> list =new ArrayList<Integer>();
          int start=0;
        int end=arr.length-1;
        int mid;

        while (start<=end){
            mid=start-((start-end)/2);
            if(arr[mid]==key){
                if(mid>0&&arr[mid-1]==key){
                    end=mid-1;
                }
                else {
                  return mid;
                    
                }
                
            }
            else if (arr[mid]<key)
                start=mid+1;
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}