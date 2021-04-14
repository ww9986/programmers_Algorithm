public class secret_map { // 비밀지도
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String map1, map2;

        for (int i = 0; i < n; i++)
            answer[i] = "";

        for (int i = 0; i < n; i++) {
            map1 = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr1[i])));
            map2 = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr2[i])));
            for (int j = 0; j < n; j++) {
                if ((Integer.parseInt(String.valueOf(map1.charAt(j))) == 1) | (Integer.parseInt(String.valueOf(map2.charAt(j)))) == 1)
                    answer[i] += "#";
                else
                    answer[i] += " ";
            }

        }
        return answer;
    }
}
