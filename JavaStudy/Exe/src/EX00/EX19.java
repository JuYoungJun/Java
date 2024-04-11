package EX00;

import java.util.Scanner;

public class EX19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		int str1 = Integer.parseInt(str);
		System.out.printf("결과 : %d", (str1/10000)+((str1%10000)/1000)+((str1%1000)/100)+((str1%100)/10)+(str1%10));
	}

}
