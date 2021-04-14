public class center_letter {
	public String solution(String s) { // 가운데 글자 가져오기
		String answer;
		int center = s.length() / 2;

		if (s.length() % 2 == 0)
			answer = s.substring(center-1, center + 1);
		else
			answer = s.substring(center, center + 1);

		return answer;
	}
}
