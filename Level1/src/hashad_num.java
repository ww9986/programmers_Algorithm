public class hashad_num { // 하샤드 수
    public boolean solution(int x) {
        String X = String.valueOf(x);
        int sum = 0;

        for (int i = 0; i < X.length(); i++)
            sum += Integer.parseInt(String.valueOf(X.charAt(i)));

        return x % sum == 0;
    }
}


