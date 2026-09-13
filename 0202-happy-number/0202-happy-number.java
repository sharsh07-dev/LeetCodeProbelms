class Solution {
    public boolean isHappy(int n) {
      
        int slow = n;
        int fast = n;
        do{
            slow = sumOf(slow);
            fast = sumOf(sumOf(fast));
        }
        while(slow != fast);   
           return slow==1;     
        }
       
         public int sumOf(int n) {
            int sum=0;
            while( n!=0 ){
            
            int digit =0;
                digit = n %10;
                sum += digit * digit;
                n = n /10;
        }
       return sum;
         }
    }
