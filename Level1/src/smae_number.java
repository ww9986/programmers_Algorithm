import java.util.*;

public class smae_number { // 같은 숫자는 싫어
	public int[] solution(int[] arr) {
		ArrayList<Integer> result = new ArrayList<>();
		int num = -1;

		for (int number : arr) {
			if (num != number) {
				result.add(number);
				num = number;
			}
		}

		return result.stream().mapToInt(i -> i).toArray();
	}
}
