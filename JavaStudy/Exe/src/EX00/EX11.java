package EX00;

import java.util.Scanner;

public class EX11 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;// �ܰ�
		String money = "";
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("------------------------");
			System.out.print("����> ");
			String select = scanner.nextLine();
			if (select.equals("1")) {
				System.out.print("���ݾ�> ");
				money = scanner.nextLine();
				balance += Integer.parseInt(money);
			} else if (select.equals("2")) {
				System.out.print("��ݾ�> ");
				money = scanner.nextLine();
				int int_money = Integer.parseInt(money);
				if (balance >= int_money) {
					balance -= int_money;
				} else {
					System.out.println("�ܾ��� �����մϴ�.");
				}
			} else if (select.equals("3")) {
				System.out.println("�ܰ�> " + balance);
			} else if (select.equals("4")) {
				break;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
		System.out.println("���α׷� ����");
	}
}
