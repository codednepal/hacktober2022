class Solution {
	public int reverse(int x) {
		int reversedNumber = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			if (reversedNumber > Integer.MAX_VALUE / 10 || (reversedNumber == Integer.MAX_VALUE / 10 && pop > 7))
				return 0;
			if (reversedNumber < Integer.MIN_VALUE / 10 || (reversedNumber == Integer.MIN_VALUE / 10 && pop < -8))
				return 0;
			reversedNumber = reversedNumber * 10 + pop;
		}
		return reversedNumber;
	}
}
