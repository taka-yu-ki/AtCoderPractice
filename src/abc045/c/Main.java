package abc045.c;

import java.util.Scanner;

// たくさんの数式

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int n = s.length();

		long result = sumCombinationTotals(s);
		System.out.println(result);

		sc.close();
	}

	public static long sumCombinationTotals(String s) {
		int n = s.length();
		long totalSum = 0;

		// すき間 (n - 1) 個に対する全パターン数: 2^(n - 1) 通り
		int patternCount = (int) Math.pow(2, n - 1);

		for (int mask = 0; mask < patternCount; mask++) {
			// 数値を文字コード（ASCIIコード）の仕組みを利用して初期化
			long currentNum = s.charAt(0) - '0';

			// mask の i ビット目が 1 なら '+' を入れる
			for (int i = 0; i < n - 1; i++) {
				if (((mask >> i) & 1) == 1) {
					totalSum += currentNum;
					currentNum = s.charAt(i + 1) - '0';
				} else {
					// 0 なら桁を繰り上げて結合する
					currentNum = currentNum * 10 + (s.charAt(i + 1) - '0');
				}
			}

			// 式の最後の数値を加算
			totalSum += currentNum;
		}

		return totalSum;
	}
}
