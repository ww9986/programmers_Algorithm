public class colatz_guess { // 콜라츠 추측


    public int solution(int num) {
        int cnt = 0;
        long number = num;

        while (number != 1) {
            cnt++;
            if (number % 2 == 0)
                number /= 2;
            else
                number = (3 * number) + 1;

            if(500 < cnt)
                return -1;
        }
        return cnt;
    }
}


