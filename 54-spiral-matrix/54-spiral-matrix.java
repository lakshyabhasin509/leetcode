class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list =new ArrayList<Integer>();
    int top=0,left=0,right=matrix[0].length-1,bottom=matrix.length-1;
        
        int counter=0;
        int noOfElements=matrix[0].length*matrix.length;
        
        while(counter<noOfElements){
            for(int i=left;i<=right&&counter<noOfElements;i++){
                list.add(matrix[top][i]);
                counter++;
            }
            top++;
            for(int i=top;i<=bottom &&counter<noOfElements;i++){
                
                list.add(matrix[i][right]);
                counter++;
            }
        right--;
            for(int i=right;i>=left&&counter<noOfElements;i--){
                
                list.add(matrix[bottom][i]);
                counter++;
            }
            bottom--;
            for(int i=bottom;i>=top&&counter<noOfElements;i--){
                
                list.add(matrix[i][left]);
                counter++;
            }
            left++;
    }
        return list;
        
}
}