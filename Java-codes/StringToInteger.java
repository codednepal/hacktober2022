public class StringToInteger {
	public int myAtoi(String s) {
		if (s == null)
			return 0;

		// removes leading spaces.
		s = s.trim(); 
		
		if (s.length() == 0)
			return 0;

		int sign = 1;
		
		// Take long here because ans might exceed MAX/MIN.
		long answer = 0; 
		int MAX = Integer.MAX_VALUE;
		int MIN = Integer.MIN_VALUE;

		if (s.charAt(0) == '-')
			sign = -1;

		int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0; // skips an index if sign is there.

		while (i < s.length()) {
			if (!Character.isDigit(s.charAt(i)))
				break; // simply returns 0 if first index is not a digit.

			answer = answer * 10 + (s.charAt(i) - '0');

			if (sign == -1 && answer * -1 < MIN)
				return MIN; // if ans exceeds MIN then simply return MIN according to the question.
			if (sign == 1 && answer > MAX)
				return MAX; // likewise.

			i++;
		}
		return (int) answer * sign; // convert ans to integer and return.
	}
}
