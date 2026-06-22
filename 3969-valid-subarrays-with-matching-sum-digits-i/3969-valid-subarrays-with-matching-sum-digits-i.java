class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            long sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(valid(sum, x)){
                    c += 1;
                }
            }
        }
        return c;
    }
    public static boolean valid(long sum, int x){
        long lastDigit = sum % 10;
        int length = 0;
        long n1 = sum;
        while(n1 != 0){
            length++;
            n1 = n1 / 10;
        } 
        long firstDigit = sum / (long)Math.pow(10, length-1);
        if(firstDigit == x && lastDigit == x){
            return true;
        }
        return false;
    }
}