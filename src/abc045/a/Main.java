package abc045.a;

import java.util.Scanner;

// 台形

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		
		int result = calcTrapezoidArea(a, b, h);
		System.out.println(result);
		
		sc.close();
	}
	
	/**
	 * 台形の面積を求めて出力する
	 * 
	 * @param a 上底の長さ
	 * @param b 下底の長さ
	 * @param h 高さ
	 * @return 台形の面積
	 */
	public static int calcTrapezoidArea(int a, int b, int h) {
		int result = (a + b) * h / 2;
		
		return result;
	}
}
