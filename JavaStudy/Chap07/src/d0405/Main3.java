package d0405;

import java.util.*;

public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<MapleVO2> characters = new ArrayList<>(10000); // 초기 용량을 10000으로 설정
		String adminCode = "admin123"; // 관리자 비밀 코드

		boolean isRunning = true;

		while (isRunning) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 캐릭터 정보 입력하기");
			System.out.println("2. 캐릭터 정보 확인하기");
			System.out.println("3. 관리자 모드");
			System.out.println("4. 종료");
			System.out.print("메뉴를 선택하세요: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				if (characters.size() >= 10000) {
					System.out.println("더 이상 캐릭터 정보를 입력할 수 없습니다. (최대 10000개)");
					break;
				}
				System.out.println("캐릭터 정보를 입력하세요");
				System.out.print("닉네임: ");
				String nick = scanner.next();
				if (nick.length() < 1 || nick.length() > 20) {
					System.out.println("닉네임은 1자 이상 20자 이하여야 합니다.");
					break;
				}
				if (isDuplicateNick(characters, nick)) {
					System.out.println("이미 사용 중인 닉네임입니다. 다른 닉네임을 입력해주세요.");
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
				System.out.print("서버: ");
				String server = scanner.next();
				characters.add(new MapleVO2(nick, str, dex, intel, luck, server));
				System.out.println("캐릭터 정보가 성공적으로 입력되었습니다.");
				break;
			case 2:
				if (characters.isEmpty()) {
					System.out.println("캐릭터 정보가 없습니다.");
				} else {
					System.out.println("캐릭터 정보 확인:");
					for (int i = 0; i < characters.size(); i++) {
						MapleVO2 character = characters.get(i);
						System.out.println((i + 1) + ". 닉네임: " + character.getNick());
					}
					System.out.print("확인할 캐릭터 번호를 입력하세요 (0을 입력하면 이전 메뉴로 돌아갑니다): ");
					int characterIndex = scanner.nextInt();
					if (characterIndex < 1 || characterIndex > characters.size()) {
						System.out.println("올바르지 않은 번호입니다.");
					} else {
						MapleVO2 selectedCharacter = characters.get(characterIndex - 1);
						System.out.println("캐릭터 정보:");
						System.out.println("닉네임: " + selectedCharacter.getNick());
						System.out.println("STR: " + selectedCharacter.getStr());
						System.out.println("DEX: " + selectedCharacter.getDex());
						System.out.println("INT: " + selectedCharacter.getIntel());
						System.out.println("LUCK: " + selectedCharacter.getLuck());
						System.out.println("서버: " + selectedCharacter.getServer());
					}
				}
				break;
			case 3:
				System.out.print("관리자 비밀 코드를 입력하세요: ");
				String inputCode = scanner.next();
				if (inputCode.equals(adminCode)) {
					System.out.println("관리자 모드에 접속하였습니다.");
					System.out.println("현재 등록된 캐릭터 수: " + characters.size() + "개");
				} else {
					System.out.println("잘못된 비밀 코드입니다.");
				}
				break;
			case 4:
				isRunning = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("올바르지 않은 선택입니다. 다시 선택해주세요.");
				break;
			}
		}
		scanner.close();
	}

	// 사용자로부터 정수를 입력받고, 범위를 벗어난 경우 다시 입력 받습니다.
	private static int getIntFromUser(Scanner scanner, String fieldName) {
		int value;
		while (true) {
			if (!scanner.hasNextInt()) {
				System.out.println("올바르지 않은 " + fieldName + " 값입니다. 다시 입력해주세요.");
				scanner.next(); // 입력 버퍼 비우기
				continue;
			}
			value = scanner.nextInt();
			if (value < 0 || value > 999) {
				System.out.println(fieldName + " 값은 0 이상 999 이하여야 합니다. 다시 입력해주세요.");
				continue;
			}
			break;
		}
		return value;
	}

	// 리스트에 이미 동일한 닉네임이 있는지 확인하는 메소드
	private static boolean isDuplicateNick(List<MapleVO2> characters, String nick) {
		for (MapleVO2 character : characters) {
			if (character.getNick().equals(nick)) {
				return true;
			}
		}
		return false;
	}
}
