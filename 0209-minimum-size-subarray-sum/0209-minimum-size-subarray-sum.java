class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int low =0;
        int high=0;
        int len = 0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        int n = nums.length;
        while(high < n){
            sum =sum + nums[high];
                while(sum >= target){
                    len = high - low+1;
                    res = Math.min(res,len);
                    sum = sum - nums[low];
                    low++;
                }
                high++;
        }
        if(res !=Integer.MAX_VALUE ){
            return res;
        }
        return 0;
    }
}