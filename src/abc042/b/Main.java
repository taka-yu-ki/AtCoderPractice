package abc042.b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int L = sc.nextInt();
		
		String[] strings = new String[N];
		
		for(int i = 0; i < N; i++) {
			strings[i] = sc.next();
		}
		
		StringBuilder result = new StringBuilder();
		
		Arrays.sort(strings);
		for(String string : strings) {
			result.append(string);
		}
		
		System.out.println(result);
	}
}
