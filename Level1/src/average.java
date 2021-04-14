public class average { // 평균 구하기
    public double solution(int[] arr) {
        double sum = 0;
        for (int num : arr)
            sum += num;

        return sum / arr.length;
    }
}
