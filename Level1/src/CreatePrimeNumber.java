import java.util.ArrayList;

public class CreatePrimeNumber {
    public int solution(int[] nums) {
        ArrayList<Integer> sums = new ArrayList<>();
        int answer = 0;
        boolean prime_number;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sums.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        for (Integer sum : sums) {
            prime_number = true;
            for (int i = 2; i < sum; i++) {
                if (sum % i == 0) {
                    prime_number = false;
                    break;
                }
            }
            if (prime_number)
                answer++;
        }

        return answer;
    }
}
