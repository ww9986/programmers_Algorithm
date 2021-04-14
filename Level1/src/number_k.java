import java.util.*;

public class number_k { // k번째수
	public int[] solution(int[] array, int[][] commands) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int[] command : commands) answer.add(slice(array, command));

		return answer.stream().mapToInt(i -> i).toArray();
	}

	int slice(int[] array, int[] commands) {
		int i = commands[0] - 1, j = commands[1] - 1, k = commands[2] - 1;
		int[] arr = new int[j - i + 1];

		for (int num = 0; num < arr.length; num++) {
			arr[num] = array[i];
			i++;
		}

		Arrays.sort(arr);

		return arr[k];
	}
}
