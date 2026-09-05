package abc042.c;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < K; i++) {
			set.add(sc.nextInt());
		}
		
		while(check(N, set)) {
			N++;
		}
	}
	
	public static boolean check(int N, Set<Integer> set) {
		while(N > 0) {
			int c = N % 10;
			if (set.contains(c)) return true;
			N /= 10;
		}
		return false;
	}
}
