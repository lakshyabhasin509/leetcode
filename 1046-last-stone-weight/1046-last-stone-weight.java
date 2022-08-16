class Solution {
//     class max implements Comparable<Integer>{
//         int compare(Integer i1,Integer i2){
            
//         }
//     }
    public int lastStoneWeight(int[] stone) {
        if(stone.length==1)return stone[0];
        Queue<Integer> PQ=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<stone.length;i++){
            PQ.add(stone[i]);
        }
        while(PQ.size()>1){
            int stone1=PQ.poll();
            int stone2=PQ.poll();
            int collision=Math.abs(stone1-stone2);
            if(collision>0){
                PQ.add(collision);
            }
        }
        if(PQ.isEmpty())return 0;
        return PQ.peek();
    }
}