
        
 class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<Integer>();
for (int element : arr) {
	if (seen.contains(element * 2) || (element % 2 == 0 && seen.contains(element / 2))) {
		return true;
	}
	seen.add(element);
}
return false;
    }
}


