public class Prime_number { // 소수 찾기
    public int solution(int n) {
        int cnt = 0, root = (int) Math.sqrt(n);
        boolean[] arr = new boolean[n + 1];

        for (int i = 2; i <= n; i++)
            arr[i] = true;

        for (int i = 2; i <= root; i++) {
            if (arr[i])
                for (int j = i; i * j <= n; j++) arr[i * j] = false;
        }

        for (int i = 1; i <= n; i++)
            if (arr[i]) cnt++;


        return cnt;
    }
}

