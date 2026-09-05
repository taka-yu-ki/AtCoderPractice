package abc043.a;

import java.util.Scanner;

// キャンディーとN人の子供イージー

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int totalCandyCount = calculateTotalCandyCount(N);
		
		System.out.println(totalCandyCount);
	}
	
	public static int calculateTotalCandyCount(int N) {
		int totalCandyCount = 0;
		for (int i = 1; i <= N; i++) {
			totalCandyCount += i;
		}
		return totalCandyCount;
	}
}
