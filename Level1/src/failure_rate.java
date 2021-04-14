import java.util.*;

public class failure_rate { // 실패율
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int len = stages.length;
        double cnt = 0;
        Map<Integer, Double> fail = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            for (int stage : stages)
                if (stage == i) cnt++;
            if (cnt == 0)
                fail.put(i, 0.0);
            else
                fail.put(i, cnt / len);
            len -= (int) cnt;
            cnt = 0;
        }
        List<Integer> keySetList = new ArrayList<>(fail.keySet());

        Collections.sort(keySetList, (o1, o2) -> (fail.get(o2).compareTo(fail.get(o1))));
        for (int i = 0; i < keySetList.size(); i++) {
            answer[i] = keySetList.get(i);
        }

        return answer;
    }
}
