package EX00;

import java.util.*;

public class EX29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = { "������", "ī����", "�� ��", "�����", "������" };

		System.out.print("�Է� >> ");
		String na = sc.nextLine();

		int index = -1;// �̸��� �ε����� ������ ������ �߰��ϰ� �ʱ�ȭ

		for (int i = 0; i < names.length; i++) {
			if (na.equals(names[i])) {
				index = i; // �̸��� ã������ �ε����� ����
				break;
			} // if����
		} // for ����
		if (index != -1) {
			System.out.println(na + "���� " + (index) + "�����ε����� �ֽ��ϴ�.");
		} else {
			System.out.println(na + " �̶�� �̸��� �������� ���� �̸��Դϴ�.");
		} // if����
	}

}
