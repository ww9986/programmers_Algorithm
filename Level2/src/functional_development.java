import java.util.*;
import java.util.stream.Collectors;

public class functional_development { // 기능 개발
    public int[] solution(int[] progresses, int[] speeds) {
        int cnt = 0;
        List<Integer> progressList = Arrays.stream(progresses).boxed().collect(Collectors.toList());
        List<Integer> speedList = Arrays.stream(speeds).boxed().collect(Collectors.toList());
        List<Integer> answerList = new ArrayList<>();


        while (progressList.size() != 0) {
            while (progressList.get(0) < 100) {
                for (int i = 0; i < progressList.size(); i++)
                    progressList.set(i, progressList.get(i) + speedList.get(i));
            }

            while (progressList.size() != 0) {
                if (100 <= progressList.get(0)) {
                    cnt++;
                    progressList.remove(0);
                    speedList.remove(0);
                } else
                    break;
            }
            answerList.add(cnt);
            cnt = 0;
        }
        return answerList.stream().mapToInt(j -> j).toArray();
    }
}
