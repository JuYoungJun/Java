package EX00;

import java.util.Scanner;

public class EX09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���������� ����");
		System.out.print(("����(1.), ����(2.), ��(3.) �� �Է��ϼ��� : "));
		int user = sc.nextInt();
		int com = (int) (Math.random() * 3) + 1;
		if (user == 1) {
			System.out.println("���� : ����");
		} else if (user == 2) {
			System.out.println("���� : ����");
		} else if (user == 3) {
			System.out.println("���� : ��");
		} else {
			System.out.println("�߸��� �Է��Դϴ�!");
		}

		if (com == 1) {
			System.out.println("��ǻ�� : ����");
		} else if (com == 2) {
			System.out.println("��ǻ�� : ����");
		} else if (com == 3) {
			System.out.println("��ǻ�� : ��");
		}

		if (com == 1) {
			if (user == 2) {
				System.out.println("�̰���ϴ�");
			} else if (user == 3) {
				System.out.println("�����ϴ�");
			} else {
				System.out.println("�����ϴ�");
			}

			if (com == 2) {
				if (user == 3) {
					System.out.println("�̰���ϴ�");
				} else if (user == 1) {
					System.out.println("�����ϴ�");
				} else {
					System.out.println("�����ϴ�");
				}

				if (com == 3) {
					if (user == 1) {
						System.out.println("�̰���ϴ�");
					} else if (user == 2) {
						System.out.println("�����ϴ�");
					} else {
						System.out.println("�����ϴ�");
					}
				}
			}
		}
	}
}
