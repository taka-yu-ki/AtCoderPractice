package abc045.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 3人でカードゲームイージー

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String stringA = sc.next();
		String stringB = sc.next();
		String stringC = sc.next();

		List<String> A = new ArrayList<>(Arrays.asList(stringA.split("")));
		List<String> B = new ArrayList<>(Arrays.asList(stringB.split("")));
		List<String> C = new ArrayList<>(Arrays.asList(stringC.split("")));

		String winner = resultWinner(A, B, C);
		System.out.println(winner);

		sc.close();
	}

	/**
	 * ゲームの勝利者を出力する処理
	 * @param A
	 * @param B
	 * @param C
	 * @return ゲームの勝利者
	 */
	public static String resultWinner(List<String> A, List<String> B, List<String> C) {
		// 初期値の指定（Enum 定数を使用）
		Player currentPlayer = Player.A;
		List<String> currentList = A;

		while (true) {
			// 現在のプレイヤーの手札が無くなったら、そのプレイヤーの勝利
			if (currentList.isEmpty()) {
				return currentPlayer.name();
			}

			// 先頭のカードを引き、Enum定数(Player)に変換する
			String card = currentList.remove(0).toUpperCase();
			currentPlayer = Player.valueOf(card);

			// 引いたカード（次のプレイヤー）に応じて手札の参照を更新する
			switch (currentPlayer) {
			case A:
				currentList = A;
				break;
			case B:
				currentList = B;
				break;
			case C:
				currentList = C;
				break;
			}
		}
	}

	/**
	 * プレイヤー
	 */
	private enum Player {
		A, B, C
	}
}
