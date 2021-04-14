public class subaksubaksubaksubaksu { // 수박수박수박수박수?
    public String solution(int n) {
        String answer = "";

        for (int i = 0; i < n / 2; i++)
            answer += "수박";
        if (n % 2 != 0)
            answer += "수";


        /*for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                answer += "박";
            else
                answer += "수";
        }*/
        return answer;
    }
}
