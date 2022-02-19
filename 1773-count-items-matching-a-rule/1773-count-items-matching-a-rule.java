class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int rule=-1;
        
        if(ruleKey.equals("type"))
            rule=0;
        else if(ruleKey.equals("color"))
            rule =1;
        else if(ruleKey.equals("name"))
            rule=2;
        
        int count=0;
        for(int i=0;i<items.size();i++){

            if(ruleValue.equals(items.get(i).get(rule)))count++;
        }
        return count;
    }
}