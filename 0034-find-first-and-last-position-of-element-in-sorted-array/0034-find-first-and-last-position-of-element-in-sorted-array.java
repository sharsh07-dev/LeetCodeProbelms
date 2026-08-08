class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int [] {startIndex(nums,target),endIndex(nums,target)};
    }

 public int startIndex(int [] nums, int target){

        int n = nums.length;
        int s =0;
        int e = n-1;
        int mid =0;
        int ans =-1;
        while( s <=e){

            mid = s+(e-s) /2;

            if( nums[mid] == target){
                ans = mid;
                e= mid-1;
            }
            else if( nums[mid] > target){
                e = mid-1;
            }
            else{
                s =mid+1;
            }
           
        }
         return ans;
    }

    public int endIndex( int [] nums, int target){
         int s =0;
             int n = nums.length;
         int e = n-1;
           int mid =0;
           int ans =-1;
         while( s <= e){

            mid = s+(e-s) /2;

            if( nums[mid] == target){
                ans= mid;
                s = mid+1;
            }
            else if( nums[mid] > target){
                e = mid-1;
            }
            else{
                s =mid+1;
            }
           
        }
         return ans;
    }
}