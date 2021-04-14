import java.util.*;

public class flip_number { // 자연수 뒤집어 배열로 만들기
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];

        for (int i = num.length() - 1; i >= 0; i--) {
            list.add(Integer.parseInt(String.valueOf(num.charAt(i))));
        }
        for (int a : list) {
            answer[cnt] = a;
            cnt++;
        }
        return answer;
    }
}

