import java.util.*;

public class remove_the_smallest_number {
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        List<Integer> arrayList = new ArrayList<>();

        if(arr.length!=1) {
            for (int num : arr) {
                if (num < min)
                    min = num;
                arrayList.add(num);
            }


            for (int i = 0; i < arrayList.size(); i++) {
                if (min == arrayList.get(i))
                    arrayList.remove(i);
            }
            return arrayList.stream().mapToInt(i->i).toArray();
        }
        return new int[]{-1};
    }
}


