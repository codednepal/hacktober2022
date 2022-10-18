class Solution {
public boolean isPalindrome(int x) {
int i = x;
int num = 0;
while(i>=1) {
int rem = i%10;
num = num*10+rem;
i=i/10;
}
return num==x;
}
}
