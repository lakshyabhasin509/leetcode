class Solution {
    Set<Integer> set=new HashSet<>();
    List<List<Integer>> rooms;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if(rooms.size()==0 || rooms==null)return false;
        if(rooms.size()==1)return true;
        
        this.rooms=rooms;
        set.add(0);
        exploreKeys(rooms.get(0));
        
        return set.size()==rooms.size();
    }
    void exploreRoom(int room){
        set.add(room);
        exploreKeys(rooms.get(room));
    }
        
    void exploreKeys(List<Integer> keys){
        for(int i:keys){
            if(!set.contains(i)){
                exploreRoom(i);
            }
        }
    }
}