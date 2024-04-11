package d0408;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PoketmonVO[] characters = new PoketmonVO[3];
		boolean isRunning = true;

		while (isRunning) {
			System.out.println("===== �޴� =====");
			System.out.println("1. ���ϸ� ���� �Է��ϱ�");
			System.out.println("2. ���ϸ� ���� Ȯ���ϱ�");
			System.out.println("3. ���ϸ� ���� ã��");
			System.out.println("4. ����");
			System.out.print("�޴��� �����ϼ���: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("ĳ���� ������ �Է��ϼ���");
				for (int i = 0; i < 3; i++) {
					System.out.println("ĳ���� " + (i + 1) + " ���� �Է�");
					System.out.print("���ϸ��̸� : ");
					String nick = scanner.next();
					System.out.print("�Ӽ� : ");
					String property = scanner.next();
					System.out.print("����� : ");
					String hauntingplace = scanner.next();
					System.out.print("HP�� �Է��ϼ��� : ");
					int hp = scanner.nextInt();
					System.out.print("������ �Է��ϼ��� : ");
					int lv = scanner.nextInt();
					characters[i] = new PoketmonVO(nick, property, hauntingplace, hp, lv);
				}
				break;

			case 2:
				boolean hasCharacters = false;
				for (int i = 0; i < 3; i++) {
					if (characters[i] != null) {
						hasCharacters = true;
						break;
					}
				}
				if (!hasCharacters) {
					System.out.println("��ȸ �Ҽ� �ִ� ���ϸ��� ������ �����ϴ�.");
					break;
				}
				System.out.println("���ϸ� ���� Ȯ��");
				for (int i = 0; i < 3; i++) {
					if (characters[i] != null) {
						PoketmonVO character = characters[i];
						System.out.println("���ϸ� " + (i + 1) + "����");
						System.out.println("���ϸ� �̸� : " + character.getNick());
						System.out.println("�Ӽ� : " + character.getProperty());
						System.out.println("����� : " + character.getHauntingplace());
						System.out.println("HP : " + character.getHp());
						System.out.println("LV : " + character.getLv());
						System.out.println();
					}
				}
				break;
			case 3:
				System.out.print("ã�� ���ϸ� ������ �Է��ϼ��� : ");
				String poketmon = scanner.next();

				int index = -1;

				for (int i = 0; i < characters.length; i++) {
					if (poketmon.equals(characters[i].getNick())) {
						index = i;
						break;
					}
				}
				if (index != -1) {
					System.out.println(poketmon + "�� " + (index) + "�����ε����� �ֽ��ϴ�.");
				} else {
					System.out.println(poketmon + " �̶�� ���ϸ��� �������� ���� �̸��Դϴ�.");
				}
				break;
			case 4:
				isRunning = false;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

		}
		scanner.close();
	}
}
