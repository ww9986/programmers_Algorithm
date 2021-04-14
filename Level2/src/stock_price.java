public class stock_price { // 주식 가격
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int index = -1;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == 0)
                index = i;
        }

        for (int i = 0; i < prices.length; i++) {
            if (index == -1) {
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[i] > prices[j]) {
                        answer[i] = j - i;
                        break;
                    }
                }
                if (answer[i] == 0)
                    answer[i] = (prices.length - 1) - i;
            } else {
                if (i < index)
                    answer[i] = index - i;
                else if (i == index)
                    answer[i] = (prices.length - 1) - i;
                else {
                    for (int j = i + 1; j < prices.length; j++) {
                        answer[i] = j - i;
                        break;
                    }

                    if (answer[i] == 0)
                        answer[i] = (prices.length - 1) - i;
                }
            }
        }
        return answer;
    }
}
