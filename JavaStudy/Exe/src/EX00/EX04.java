package EX00;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("��ٸ��� ���� ���ϱ�!");
		System.out.print("���� : ");
		double top = Double.parseDouble(sc.nextLine());

		System.out.print("�Ʒ��� : ");
		double bottom = Double.parseDouble(sc.nextLine());

		System.out.print("���� : ");
		double height = Double.parseDouble(sc.nextLine());

		System.out.println("����� : " + (top + bottom) * height / 2);

	}

}
