package EX00;

import java.util.Scanner;

public class EX21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���丮�� ���� ���ϴ� ���ڸ� �Է� �ϼ���");
		System.out.println(">>> ");
		int n = Integer.parseInt(sc.nextLine());
		long result = 1l;
		
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		
		System.out.println(n + "! = " + result);
		
	}

}
