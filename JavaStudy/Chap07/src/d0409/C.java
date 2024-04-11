package d0409;

import java.util.*;

public class C {
	public static void main(String[] args) {
		ArrayList<String> playlist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		boolean isOnOff = true;

		while (isOnOff) {
			System.out.println("==== Music Player ====");
			System.out.println("[1]추가  [2]삭제  [3]검색  [4]전체조회  [5]종료");
			System.out.print("메뉴를 선택하세요: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("노래 정보 : ");
				String music = sc.next();
				playlist.add(music);
				System.out.println(music + "가 playlist에 추가 되었습니다");
				break;
			case 2:
				System.out.print("제거할 노래를 선택하세요 : ");
				System.out.println();
				for (int i = 0; i < playlist.size(); i++) {
					System.out.println(i + 1 + "." + playlist.get(i));
				}

				System.out.print("번호 >> ");
				int i = sc.nextInt();
				playlist.remove(i - 1);
				break;

			case 3:
				System.out.print("검색할 노래 정보를 입력하세요 :");
				String search = sc.next();
				boolean found = false;

				for (int k = 0; k < playlist.size(); k++) {
					if (playlist.get(k).contains(search)) {
						System.out.println(playlist.get(k));
						found = true;
					}
				}
				if (!found) {
					System.out.println("노래없다");
				}

				break;

			case 4:
				for (int j = 0; j < playlist.size(); j++) {
					System.out.println(j + 1 + "." + playlist.get(j));
				}

				break;

			case 5:
				isOnOff = false;
				System.out.println("프로그램을 종료합니다");
				break;
			}

		}

	}
}
