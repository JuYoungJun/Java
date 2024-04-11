package d0409;

import java.util.ArrayList;
import java.util.Scanner;

public class Music {
	public static void main(String[] args) {
		ArrayList<String> playlist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		boolean isOnOff = true;

		while (isOnOff) {
			System.out.println("==== Music Player ====");
			System.out.println("[1]추가  [2]삭제  [3]검색  [4]전체조회  [5]종료");
			System.out.print("메뉴를 선택하세요: ");
			int choice = sc.nextInt();
//
//			while (choice != 3) {
//				if (choice == 1) {
//					System.out.println("노래정보 : ");
//					String music = sc.next();
//					playlist.add(music);
//					System.out.println(music + "이(가) playlist에 추가 되었습니다");
//				} else if (choice == 2) {
//					System.out.println("제거할 노래정보를 입력하세요 : ");
//					String music = sc.next();
//					if (playlist.contains(music)) {
//						playlist.remove(music);
//						System.out.println(music + "이(가) playlist에서 제거되었습니다.");
//					} else {
//						System.out.println(music + "은(는) playlist에 존재하지 않습니다");
//					}
//				} else if (choice == 3) {
//
//				} else if (choice == 4) {
//					System.out.println("playlist의 노래정보");
//					for (String musics : playlist) {
//						System.out.println(musics);
//					}
//				}

			switch (choice) {
			case 1:
				System.out.print("노래 정보 : ");
				String music = sc.next();
				playlist.add(music);
				System.out.println(music + "가 playlist에 추가 되었습니다");
				break;
			case 2:
				System.out.print("제거할 노래를 선택하세요 : ");
//				String remove = sc.next();
//				if (playlist.contains(remove)) {
//					playlist.remove(remove);
//					System.out.println(remove + "가 playlist에서 삭제되었습니다");
//				} else {
//					System.out.println(remove + "는 playlist에 존재하지 않습니다");
//				}
				for (int i = 0; i < playlist.size(); i++) {
					System.out.println(i + 1 + "." + playlist.get(i));
				}

				System.out.print("번호 >> ");
				int i = sc.nextInt();
				playlist.remove(i - 1);
				break;

			case 3:
				System.out.print("검색할 노래 정보를 입력하세요 :");
//				String serch = sc.next();
//				if (playlist.contains(serch)) {
//					System.out.println(serch + "는 재생목록에 있습니다.");
//				} else {
//					System.out.println(serch + "는 재생목록에 없습니다.");
//				}
				break;

			case 4:
				for (int j = 0; j < playlist.size(); j++) {
					System.out.println(j + 1 + "." + playlist.get(j));
				}
//				System.out.println("playlist의 노래정보");
//				for (String musics : playlist) {
//					System.out.println(musics);
//				}
				break;

			case 5:
				isOnOff = false;
				System.out.println("프로그램을 종료합니다");
				break;
			}

		}
	}
}
