package EX00;

import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요 : ");
		int s = sc.nextInt();

		int i = 0;
		while (i < s) {
			int j = 0;
			while (j < s / 2) {
				if (i <= s / 2) {
					if (i + j <= s / 2 - 1) {
						System.out.print(" ");
					} else if (j - i >= s / 2 + 1) {
						System.out.print(" ");
					} else {
						System.out.println("*");
					}
				} else if (i > s / 2) {
					if (i - j >= s / 2 + 1) {
						System.out.print(" ");
					} else if (i + j >= s / 2 * 3 + 1) {
						System.out.print(" ");
					} else {
						System.out.println("*");
					}
				}
				j++;
			}
			System.out.println("");
			i++;

		}
	}

}
