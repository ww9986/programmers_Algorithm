public class create_strange_characters { // 이상한 문자 만들기
    public String solution(String s) {
        String answer = "";
        String[] strings = s.split("");
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer += ' ';
                index = 0;
            } else if (index % 2 == 0) {
                answer += String.valueOf(s.charAt(i)).toUpperCase();
                index++;
            } else {
                answer += String.valueOf(s.charAt(i)).toLowerCase();
                index++;
            }
        }
        return answer;
    }
}
