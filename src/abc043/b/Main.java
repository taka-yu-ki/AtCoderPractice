package abc043.b;

import java.util.Scanner;

// バイナリハックイージー

public class Main {
	private static final char REMOVE_TARGET = 'B';

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		String result = applyBackspace(input);

		System.out.println(result);

		sc.close();
	}

	/**
	 * キー入力履歴から、バックスペース処理を反映した最終表示文字列を生成する。
	 * 
	 * @param input キー入力履歴
	 * @return 処理後の表示文字列
	 */
	public static String applyBackspace(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}

		StringBuilder sb = new StringBuilder();

		for (char key : input.toCharArray()) {
			if (key == REMOVE_TARGET) {
				if (sb.length() > 0) {
					sb.deleteCharAt(sb.length() - 1);
				}
			} else {
				sb.append(key);
			}
		}

		return sb.toString();
	}
}
