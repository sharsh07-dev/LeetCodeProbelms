class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

       // merging and sorting block.. 
       
        int len1= nums1.length;
        int len2 = nums2.length;
         int n = len1+len2;
        int [] mergedArray = new int[n];
   
        for(int i =0;i <len1 ;i++){
        mergedArray[i] = nums1[i];
      }
     
        for(int i=0, j=len1;i<len2 ;i++,j++){
        mergedArray[j] = nums2[i];
      }
        Arrays.sort(mergedArray);

        // find median..
        
        if( n % 2 == 0){
               int mid1  = n/2 -1;
              int mid2  =  n/2;
               return (mergedArray[mid1] + mergedArray[mid2])/2.0;
                
        }
        return   mergedArray[n/2];
      
    }
}