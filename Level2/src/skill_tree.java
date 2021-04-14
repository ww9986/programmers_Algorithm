import java.util.*;

public class skill_tree { // 스킬 트리
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length, index = 0, current_index = 0;

        for (String str : skill_trees) {
            index = str.indexOf(skill.charAt(0));

            for (int i = 1; i < skill.length(); i++) {
                current_index = str.indexOf(skill.charAt(i));
                if (((current_index < index) && (current_index != -1)) || ((index == -1) && (current_index != -1))) {
                    answer--;
                    break;
                }

                index = current_index;
            }
        }
        return answer;
    }
}
