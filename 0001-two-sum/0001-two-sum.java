class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer>  maps = new HashMap <> ();
        for(int i =0; i< nums.length ; i++){
            int current = nums[i];
            int more = target - nums[i] ;
            if(maps.containsKey(more)){
                return new int [] {maps.get(more),i} ;
            }
            maps.put(nums[i], i);
        }
     return  new int [] {};
    }
}