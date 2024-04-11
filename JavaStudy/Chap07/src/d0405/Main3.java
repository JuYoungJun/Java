package d0405;

import java.util.*;

public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<MapleVO2> characters = new ArrayList<>(10000); // �ʱ� �뷮�� 10000���� ����
		String adminCode = "admin123"; // ������ ��� �ڵ�

		boolean isRunning = true;

		while (isRunning) {
			System.out.println("===== �޴� =====");
			System.out.println("1. ĳ���� ���� �Է��ϱ�");
			System.out.println("2. ĳ���� ���� Ȯ���ϱ�");
			System.out.println("3. ������ ���");
			System.out.println("4. ����");
			System.out.print("�޴��� �����ϼ���: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				if (characters.size() >= 10000) {
					System.out.println("�� �̻� ĳ���� ������ �Է��� �� �����ϴ�. (�ִ� 10000��)");
					break;
				}
				System.out.println("ĳ���� ������ �Է��ϼ���");
				System.out.print("�г���: ");
				String nick = scanner.next();
				if (nick.length() < 1 || nick.length() > 20) {
					System.out.println("�г����� 1�� �̻� 20�� ���Ͽ��� �մϴ�.");
					break;
				}
				if (isDuplicateNick(characters, nick)) {
					System.out.println("�̹� ��� ���� �г����Դϴ�. �ٸ� �г����� �Է����ּ���.");
					break;
				}
				System.out.print("STR: ");
				int str = getIntFromUser(scanner, "STR");
				System.out.print("DEX: ");
				int dex = getIntFromUser(scanner, "DEX");
				System.out.print("INT: ");
				int intel = getIntFromUser(scanner, "INT");
				System.out.print("LUCK: ");
				int luck = getIntFromUser(scanner, "LUCK");
				System.out.print("����: ");
				String server = scanner.next();
				characters.add(new MapleVO2(nick, str, dex, intel, luck, server));
				System.out.println("ĳ���� ������ ���������� �ԷµǾ����ϴ�.");
				break;
			case 2:
				if (characters.isEmpty()) {
					System.out.println("ĳ���� ������ �����ϴ�.");
				} else {
					System.out.println("ĳ���� ���� Ȯ��:");
					for (int i = 0; i < characters.size(); i++) {
						MapleVO2 character = characters.get(i);
						System.out.println((i + 1) + ". �г���: " + character.getNick());
					}
					System.out.print("Ȯ���� ĳ���� ��ȣ�� �Է��ϼ��� (0�� �Է��ϸ� ���� �޴��� ���ư��ϴ�): ");
					int characterIndex = scanner.nextInt();
					if (characterIndex < 1 || characterIndex > characters.size()) {
						System.out.println("�ùٸ��� ���� ��ȣ�Դϴ�.");
					} else {
						MapleVO2 selectedCharacter = characters.get(characterIndex - 1);
						System.out.println("ĳ���� ����:");
						System.out.println("�г���: " + selectedCharacter.getNick());
						System.out.println("STR: " + selectedCharacter.getStr());
						System.out.println("DEX: " + selectedCharacter.getDex());
						System.out.println("INT: " + selectedCharacter.getIntel());
						System.out.println("LUCK: " + selectedCharacter.getLuck());
						System.out.println("����: " + selectedCharacter.getServer());
					}
				}
				break;
			case 3:
				System.out.print("������ ��� �ڵ带 �Է��ϼ���: ");
				String inputCode = scanner.next();
				if (inputCode.equals(adminCode)) {
					System.out.println("������ ��忡 �����Ͽ����ϴ�.");
					System.out.println("���� ��ϵ� ĳ���� ��: " + characters.size() + "��");
				} else {
					System.out.println("�߸��� ��� �ڵ��Դϴ�.");
				}
				break;
			case 4:
				isRunning = false;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�ùٸ��� ���� �����Դϴ�. �ٽ� �������ּ���.");
				break;
			}
		}
		scanner.close();
	}

	// ����ڷκ��� ������ �Է¹ް�, ������ ��� ��� �ٽ� �Է� �޽��ϴ�.
	private static int getIntFromUser(Scanner scanner, String fieldName) {
		int value;
		while (true) {
			if (!scanner.hasNextInt()) {
				System.out.println("�ùٸ��� ���� " + fieldName + " ���Դϴ�. �ٽ� �Է����ּ���.");
				scanner.next(); // �Է� ���� ����
				continue;
			}
			value = scanner.nextInt();
			if (value < 0 || value > 999) {
				System.out.println(fieldName + " ���� 0 �̻� 999 ���Ͽ��� �մϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
			break;
		}
		return value;
	}

	// ����Ʈ�� �̹� ������ �г����� �ִ��� Ȯ���ϴ� �޼ҵ�
	private static boolean isDuplicateNick(List<MapleVO2> characters, String nick) {
		for (MapleVO2 character : characters) {
			if (character.getNick().equals(nick)) {
				return true;
			}
		}
		return false;
	}
}
