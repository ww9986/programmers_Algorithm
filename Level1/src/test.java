import java.util.ArrayList;

public class test { // 모의고사
	public int[] solution(int[] answers) {
		int[] std1 = {1, 2, 3, 4, 5};
		int[] std2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] std3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int std1_cnt = 0, std2_cnt = 0, std3_cnt = 0, max;
		ArrayList<Integer> winners = new ArrayList<>();

		std1_cnt = count(answers, std1, std1_cnt);
		std2_cnt = count(answers, std2, std2_cnt);
		std3_cnt = count(answers, std3, std3_cnt);

		max = Math.max(Math.max(std1_cnt, std2_cnt), std3_cnt);

		if (max == std1_cnt) winners.add(1);
		if (max == std2_cnt) winners.add(2);
		if (max == std3_cnt) winners.add(3);

		return winners.stream().mapToInt(i->i).toArray();
	}

	int count(int[] answers, int[] students, int counter) {
		int i = 0;
		for (int num : answers) {
			if (i == students.length) i = 0;
			if (students[i] == num) counter++;
			i++;
		}

		return counter;
	}
}
