class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int row = matrix.length;
      int col = matrix[0].length;
      int arr[] = new int[row*col];
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[i*col+j] = matrix[i][j];
        }
      }
      int low=0;
      int high = arr.length-1;
      while(low<=high){
        int mid = (low+high)/2;
        if(target==arr[mid]) return true;
        if(target<arr[mid]){
            high=mid-1;
        }
        else{
            low = mid+1;
        }
      }
      return false;
    }
}