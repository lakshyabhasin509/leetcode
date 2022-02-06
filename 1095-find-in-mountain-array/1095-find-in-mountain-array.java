/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=peakIndexInMountainArray(mountainArr);
        int firstTry=orderAgnosticBS(mountainArr,target,0,peak);
        if(firstTry!=-1)
        {
            return firstTry;
        }
        else return orderAgnosticBS(mountainArr,target,peak,mountainArr.length()-1);
    }
         int peakIndexInMountainArray(MountainArray arr) {


        int start=0;
        int end=arr.length()-1;
        int mid;

        while (start<=end){
            mid=start+((end-start)/2);
            if (arr.get(mid)<arr.get(mid+1))
            { start=mid+1;
          }
            else{

                end=mid;
            }
            if(start==end)
                break;
        }
       return start;
    }
    
        int orderAgnosticBS(MountainArray arr, int target,int start,int end) {

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr.get(start) < arr.get(end);

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr.get(mid) == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr.get(mid) ){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    }
