class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int indexMin=0;
        int indexMax=(matrix[0].length*matrix.length)-1;
        while(indexMin<=indexMax){
            int mid=indexMin+(indexMax-indexMin)/2;
            int row=mid/matrix[0].length;
            int col=mid%matrix[0].length;
            if(matrix[row][col]==target){ return true;}
            else if(matrix[row][col]<target){indexMin=mid+1;}
            else{indexMax=mid-1;}
        }
        return false;
    }

    
}
