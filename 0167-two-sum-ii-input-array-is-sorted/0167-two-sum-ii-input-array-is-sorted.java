class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n= numbers.length;
        int low =0 ;
        int high =n-1;

        while(low < high){
           int calculate = numbers[low]+numbers[high];
            if(calculate == target){
                 return new int [] {low+1,high+1};
            }
            else if(calculate > target){
                    high--;
            }
            else if(calculate < target){
                low++;
            }
        }
      
       return new int [] {-1,-1};  }
       
    }
