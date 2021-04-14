public class square_root_determine { // 정수 제곱근 판별
    public long solution(long n) {
        double sqrt = Math.sqrt(n);

        if ((sqrt - (int) sqrt) == 0)
            return (long) Math.pow(((int) sqrt + 1), 2);
        else
            return -1;
    }
}

