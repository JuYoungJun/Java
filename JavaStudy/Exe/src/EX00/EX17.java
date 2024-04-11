package EX00;

import java.util.Scanner;

public class EX17 {
	public static void main(String[] args) {
//		값 받아서 별 찍기
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num - i; j++) {
				System.out.print(" ");
			}
			// 별찍기 위해 홀수 만들기
			for (int j = 1; j <= (2 * (i + 1)) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//밑 쪽 별 만들기
		for (int i = 1; i < num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (2*num)-1-(2*i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
