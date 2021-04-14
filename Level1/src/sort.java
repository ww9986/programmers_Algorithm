import java.util.*;

public class sort { // 내 마음대로 정렬하기
	public String[] solution(String[] strings, int n) {

		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				char ch1 = s1.charAt(n);
				char ch2 = s2.charAt(n);

				if(ch1==ch2) return s1.compareTo(s2);
				else return ch1-ch2;
			}
		});
		return strings;
	}
}
