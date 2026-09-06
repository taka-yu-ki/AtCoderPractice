package abc044.a;

import java.util.Scanner;

// 高橋君とホテルイージー

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int result = calcTotalAmount(N, K, X, Y);
		System.out.println(result);
		
		sc.close();
	}

	/**
	 * 宿泊代金の合計を計算して出力する
	 * 
	 * @param totalNights 宿泊数
	 * @param discountThreshold 宿泊金額が変化する境界値
	 * @param regularPrice 境界値前の宿泊代
	 * @param discountPrice 境界値後の宿泊代
	 * @return 算出した合計
	 */
	public static int calcTotalAmount(int totalNights, int discountThreshold, int regularPrice, int discountPrice) {
		if (discountThreshold >= totalNights) {
			return totalNights * regularPrice;
		} else {
			return discountThreshold * regularPrice + (totalNights - discountThreshold) * discountPrice;
		}
	}
}
