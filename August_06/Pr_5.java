
public class Pr_5 {
	public String longestPalindrome(String s) {
		int start = 0, end = 0;
		if (s.length() < 1 || s == null)
			return "";
		for (int i = 0; i < s.length(); i++) {
			int len1 = isValid(s, i, i);
			int len2 = isValid(s, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return s.substring(start, end + 1);
	}

	public int isValid(String s, int st, int e) {
		while (st>= 0 && e < s.length() && s.charAt(st) == s.charAt(e)) {
			st--;
			e++;
		}
		return e - st - 1;
	}

	public static void main(String args[]) {
		String s = "abbbba";
		Pr_5 obj = new Pr_5();
		String res = obj.longestPalindrome(s);
		System.out.println(res);
	}
}
