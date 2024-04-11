package d0405;

import java.util.*;

public class Main2 {
	public static void main(String[] args) {
//		MapleVO2 m1 = new MapleVO2("�̸�", 10, 10, 10, 10, "null");
//		MapleVO2 m2 = new MapleVO2("�̸�", 10, 10, 10, 10, "null");
//		MapleVO2 m3 = new MapleVO2("�̸�", 10, 10, 10, 10, "null");

		Scanner scanner = new Scanner(System.in);
		MapleVO2[] characters = new MapleVO2[3];
		boolean isRunning = true;

		while (isRunning) {
			System.out.println("===== �޴� =====");
			System.out.println("1. ĳ���� ���� �Է��ϱ�");
			System.out.println("2. ĳ���� ���� Ȯ���ϱ�");
			System.out.println("3. ����");
			System.out.print("�޴��� �����ϼ���: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("ĳ���� ������ �Է��ϼ���");
				for (int i = 0; i < 3; i++) {
					System.out.println("ĳ���� " + (i + 1) + " ���� �Է�");
					System.out.print("�г���: ");
					String nick = scanner.next();
					System.out.print("STR: ");
					int str = scanner.nextInt();
					System.out.print("DEX: ");
					int dex = scanner.nextInt();
					System.out.print("INT: ");
					int intel = scanner.nextInt();
					System.out.print("LUCK: ");
					int luck = scanner.nextInt();
					System.out.print("����: ");
					String server = scanner.next();
					characters[i] = new MapleVO2(nick, str, dex, intel, luck, server);
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
					System.out.println("ĳ���� ������ ��ȸ�� �� �ִ� ĳ���Ͱ� �����ϴ�.");
					break;
				}
				System.out.println("ĳ���� ���� Ȯ��:");
				for (int i = 0; i < 3; i++) {
					if (characters[i] != null) {
						MapleVO2 character = characters[i];
						System.out.println("ĳ���� " + (i + 1) + " ����:");
						System.out.println("�г���: " + character.getNick());
						System.out.println("STR: " + character.getStr());
						System.out.println("DEX: " + character.getDex());
						System.out.println("INT: " + character.getIntel());
						System.out.println("LUCK: " + character.getLuck());
						System.out.println("����: " + character.getServer());
						System.out.println();
					}
				}
				break;
			case 3:
				isRunning = false;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		scanner.close();
	}
}
