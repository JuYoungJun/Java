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

		System.out.print("ù ��° ���� : ");
		int num1 = Integer.parseInt(sc.next());

		System.out.print("��� ������ : ");
		String num2 = sc.next();
//		int str = Integer.parseInt(num2);

		System.out.print("�� ��° ���� : ");
		int num3 = Integer.parseInt(sc.next());

//		System.out.print("����� : " + num1 + num2 + num3 + " -> " );

		if (num2.equals(a)) {
			System.out.println("����� : " + num1 + " " + num2 + " " + num3 + " -> " + (num1 + num3) + " �Դϴ�!");
		} else if (num2.equals(b)) {
			System.out.println("����� : " + num1 +  " " + num2 + " " + num3 + " -> " + (num1 - num3) + " �Դϴ�!");
		} else if (num2.equals(c)) {
			System.out.println("����� : " + num1 +  " " + num2 + " "  + num3 + " -> " + (num1 * num3) + " �Դϴ�!");
		} else if (num2.equals(d)) {
			System.out.println("����� : " + num1 +  " " + num2 + " "  + num3 + " -> " + (num1 / num3) + " �Դϴ�!");
		} else {
			System.out.println("�߸��� �Է°� �Դϴ�!");
		}

	}

}
