import java.util.*;

public class new_id { // 신규 아이디 추천
	List<String> list;

	public String solution(String new_id) {
		StringBuilder answer = new StringBuilder();
		list = new ArrayList<>(Arrays.asList(new_id.toLowerCase().split(""))); // level 1

		level_2();
		level_3();
		level_4();
		level_5();
		level_6();
		level_7();

		for (String str : list) {
			answer.append(str);
		}

		return answer.toString();
	}

	void level_2() {
		String str;
		char ch;
		for (int i = 0; i < list.size(); i++) {
			str = list.get(i);
			ch = str.charAt(0);

			if (!(((48 <= ch) && (ch <= 57)) || ((97 <= ch) && (ch <= 122)) || (ch == '-') || (ch == '_') || (ch == '.'))) {
				list.remove(i);
				i--;
			}
		}
	}

	void level_3() {
		for (int i = 0; i < list.size() - 1; i++) {
			if ((list.get(i).equals(".")) && (list.get(i + 1).equals("."))) {
				list.remove(i);
				i--;
			}
		}
	}

	void level_4() {
		while (true) {
			if (list.get(0).equals("."))
				list.remove(0);
			if (list.size() != 0) {
				if (list.get(list.size() - 1).equals("."))
					list.remove(list.size() - 1);
			}
			if (list.size() != 0) {
				if (!((list.get(0).equals(".")) && (list.get(list.size() - 1).equals("."))))
					break;
			} else
				break;
		}
	}

	void level_5() {
		if (list.size() == 0) {
			list.add("a");
			level_4();
		}
	}

	void level_6() {
		List<String> list1 = new ArrayList<>();
		if (16 <= list.size()) {
			for (int i = 0; i < 15; i++)
				list1.add(list.get(i));
			list.clear();

			for (String str : list1)
				list.add(str);
			level_4();
		}
	}

	void level_7() {
		int num = list.size() - 1;
		while (list.size() <= 2)
			list.add(list.get(num));
		level_4();
	}
}