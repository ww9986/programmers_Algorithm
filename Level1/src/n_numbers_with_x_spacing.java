public class n_numbers_with_x_spacing { //x만큼 간격이 있는 n개의 숫자
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = x;

        for (int i = 0; i < n; i++) {
            answer[i] = sum;
            sum += x;
        }
        return answer;
    }
}

