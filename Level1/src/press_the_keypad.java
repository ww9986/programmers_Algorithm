public class press_the_keypad { // 키패드 누르기
    public String solution(int[] numbers, String hand) {
        String[][] keypad = {{"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"*", "0", "#"}};
        String answer = "", L_location = "*", R_location = "#";
        int[] L_position = new int[2], R_position = new int[2], current_position = new int[2];
        int L_distance, R_distance;
        boolean a, b, c;
        a = b = c = false;

        for (int num : numbers) {
            a = b = c = false;
            switch (num) {
                case 1, 4, 7 -> {
                    answer += "L";
                    L_location = String.valueOf(num);
                }
                case 3, 6, 9 -> {
                    answer += "R";
                    R_location = String.valueOf(num);
                }
                default -> {
                    for (int i = 0; i < keypad.length; i++) {
                        for (int j = 0; j < keypad[i].length; j++) {
                            if (L_location.equals(keypad[i][j])) {
                                L_position[0] = i;
                                L_position[1] = j;
                                a = true;
                            }
                            if (R_location.equals(keypad[i][j])) {
                                R_position[0] = i;
                                R_position[1] = j;
                                b = true;
                            }
                            if (String.valueOf(num).equals(keypad[i][j])) {
                                current_position[0] = i;
                                current_position[1] = j;
                                c = true;
                            }
                            if (a & b & c) break;
                        }
                        if (a & b & c) break;
                    }
                    L_distance = Math.abs(L_position[0] - current_position[0]) + Math.abs(L_position[1] - current_position[1]);
                    R_distance = Math.abs(R_position[0] - current_position[0]) + Math.abs(R_position[1] - current_position[1]);
                    if (L_distance < R_distance) {
                        answer += "L";
                        L_location = String.valueOf(num);
                    } else if (R_distance < L_distance) {
                        answer += "R";
                        R_location = String.valueOf(num);
                    } else {
                        switch (hand) {
                            case "left" -> {
                                answer += "L";
                                L_location = String.valueOf(num);
                            }
                            case "right" -> {
                                answer += "R";
                                R_location = String.valueOf(num);
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}
