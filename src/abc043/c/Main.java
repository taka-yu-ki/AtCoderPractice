package abc043.c;

import java.util.Scanner;

// いっしょ

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		int result = calcMinCost(a);

		System.out.println(result);

		sc.close();
	}

	/**
	 * 最小のコストを計算して返す
	 * 
	 * @param a 入力値
	 * @return 最小のコスト
	 */
	public static int calcMinCost(int[] a) {
		if (a == null || a.length == 0) {
			return 0;
		}
		int minCost = Integer.MAX_VALUE;

		// yを -100 から 100 まで試す
		for (int y = -100; y <= 100; y++) {
			int currentCost = 0;

			// 各a[i]についてコストの総和を求める
			for (int num : a) {
				currentCost += (num - y) * (num - y);
			}

			// 最小値を更新
			minCost = Math.min(minCost, currentCost);
		}

		return minCost;
	}
}
