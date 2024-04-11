package EX00;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
//		int a = 20, b = 30;
//		if(a++ <= 20 || ++b > 30) b++;
//		System.out.printf("%d, %d\n", a++, b);
		Scanner sc = new Scanner(System.in);

//		String a = "+", b = "-", c = "*", d = "-";
//		String B = "+, -, *, /";
		String a = "+";
		String b = "-";
		String c = "*";
		String d = "/";

		System.out.print("첫 번째 숫자 : ");
		int num1 = Integer.parseInt(sc.next());

		System.out.print("산술 연산자 : ");
		String num2 = sc.next();
//		int str = Integer.parseInt(num2);

		System.out.print("두 번째 숫자 : ");
		int num3 = Integer.parseInt(sc.next());

//		System.out.print("결과는 : " + num1 + num2 + num3 + " -> " );

		if (num2.equals(a)) {
			System.out.println("결과는 : " + num1 + " " + num2 + " " + num3 + " -> " + (num1 + num3) + " 입니다!");
		} else if (num2.equals(b)) {
			System.out.println("결과는 : " + num1 +  " " + num2 + " " + num3 + " -> " + (num1 - num3) + " 입니다!");
		} else if (num2.equals(c)) {
			System.out.println("결과는 : " + num1 +  " " + num2 + " "  + num3 + " -> " + (num1 * num3) + " 입니다!");
		} else if (num2.equals(d)) {
			System.out.println("결과는 : " + num1 +  " " + num2 + " "  + num3 + " -> " + (num1 / num3) + " 입니다!");
		} else {
			System.out.println("잘못된 입력값 입니다!");
		}

	}

}
