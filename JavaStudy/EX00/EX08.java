package EX00;

import java.util.Scanner;

public class EX08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ���� : ");
		int num1 = Integer.parseInt(sc.next());

		System.out.print("��� ������ : ");
		String num2 = sc.next();

		System.out.print("�� ��° ���� : ");
		int num3 = Integer.parseInt(sc.next());

		switch (num2) {
		case "+":
			System.out.println("����� : " + num1 + " " + num2 + " " + num3 + " -> " + (num1 + num3) + " �Դϴ�!");
			break;
		case "-":
			System.out.println("����� : " + num1 + " " + num2 + " " + num3 + " -> " + (num1 - num3) + " �Դϴ�!");
			break;
		case "*":
			System.out.println("����� : " + num1 + " " + num2 + " " + num3 + " -> " + (num1 * num3) + " �Դϴ�!");
			break;
		case "/":
			System.out.println("����� : " + num1 + " " + num2 + " " + num3 + " -> " + (num1 / num3) + " �Դϴ�!");
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�!");
		}

	}
}
