import java.util.*;

public class rest { // 나누어 떨어지는 숫자 배열
	public int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> result = new ArrayList<>();

		for (int num : arr)
			if (num % divisor == 0) result.add(num);
		if (result.size() == 0) result.add(-1);

		Collections.sort(result);

		return result.stream().mapToInt(i -> i).toArray();
	}
}
