public class cover_phone_number { // 핸드폰 번호 가리기
    public String solution(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length(); i++) {
            if (phone_number.length() - 4 <= i)
                answer += phone_number.charAt(i);
            else
                answer += "*";
        }
        return answer;
    }
}


