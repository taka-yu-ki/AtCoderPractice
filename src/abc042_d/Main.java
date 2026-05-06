package abc042_d;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int MOD = 1_000_000_007;
		long[][] dp = new long[H][W];
		
		dp[0][0] = 1; // スタート地点
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (i >= H - A && j < B) {
					dp[i][j] = 0;
					continue;
				}
				
				if (i > 0) {
					dp[i][j] = (dp[i][j] + dp[i - 1][j]) % MOD;
				}
				if (j > 0) {
					dp[i][j] = (dp[i][j] + dp[i][j - 1]) % MOD;
				}
			}
		}
		
		System.out.println(dp[H - 1][W - 1]);
	}
}
