import java.util.*;

public class int_descending { // 정수 내림차순으로 배치하기
    public long solution(long n) {
        String str = String.valueOf(n);
        Integer[] nums = new Integer[str.length()];

        for (int i = 0; i < nums.length; i++)
            nums[i] = Integer.parseInt(String.valueOf(str.charAt(i)));

        Arrays.sort(nums, Collections.reverseOrder());
        str = "";

        for (int a : nums)
            str += a;

        return Long.parseLong(str);
    }
}

