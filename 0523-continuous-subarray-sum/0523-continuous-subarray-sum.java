// class Solution { Brute Force [TLE]
//     public boolean checkSubarraySum(int[] nums, int k) {

//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             int sum = nums[i];
//             for (int j = i + 1; j < n; j++) {
//                 sum += nums[j];
//                 if (sum % k == 0) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap <Integer,Integer> mpp = new HashMap <>();
        mpp.put(0,-1);
        int sum =0;
        
       for(int i= 0 ;i < nums.length ; i++){
        
             sum += nums[i];       
            int rem = sum % k;
            if(mpp.containsKey(rem)){

                if(i - mpp.get(rem) >= 2){
                    return true;
                }
            }
            else{
               mpp.put(rem,i);
            }

    }
    return false;
}}