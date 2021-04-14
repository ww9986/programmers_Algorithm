public class dealing_with_strings { // 문자열 다루기 기본
	public boolean solution(String s) {
		if ((s.length() != 4) && (s.length() != 6)) return false;

		for (int i = 0; i < s.length(); i++)
			if (!(48 <= (int) s.charAt(i) && ((int) s.charAt(i) <= 57))) return false;

		return true;
	}
}
