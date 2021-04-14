import java.util.*;

public class sports_clothing { // 체육복
	public int solution(int n, int[] lost, int[] reserve) {
		ArrayList<Integer> lostList = new ArrayList<>();
		ArrayList<Integer> reserveList = new ArrayList<>();
		ArrayList<Integer> tmp_List = new ArrayList<>();

		for (int num : lost) lostList.add(num);
		for (int num : reserve) reserveList.add(num);

		for (int i = 0; i < lostList.size(); i++) {
			for (int num : reserveList) {
				if (num == lostList.get(i)) {
					tmp_List.add(num);
					lostList.remove(i);
					i = -1;
					break;
				}
			}
		}

		for (int i = 0; i < reserveList.size(); i++) {
			for (int num : tmp_List) {
				if (num == reserveList.get(i)) {
					reserveList.remove(i);
					i = -1;
					break;
				}
			}
		}

		for (int num : reserveList) {
			for (int j = 0; j < lostList.size(); j++) {
				//System.out.println(lostList.get(j));
				if (((num - 1 == lostList.get(j)) || (num + 1 == lostList.get(j)))) {
					lostList.remove(j);
					break;
				}
				if (lostList.size() == 0) break;
			}
		}

		return n - lostList.size();
	}
}
