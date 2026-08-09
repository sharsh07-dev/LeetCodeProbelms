class Solution {
    public int search(int[] nums, int target) {

            int l =0;
            int h= nums.length-1;
            int pivot = pivotIndex(nums);

            if(pivot == -1){

                return BinarySearch(nums,target,l,h);
            }

            if( nums[pivot] == target){
                return pivot;
            }
            if( target >= nums[l]){

               return  BinarySearch(nums,target ,l,pivot-1);
            }
          
         return   BinarySearch(nums,target ,pivot+1,h);
         
            
       
    }
    public int BinarySearch(int[] nums, int target , int l ,int h) {
   
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (target == nums[mid]) {
                return mid;
            }
           else if (nums[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public int pivotIndex (int [] nums){
        
        int l=0;
        int h= nums.length-1;
          int pivot =-1;
        while( l <= h){
      
        int mid = l + ( h - l) /2;

        if( mid < h && nums[mid] > nums[mid+1]){
          return mid;
        }
        else if(mid > l && nums[mid-1] > nums[mid]){
            return mid-1;
        }
        else if(nums[l] <= nums[mid]){
            l = mid+1;
        }
     if(nums[h] >= nums[mid]){
            h = mid-1;
        }
      
    }
    return -1;
}
}