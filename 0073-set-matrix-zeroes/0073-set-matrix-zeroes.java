class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int arr[][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    for(int l=0;l<n;l++){
                        matrix[l][j]=0;
                    }
                    for(int l=0;l<m;l++){
                        matrix[i][l]=0;
                    }
                    
                }
            }
        }
        
    }
}