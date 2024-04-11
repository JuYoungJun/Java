package d0405;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MapleVO2[] characters = new MapleVO2[3];
		boolean isRunning = true;

		while (isRunning) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 캐릭터 정보 입력하기");
			System.out.println("2. 캐릭터 정보 확인하기");
			System.out.println("3. 종료");
			System.out.print("메뉴를 선택하세요: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("캐릭터 정보를 입력하세요");
				for (int i = 0; i < 3; i++) {
					System.out.println("캐릭터 " + (i + 1) + " 정보 입력");
					System.out.print("닉네임 (1자 이상 20자 이하): ");
					String nick = scanner.next();
					if (nick.length() < 1 || nick.length() > 20) {
						System.out.println("닉네임은 1자 이상 20자 이하여야 합니다.");
						i--; // 유효하지 않은 입력으로 인해 반복 횟수 감소
						continue;
					}
					System.out.print("STR (1 이상 8 미만): ");
					int str = getIntInRange(scanner, 1, 8, "STR");
					System.out.print("DEX (1 이상 8 미만): ");
					int dex = getIntInRange(scanner, 1, 8, "DEX");
					System.out.print("INT (1 이상 8 미만): ");
					int intel = getIntInRange(scanner, 1, 8, "INT");
					System.out.print("LUCK (1 이상 8 미만): ");
					int luck = getIntInRange(scanner, 1, 8, "LUCK");
					System.out.print("서버: ");
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
					System.out.println("캐릭터 정보를 조회할 수 있는 캐릭터가 없습니다.");
					break;
				}
				System.out.println("캐릭터 정보 확인:");
				for (int i = 0; i < 3; i++) {
					if (characters[i] != null) {
						MapleVO2 character = characters[i];
						System.out.println("캐릭터 " + (i + 1) + " 정보:");
						System.out.println("닉네임: " + character.getNick());
						System.out.println("STR: " + character.getStr());
						System.out.println("DEX: " + character.getDex());
						System.out.println("INT: " + character.getIntel());
						System.out.println("LUCK: " + character.getLuck());
						System.out.println("서버: " + character.getServer());
						System.out.println();
					}
				}
				break;
			case 3:
				isRunning = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		scanner.close();
	}

	// 사용자로부터 범위에 포함된 정수를 입력받는 메소드
	private static int getIntInRange(Scanner scanner, int min, int max, String fieldName) {
		int value;
		while (true) {
			if (!scanner.hasNextInt()) {
				System.out.println(fieldName + " 값은 " + min + " 이상 " + (max - 1) + " 미만이어야 합니다.");
				scanner.next(); // 입력 버퍼 비우기
				continue;
			}
			value = scanner.nextInt();
			if (value < min || value >= max) {
				System.out.println(fieldName + " 값은 " + min + " 이상 " + (max - 1) + " 미만이어야 합니다.");
				continue;
			}
			break;
		}
		return value;
	}
}
