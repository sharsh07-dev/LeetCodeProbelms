class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
    int maxLength =0;
        for( int i =0 ; i < n ; i++){
            int [] arr = new int [255];
            for( int j=i ; j<n ; j++){
                char ch = s.charAt(j);
                if(arr[ch] != 0){
                   break;
                }
                 arr[ch]++;
                 maxLength = Math.max(maxLength,j-i+1);
                
            }
        }
        return maxLength;
    }
}