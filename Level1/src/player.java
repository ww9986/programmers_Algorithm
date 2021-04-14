import java.util.*;

public class player { // 완주하지 못한 선수
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> answerMap = new HashMap<>();
		for (String name : participant)
			answerMap.put(name, answerMap.getOrDefault(name, 0) + 1);
		for (String name : completion)
			answerMap.put(name, answerMap.get(name) - 1);

		for (String name : answerMap.keySet()) {
			if (answerMap.get(name) != 0) {
				answer = name;
				break;
			}
		}


		return answer;
	}
}
