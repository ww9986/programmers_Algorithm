import java.util.*;

public class descending { // 내림차순
	public String solution(String s) {
		String answer = "";
		Character[] arr = new Character[s.length()];

		for (int i = 0; i < s.length(); i++)
			arr[i] = s.charAt(i);

		Arrays.sort(arr, Collections.reverseOrder());
		for (char ch : arr)
			answer += ch;

		return answer;
	}
}
