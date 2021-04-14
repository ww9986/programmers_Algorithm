public class darts { // 다트 게임
    public int solution(String dartResult) {
        int[] answer = new int[3];
        int result = 0, sum = 0, cnt = 0;
        String tmp = "";

        for (int i = 0; i < dartResult.length(); i++) {
            switch (dartResult.charAt(i)) {
                case '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' -> tmp += dartResult.charAt(i);
                case 'S' -> {
                    sum = Integer.parseInt(tmp);
                    tmp = "";
                    answer[cnt++] = sum;
                }
                case 'D' -> {
                    sum = (int) Math.pow(Double.parseDouble(tmp), 2);
                    answer[cnt++] = sum;
                    tmp = "";
                }
                case 'T' -> {
                    sum = (int) Math.pow(Double.parseDouble(tmp), 3);
                    answer[cnt++] = sum;
                    tmp = "";
                }
                case '*' -> {
                    answer[cnt - 1] *= 2;
                    if (0 <= cnt - 2) answer[cnt - 2] *= 2;
                }
                case '#' -> answer[cnt - 1] *= -1;
            }
        }

        for (int num : answer)
            result += num;

        return result;
    }
}
