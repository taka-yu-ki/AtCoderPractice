package abc044.b;

import java.util.Scanner;

// 美しい文字列

public class Main {
	private static final String YES = "Yes";
	private static final String NO = "No";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.next();

		if (isBeautifulString(input)) {
			System.out.println(YES);
		} else {
			System.out.println(NO);
		}

		sc.close();
	}

	/**
	 * 文字列が全て偶数個あるか判定する
	 * 
	 * @param input 入力値
	 * @return 結果
	 */
	public static boolean isBeautifulString(String input) {
		if (input == null || input.isEmpty()) {
			return false;
		}
		int[] alphabetCounts = new int[26];

		for (char c : input.toCharArray()) {
			alphabetCounts[c - 'a']++;
		}

		// 同じ文字列の数字が奇数回であった場合、即 false を返す
		for (int count : alphabetCounts) {
			if (count % 2 != 0) {
				return false;
			}
		}

		return true;
	}
}
