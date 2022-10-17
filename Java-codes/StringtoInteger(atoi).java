class Solution {
    public int myAtoi(String s) {
        if(s==null) return 0;
        
        s = s.trim(); //removes leading spaces.
        if(s.length()==0) return 0;
        
        int sign = 1;
        long ans = 0; //Take long here because ans might exceed MAX/MIN.
        int MAX = Integer.MAX_VALUE;
        int MIN = Integer.MIN_VALUE;
        
        if(s.charAt(0)=='-') sign = -1; 
        
        int i = (s.charAt(0)=='+' || s.charAt(0)=='-') ? 1 : 0; //skips an index if sign is there.
        
        while(i<s.length()){
            if(!Character.isDigit(s.charAt(i))) break; //simply returns 0 if first index is not a digit.
            
            ans = ans * 10 + (s.charAt(i)-'0'); 
            
            if(sign == -1 && ans*-1 < MIN) return MIN; //if ans exceeds MIN then simply return MIN according to the question.
            if(sign == 1 && ans > MAX) return MAX;  //likewise.
            
            i++;
        }
        return (int)ans*sign; //convert ans to integer and return.
    }
}
