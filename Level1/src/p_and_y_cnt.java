public class p_and_y_cnt { // 문자열 내 p와 y의 개수
	boolean solution(String s) {
		boolean answer = true;
		int p_count = 0, y_count = 0;
		char a;

		for (int i = 0; i < s.length(); i++) {
			a = s.charAt(i);
			if ((a == 'p') || (a == 'P')) p_count++;
			else if ((a == 'y') || (a == 'Y')) y_count++;
		}

		return p_count == y_count;

	}
}