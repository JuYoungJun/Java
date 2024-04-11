package d0405;

import java.util.*;

public class Main2 {
	public static void main(String[] args) {
//		MapleVO2 m1 = new MapleVO2("이름", 10, 10, 10, 10, "null");
//		MapleVO2 m2 = new MapleVO2("이름", 10, 10, 10, 10, "null");
//		MapleVO2 m3 = new MapleVO2("이름", 10, 10, 10, 10, "null");

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
					System.out.print("닉네임: ");
					String nick = scanner.next();
					System.out.print("STR: ");
					int str = scanner.nextInt();
					System.out.print("DEX: ");
					int dex = scanner.nextInt();
					System.out.print("INT: ");
					int intel = scanner.nextInt();
					System.out.print("LUCK: ");
					int luck = scanner.nextInt();
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
}
