public class year_2016 { // 2016년
	public String solution(int a, int b) {
		String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		int month = 1, dayOfMonth = 1;

		while (!((a == month) && (b - dayOfMonth < 7))) {
			dayOfMonth += 7;
			if (dayOfMonth > 31) {
				switch (month) {
					case 1, 3, 5, 7, 8, 10, 12 -> dayOfMonth -= 31;
					case 4, 6, 9, 11 -> dayOfMonth -= 30;
					case 2 -> dayOfMonth -= 29;
				}
				month++;
			}
		}

		if (b - dayOfMonth < 0) return day[7 + b - dayOfMonth];
		else return day[b - dayOfMonth];
	}
}
