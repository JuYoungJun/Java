package d0408;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PoketmonVO[] characters = new PoketmonVO[3];
		boolean isRunning = true;

		while (isRunning) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 포켓몬 정보 입력하기");
			System.out.println("2. 포켓몬 정보 확인하기");
			System.out.println("3. 포켓몬 정보 찾기");
			System.out.println("4. 종료");
			System.out.print("메뉴를 선택하세요: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("캐릭터 정보를 입력하세요");
				for (int i = 0; i < 3; i++) {
					System.out.println("캐릭터 " + (i + 1) + " 정보 입력");
					System.out.print("포켓몬이름 : ");
					String nick = scanner.next();
					System.out.print("속성 : ");
					String property = scanner.next();
					System.out.print("출몰지 : ");
					String hauntingplace = scanner.next();
					System.out.print("HP를 입력하세요 : ");
					int hp = scanner.nextInt();
					System.out.print("레벨을 입력하세요 : ");
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
					System.out.println("조회 할수 있는 포켓몬의 정보가 없습니다.");
					break;
				}
				System.out.println("포켓몬 정보 확인");
				for (int i = 0; i < 3; i++) {
					if (characters[i] != null) {
						PoketmonVO character = characters[i];
						System.out.println("포켓몬 " + (i + 1) + "정보");
						System.out.println("포켓몬 이름 : " + character.getNick());
						System.out.println("속성 : " + character.getProperty());
						System.out.println("출몰지 : " + character.getHauntingplace());
						System.out.println("HP : " + character.getHp());
						System.out.println("LV : " + character.getLv());
						System.out.println();
					}
				}
				break;
			case 3:
				System.out.print("찾을 포켓몬 정보를 입력하세요 : ");
				String poketmon = scanner.next();

				int index = -1;

				for (int i = 0; i < characters.length; i++) {
					if (poketmon.equals(characters[i].getNick())) {
						index = i;
						break;
					}
				}
				if (index != -1) {
					System.out.println(poketmon + "은 " + (index) + "번쨰인덱스에 있습니다.");
				} else {
					System.out.println(poketmon + " 이라는 포켓몬은 존재하지 않은 이름입니다.");
				}
				break;
			case 4:
				isRunning = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		scanner.close();
	}
}
