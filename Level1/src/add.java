import java.util.*;

public class add { // 두개 뽑아서 더하기
	public int[] solution(int[] numbers) {
		int[] answer;
		ArrayList<Integer> plus = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++)
				plus.add(numbers[i] + numbers[j]);
		}

		TreeSet<Integer> Tree_result = new TreeSet<>(plus); // TreeSet에 arr데이터 삽입
		ArrayList<Integer> result = new ArrayList<>(Tree_result); // 중복이 제거된 HashSet을 다시 ArrayList에 삽입

		answer = new int[result.size()];
		int i = 0;
		for (Integer tmp : result)
			answer[i++] = tmp;

		return answer;
	}
}
