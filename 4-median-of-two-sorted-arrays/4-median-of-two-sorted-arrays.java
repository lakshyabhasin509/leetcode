class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            arr[i+nums1.length]=nums2[i];
        }
        
       
        Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));
         int mid=(0+(arr.length-1))/2;
        double ans=-1;
        
        if(arr.length%2==0){
           ans=((double)arr[mid]+(double)arr[mid+1])/2.0;
            
        }
        else 
        {System.out.println(arr[mid]);
            ans=(double)arr[mid];
        }
        return ans;
    }
}