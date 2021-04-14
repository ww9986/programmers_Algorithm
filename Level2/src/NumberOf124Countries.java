public class NumberOf124Countries { // 124 나라의 숫자
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        int share, rest;

        while (true) {
            if (n > 3) {
                share = n / 3;
                rest = n % 3;
                switch (rest) {
                    case 1 -> answer.append("1");
                    case 2 -> answer.append("2");
                    case 3, 0 -> answer.append("4");
                }

                if (rest != 0)
                    n = share;
                else
                    n = share - 1;
            } else
                break;
        }
        switch (n) {
            case 1 -> answer.append("1");
            case 2 -> answer.append("2");
            case 3 -> answer.append("4");
        }

        return answer.reverse().toString();
    }
}
