public class caesar_password { // 시저 암호
    public String solution(String s, int n) {
        String answer = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
                ch = s.charAt(i);

                if ('a' <= ch && ch <= 'z') {
                    ch += n;
                    if ('z' < ch)
                        ch -= 26;
                } else if ('A' <= ch && ch <= 'Z') {
                    ch += n;
                    if ('Z' < ch)
                        ch -= 26;
                }

                answer += ch;
            }
        return answer;
    }
}