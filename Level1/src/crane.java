import java.util.*;

public class crane { // 크레인 인형뽑기 게임
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		List<Integer> dolls = new ArrayList<Integer>();

		for (int move : moves) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][move - 1] != 0) {
					dolls.add(board[i][move - 1]);
					board[i][move - 1] = 0;
					break;
				}
			}
		}

		for (int i = 0; i < dolls.size(); i++) {
			if ((dolls.size() > i + 1) && (dolls.get(i) == (dolls.get(i + 1)))) {
				dolls.remove(i);
				dolls.remove(i);
				answer += 2;
				i = -1;
			}
		}

		return answer;
	}
}
