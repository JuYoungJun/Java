package EX00;

import java.util.Scanner;

public class EX21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("팩토리얼 값을 원하는 숫자를 입력 하세요");
		System.out.println(">>> ");
		int n = Integer.parseInt(sc.nextLine());
		long result = 1l;
		
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		
		System.out.println(n + "! = " + result);
		
	}

}
