package EX00;

import java.util.Scanner;

public class EX15 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;// �ܰ�
		String money = "";
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------");
			System.out.println("1.�ݾ� �Է�");
			System.out.println("---------");
			System.out.print("����> ");
			String select = scanner.nextLine();
			if (select.equals("1")) {
				System.out.print("�� �ݾ� �Է� > ");
				money = scanner.nextLine();
				balance += Integer.parseInt(money);
				System.out.printf("�ܵ� : %d\n", balance);
				System.out.printf("10,000�� : %d��\n", balance / 10000);
				System.out.printf("5,000�� : %d��\n", (balance % 10000) / 5000);
				System.out.printf("1,000�� : %d��\n", (balance % 5000) / 1000);
				System.out.printf("500�� : %d��\n", (balance % 1000) / 500);
				System.out.printf("100�� : %d��\n", (balance % 500) / 100);
				System.out.printf("50�� : %d��\n", (balance % 100) / 50);
				System.out.printf("10�� : %d��\n", (balance % 50) / 10);
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
		System.out.println("���α׷� ����");
	}

}
