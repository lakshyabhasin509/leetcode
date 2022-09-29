class Solution(object):
    def setZeroes(self, matrix):
        R=len(matrix)
        C=len(matrix[0])
        isCol = False
        for i in range(R):
            if matrix[i][0]==0 :
                isCol=True
            for j in range(1,C):
                if matrix[i][j]==0:
                    matrix[i][0]=0
                    matrix[0][j]=0
            
           
            
        for i in range(1,R):
            for j in range(1,C):
                if(matrix[i][0]==0 or matrix[0][j]==0):
                    matrix[i][j]=0;
        
        if matrix[0][0]==0:
            for j in range(C):
                    matrix[0][j]=0
            
        if isCol:
            for i in range(R):
                matrix[i][0]=0