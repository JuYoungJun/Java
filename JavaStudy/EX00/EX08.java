package EX00;

import java.util.Scanner;

public class EX08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int num1 = Integer.parseInt(sc.next());

		System.out.print("산술 연산자 : ");
		String num2 = sc.next();

		System.out.print("두 번째 숫자 : ");
		int num3 = Integer.parseInt(sc.next());

		switch (num2) {
		case "+":
			System.out.println("결과는 : " + num1 + " " + num2 + " " + num3 + " -> " + (num1 + num3) + " 입니다!");
			break;
		case "-":
			System.out.println("결과는 : " + num1 + " " + num2 + " " + num3 + " -> " + (num1 - num3) + " 입니다!");
			break;
		case "*":
			System.out.println("결과는 : " + num1 + " " + num2 + " " + num3 + " -> " + (num1 * num3) + " 입니다!");
			break;
		case "/":
			System.out.println("결과는 : " + num1 + " " + num2 + " " + num3 + " -> " + (num1 / num3) + " 입니다!");
			break;
		default:
			System.out.println("잘못된 입력입니다!");
		}

	}
}
