package abc042.a;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] array = {A, B, C};
		
		Arrays.sort(array);
		
		if (array[0] == 5 && array[1] == 5 && array[2] == 7) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}
}