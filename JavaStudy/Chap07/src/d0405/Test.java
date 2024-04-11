package d0405;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
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
					System.out.print("�г��� (1�� �̻� 20�� ����): ");
					String nick = scanner.next();
					if (nick.length() < 1 || nick.length() > 20) {
						System.out.println("�г����� 1�� �̻� 20�� ���Ͽ��� �մϴ�.");
						i--; // ��ȿ���� ���� �Է����� ���� �ݺ� Ƚ�� ����
						continue;
					}
					System.out.print("STR (1 �̻� 8 �̸�): ");
					int str = getIntInRange(scanner, 1, 8, "STR");
					System.out.print("DEX (1 �̻� 8 �̸�): ");
					int dex = getIntInRange(scanner, 1, 8, "DEX");
					System.out.print("INT (1 �̻� 8 �̸�): ");
					int intel = getIntInRange(scanner, 1, 8, "INT");
					System.out.print("LUCK (1 �̻� 8 �̸�): ");
					int luck = getIntInRange(scanner, 1, 8, "LUCK");
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

	// ����ڷκ��� ������ ���Ե� ������ �Է¹޴� �޼ҵ�
	private static int getIntInRange(Scanner scanner, int min, int max, String fieldName) {
		int value;
		while (true) {
			if (!scanner.hasNextInt()) {
				System.out.println(fieldName + " ���� " + min + " �̻� " + (max - 1) + " �̸��̾�� �մϴ�.");
				scanner.next(); // �Է� ���� ����
				continue;
			}
			value = scanner.nextInt();
			if (value < min || value >= max) {
				System.out.println(fieldName + " ���� " + min + " �̻� " + (max - 1) + " �̸��̾�� �մϴ�.");
				continue;
			}
			break;
		}
		return value;
	}
}
