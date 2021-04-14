import java.math.BigInteger;

public class fine_squares { // 멀쩡한 사각형
    public long solution(int w, int h) {
        BigInteger W = BigInteger.valueOf(w);
        BigInteger H = BigInteger.valueOf(h);
        BigInteger GCD = W.gcd(H);
        int gcd = Integer.parseInt(String.valueOf(GCD));

        return ((long) w * h) - ((long) ((w / gcd) + (h / gcd) - 1) * gcd);
    }
}
