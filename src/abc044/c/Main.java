package abc044.c;

import java.util.Scanner;

// 高橋君とカード
// メモ：DP を使わないとできない問題であり、アルゴリズムが少し難しい

public class Main {
	// N = 50, x_i = 50 のとき、最大で 50 * 50 = 2500 の振れ幅ができる
	// 合計が -2500 〜 +2500 になるため、2500 を足して 0 〜 5000 の範囲に収める
	private static final int OFFSET = 2500;
	private static final int MAX_SUM = 5000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int[] x = new int[N];

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}

		long result = countAverageACombinations(N, A, x);
		System.out.println(result);

		sc.close();
	}

	/**
	 * 平均が A となるカードの選び方の総数を計算する (2次元DP)
	 * 
	 * @param N カードの枚数
	 * @param A 目指す平均値
	 * @param x 各カードの数字配列
	 * @return 条件を満たす選び方の総数
	 */
	public static long countAverageACombinations(int N, int A, int[] x) {
		// dp[i][s] := i 枚目まで見て、(変換後の合計値 + OFFSET) が s になる選び方の通り数
		long[][] dp = new long[N + 1][MAX_SUM + 1];

		// 初期状態: 0枚選んで合計 0 (OFFSETの位置) になるのは「何も選ばない」の 1通り
		dp[0][OFFSET] = 1;

		for (int i = 0; i < N; i++) {
			// 最初から A を引いた値を使う
			int y = x[i] - A;

			for (int s = 0; s <= MAX_SUM; s++) {
				// ここまでに作り出せない合計値（0通り）ならスキップ
				if (dp[i][s] == 0) {
					continue;
				}

				// パターン①: i + 1 枚目のカードを「選ばない」
				dp[i + 1][s] += dp[i][s];

				// パターン②: i + 1 枚目のカードを「選ぶ」
				// 配列のインデックス範囲内（0 〜 5000）に収まる場合のみ加算
				if (s + y >= 0 && s + y <= MAX_SUM) {
					dp[i + 1][s + y] += dp[i][s];
				}
			}
		}

		// 最終的に合計が 0 (OFFSET) になった通り数から、
		// 「1枚も選ばなかった場合（dp[0][OFFSET] の 1通り）」を引いたものが答え
		return dp[N][OFFSET] - 1;
	}
}
