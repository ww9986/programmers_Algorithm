public class base_3 {
	public int solution(int n) { // 3진법 뒤집기
		String tmp = "";
		String tmp1 = "";

		while (n > 0) {
			tmp = (n % 3) + tmp;
			n /= 3;
		}

		for (int i = tmp.length() - 1; i >= 0; i--) tmp1 += tmp.charAt(i);

		return Integer.parseInt(tmp1, 3);
	}
}
