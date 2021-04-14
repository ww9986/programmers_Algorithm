import java.util.ArrayList;

public class Poketmon {
    public int solution(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int num : nums) {
            if (!arrayList.contains(num))
                arrayList.add(num);
        }

        return Math.min(arrayList.size(), nums.length / 2);
    }
}
