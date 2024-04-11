package EX00;

import java.util.Scanner;

public class EX18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		System.out.print("정수를 입력하세요 : ");
		num = scanner.nextInt();
		System.out.printf("%d\n", (num/100)*100);
	}

}
