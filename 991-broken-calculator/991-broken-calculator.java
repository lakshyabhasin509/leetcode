class Solution {
    public int brokenCalc(int startValue, int target) {
        		int counter = 0;
        while (startValue<target){
            if (target%2 == 0){
                target = target /2;
            }else {
                target = target + 1;
            }
            counter++;
        }

        counter += startValue - target;
        return counter;
    }
}