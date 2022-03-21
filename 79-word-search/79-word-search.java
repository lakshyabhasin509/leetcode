class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(search(board,i,j,word,0))return true;
                }
            }
        }
        return false;
    }
public boolean search(char[][] arr,int i,int j,String word,int index){
    if(index==word.length())return true;
    if(i<0 || j<0|| i>=arr.length||j>=arr[0].length||arr[i][j]!=word.charAt(index))return false;
    
    char ch=arr[i][j];
    arr[i][j]='/';
        
        boolean right=search(arr,i,j+1,word,index+1);
        boolean left=search(arr,i,j-1,word,index+1);
        boolean down=search(arr,i+1,j,word,index+1);
        boolean up=search(arr,i-1,j,word,index+1);
    arr[i][j]=ch;
    
    return right||left||down||up;
}


}

