public class GCD_and_LCM { // 최대공약수와 최소공배수
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        if (n > m) {
            int tmp = n;
            n = m;
            m = tmp;
        }

        answer[0] = gcd(n, m);
        answer[1] = (m * n) / answer[0];

        return answer;
    }

    int gcd(int n, int m) {
        int r = n % m;

        if (r == 0)
            return m;
        else
            return gcd(m, r);
    }
}


