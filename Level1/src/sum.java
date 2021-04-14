public class sum { // 두 정수 사이의 합
	public long solution(int a, int b) {
		long answer = 0;
		int tmp = 0;

		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}

		for (int i = a; i <= b; i++) answer += i;

		return answer;
	}
}
