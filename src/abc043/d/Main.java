package abc043.d;

import java.util.Scanner;

// アンバランス

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		String result = searchUnbarance(input);
		System.out.println(result);

		sc.close();
	}

	/**
	 * アンバランスな文字列の位置を検索して返す（見つからない場合は "-1 -1" を返す）
	 * 
	 * @param input 入力値
	 * @return アンバランスな文字列の位置
	 */
	public static String searchUnbarance(String input) {
		String result = "-1 -1";
		if (input == null || input.isEmpty()) {
			return result;
		}
		int length = input.length();

		for (int i = 0; i < length - 1; i++) {
			// 長さが2の判定（同じ文字が連続している場合）
			if (input.charAt(i) == input.charAt(i + 1)) {
				result = (i + 1) + " " + (i + 2);
				break;
			}

			// 長さが3の判定（1文字挟んで同じ文字がある場合）
			if (i < length - 2 && input.charAt(i) == input.charAt(i + 2)) {
				result = (i + 1) + " " + (i + 3);
				break;
			}
		}

		return result;
	}
}
