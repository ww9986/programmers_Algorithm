public class digits_plus { // 자리수 더하기
    public int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);

        for (int i = 0; i < num.length(); i++)
            answer += Integer.parseInt(String.valueOf(num.charAt(i)));

        return answer;
    }
}
