package EX00;

import java.util.*;

public class EX28 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String[] names = { "������", "ī����", "�� ��", "�����", "������" };
//
//		System.out.print("�Է� >> ");
//		String na = sc.nextLine();
//
//		for (int i = 0; i < names.length; i++) {
//
//		}
//		for (String str : names) {
//			if (na.equals(str)) {
//				System.out.println(na + "���� �����մϴ�");
//			} else {
//				System.out.println("�������� ���� �̸��Դϴ�");
//			}
//		}

//		Scanner sc = new Scanner(System.in);
//
//		String[] names = new String[10]; // �ִ� 10���� �̸��� ������ �迭
//		int currentSize = 0; // ���� �迭�� ����� ����� ����
//
//		while (true) {
//			System.out.print("�Է� >> ");
//			String na = sc.nextLine();
//
//			int index = -1; // �̸��� �ε����� ������ ������ �߰��ϰ� �ʱ�ȭ
//
//			for (int i = 0; i < currentSize; i++) {
//				if (na.equals(names[i])) {
//					index = i; // �̸��� ã�����Ƿ� �ش� �ε����� ����
//					break;
//				}
//			}
//
//			if (index != -1) {
//				System.out.println(na + "���� �����մϴ�. " + na + "�� �迭�� " + (index + 1) + "��°�� �ֽ��ϴ�.");
//			} else {
//				System.out.println(na + " �̶�� �̸��� �������� ���� �̸��Դϴ�.");
//				if (currentSize < 10) {
//					System.out.print("�����Ͻðڽ��ϱ�? (y/n): ");
//					String response = sc.nextLine();
//					if (response.equalsIgnoreCase("y")) {
//						names[currentSize] = na; // ���� ũ�⸦ �ε����� Ȱ���Ͽ� �� �̸� ����
//						currentSize++; // ���� ũ�⸦ ������Ŵ
//						System.out.println(na + "��(��) �迭�� " + currentSize + "��°�� �߰��Ǿ����ϴ�.");
//					}
//				} else {
//					System.out.println("�� �̻� ������ ������ �����ϴ�.");
//					break; // �迭�� ���� á���Ƿ� �� �̻� �Է� ���� ����
//				}
//			}
//		}
//
//		// �迭 ���
//		System.out.println("�迭 Ȯ��:");
//		for (int i = 0; i < currentSize; i++) {
//			System.out.println("[" + i + "] " + names[i]);
//		}
		
		//�������� ����ڰ� �߸��Ѱ�
		//���� �����ϴٰ� �߸��Ȱ� : Exception
		// ArrayIndecOutOfBoundException : �迭 index ���� ���!

		Scanner sc = new Scanner(System.in);

		String[] originalNames = { "������", "ī����", "�� ��", "�����", "������" };
		String[] names = new String[10]; // �ִ� 10���� �̸��� ������ �迭
		int currentSize = originalNames.length; // ���� �迭�� ����� ����� ����

		// ���� �迭�� ������ �� �迭�� ����
		for (int i = 0; i < currentSize; i++) {
			names[i] = originalNames[i];
		}

		while (true) {
			System.out.print("�Է� >> ");
			String na = sc.nextLine();

			int index = -1; // �̸��� �ε����� ������ ������ �߰��ϰ� �ʱ�ȭ

			for (int i = 0; i < currentSize; i++) {
				if (na.equals(names[i])) {
					index = i; // �̸��� ã�����Ƿ� �ش� �ε����� ����
					break;
				}
			}

			if (index != -1) {
				System.out.println(na + "���� �����մϴ�. " + na + "�̶�� �̸��� �ε��� " + index + "��°�� �ֽ��ϴ�.");
			} else {
				System.out.println(na + " �̶�� �̸��� �������� ���� �̸��Դϴ�.");
				if (currentSize < 10) {
					System.out.print("�����Ͻðڽ��ϱ�? (y/n): ");
					String response = sc.nextLine();
					if (response.equalsIgnoreCase("y")) {
						names[currentSize] = na; // ���� ũ�⸦ �ε����� Ȱ���Ͽ� �� �̸� ����
						currentSize++; // ���� ũ�⸦ ������Ŵ
						System.out.println(na + "��(��) �ε��� " + (currentSize - 1) + "��°�� �߰��Ǿ����ϴ�.");
					}
				} else {
					System.out.println("�� �̻� ������ ������ �����ϴ�.");
					break; // �迭�� ���� á���Ƿ� �� �̻� �Է� ���� ����
				}
			}
		}

		// �迭 ���
//		System.out.println("�迭 Ȯ��:");
//		for (int i = 0; i < currentSize; i++) {
//			System.out.println("�ε��� " + i + ": " + names[i]);
//		}
	}

}
