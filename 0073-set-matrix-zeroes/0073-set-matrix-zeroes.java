// class Solution {
//     public void setZeroes(int[][] matrix) {
//         // first i will make all the elements of rows and colums as -1 if zero occurs.
//         // after that i will create an one more matrix where i will put those element as -1 to 0 and that will be my answer.
//         int n = matrix.length; // row
//         int m = matrix[0].length; //col
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (matrix[i][j] == 0) {
//                     for (int k = 0; k < n; k++) {
//                         matrix[k][j] = -1; // row  marking
//                     }
//                     for (int k = 0; k < m; k++) {
//                         matrix[i][k] = -1; // col marking
//                     }
//                 }
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (matrix[i][j] == -1) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }
// }



class Solution {
    public void setZeroes(int[][] matrix) {
       int n = matrix.length;
       int m = matrix[0].length;

       boolean row[]  = new boolean[n];
       boolean col[] = new boolean[m];

       for( int i =0 ; i < n ;i++){ // marked all zeros.
            for( int j=0 ; j < m; j++){
                if(matrix[i][j] ==0 ){
                    row[i] = true;
                    col[j] = true;
                }
            }
       }
       

       for( int i =0 ; i < n ;i++){ // marked all zeros.
            for( int j=0 ; j < m; j++){
                if( row[i] || col[j]){
                   matrix[i][j] = 0; 
                }
            }
       }
    }
}