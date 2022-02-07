class Solution {
    public boolean search(int[] nums, int target) {
        
        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            
            int BS=binarySearch(nums, target, 0 , nums.length - 1);
                if(BS!=-1)
                    return true;
            else return false;
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return true;
        }

        if (target >= nums[0]) {
            int BS=binarySearch(nums, target, 0, pivot - 1);
        if(BS!=-1)
                    return true;
            else return false;
        }

        else if(binarySearch(nums, target, pivot + 1, nums.length - 1)!=-1)
            return true;
             else return false;
    }

    int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
// for duplicates
     int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[start]==arr[end])
            {
                if(start<end && arr[start]>arr[start+1])
                    return start;
                start=start+1;
            
                if(end >start && arr[end]<arr[end-1])
                    return end;
                end--;
                
            }
            else if(arr[start]<arr[mid] ||(arr[mid]==arr[start]&& arr[end]<arr[start]))
                start=mid+1;
            else end=mid-1;
            
        }
        return -1;
    }}
