import java.util.*;

public class print {
    public int solution(int[] priorities, int location) { // 프린트
        int answer = 0, importance = 1;
        char document = 65, ask_document=' ';
        Queue<Character> printer = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            if (i == location)
                ask_document = document;
            printer.add(document);
            document++;
        }

        while (true) {
            if (priorities[printer.peek() - 65] == importance) {
                printer.poll();
                answer++;
                importance++;
            } else
                printer.add(printer.poll());

            if(printer.peek()==ask_document) {
                answer++;
                break;
            }
        }

        return answer;
    }
}
