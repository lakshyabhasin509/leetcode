class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
   Arrays.sort(nums);
   List<List<Integer>> res = new LinkedList<>();
   
   for (int i = 0; i < nums.length; i++) {
       if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { //remove duplicates
           int target = - nums[i];
           int j = i + 1;
           int k = nums.length - 1;
       
           while (j < k) {
               if (nums[j] + nums[k] == target) {
                   res.add(Arrays.asList(nums[i], nums[j], nums[k]));
				   //remove duplicates
                   while (j < k && nums[j] == nums[j + 1]) j++;
                   while (j < k && nums[k] == nums[k - 1]) k--;
                   j++;
                   k--;
               } else if (nums[j] + nums[k] < target) {
                   j++;
               } else {
                   k--;
               }
           }
       }
   }
     return res;
  }
}