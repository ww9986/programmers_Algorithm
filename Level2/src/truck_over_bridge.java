import java.util.*;

public class truck_over_bridge { // 다리를 지나는 트럭
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0, sum = 0;
        Queue<Integer> truck = new LinkedList<>();

        for (int truck_weight : truck_weights) {
            while (true) {
                if (truck.isEmpty()) {
                    truck.add(truck_weight);
                    sum += truck_weight;
                    answer++;
                    break;
                } else if (truck.size() == bridge_length)
                    sum -= truck.poll();
                else {
                    if (sum + truck_weight > weight) {
                        answer++;
                        truck.add(0);
                    } else {
                        truck.add(truck_weight);
                        sum += truck_weight;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer + bridge_length;
    }
}

