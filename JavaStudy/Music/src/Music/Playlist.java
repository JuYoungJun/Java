package Music;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.*;

public class Playlist {
	public static void main(String[] args) {
		ArrayList<PlaylistVO> playlist = new ArrayList<PlaylistVO>();
		Scanner sc = new Scanner(System.in);

		MP3Player mp3 = new MP3Player();

		boolean isOnoff = true;

		while (isOnoff) {
			System.out.println("==================== Music player ===================");
			System.out.println("[1]추가  [2]삭제  [3]재생  [4]정지  [5]노래정보 조회  [6]종료 ");
			System.out.print("메뉴를 선택하세요 : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addMusic(playlist, sc);
				break;

			case 2:
				removeMusic(playlist, sc);
				break;

			case 3:
				playMusic(playlist, sc, mp3);
				break;

			case 4:
				stopMusic(playlist, sc, mp3);
				break;

			case 5:
				checkMusic(playlist, sc);
				break;

			case 6:
				isOnoff = false;
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				System.out.println("잘못된 입력입니다 다시입력하세요.");
				break;
			}
		}
	}// main 끝

	private static void addMusic(ArrayList<PlaylistVO> playlist, Scanner scanner) {
		System.out.println("===== 추가 =====");
		System.out.print("제목 : ");
		String title = scanner.next();
		System.out.print("가수 : ");
		String singer = scanner.next();
		System.out.print("경로 : ");
		String path = scanner.next();

		PlaylistVO music = new PlaylistVO(title, singer, 0, path);
		playlist.add(music);

		System.out.println("노래 정보가 추가 되었습니다.");
	}// add 메소드 끝

	private static void removeMusic(ArrayList<PlaylistVO> playlist, Scanner scanner) {
		if (playlist.isEmpty()) {
			System.out.println("비어있습니다.");
		} else {
			for (int i = 0; i < playlist.size(); i++) {
				System.out.println("[" + (i + 1) + "] " + playlist.get(i).toString());
			}

			System.out.print("삭제할 노래의 번호를 입력하세요 : ");
			int remove = scanner.nextInt();

			System.out.println("정말 삭제하시겠습니까? 삭제를 진행하려면 (Y or y)를, 취소하려면 (N or n)를 입력해주세요.");
			System.out.print(">>>");
			String cancel = scanner.next();

			if (cancel.equalsIgnoreCase("N")) {
				System.out.println("삭제를 취소합니다");
			} else if (cancel.equalsIgnoreCase("Y")) {
				playlist.remove(remove - 1);
				System.out.println("삭제가 완료되었습니다.");
			} else {
				System.out.println("잘못된입력입니다. 다시입력하세요.");
				removeMusic(playlist, scanner);
			}
		}
	}// remove 메소드 끝

	private static void playMusic(ArrayList<PlaylistVO> playlist, Scanner scanner, MP3Player mp3Player) {
		System.out.println("==== 전체 노래 목록 ====");
		for (int i = 0; i < playlist.size(); i++) {
			System.out.println("[" + (i + 1) + "] " + playlist.get(i).toString());
		}

		System.out.print("재생할 노래의 번호를 입력하세요: ");
		int index = scanner.nextInt();
		String path = playlist.get(index - 1).getPath();

		if (index < 1 || index > playlist.size()) {
			System.out.println("유효하지 않은 노래 번호입니다.");
			return;
		}

		PlaylistVO song = playlist.get(index - 1);
		System.out.println("노래를 재생합니다 : " + song.getTitle() + " - " + song.getSinget());

		if (mp3Player.isPlaying()) { // 재생중이면
			mp3Player.stop(); // 멈춘다.
		}

		mp3Player.play(path);
	}// play 메소드 끝

	private static void stopMusic(ArrayList<PlaylistVO> playlist, Scanner scanner, MP3Player mp3Player) {
		System.out.println("재생중인 곡을 정지합니다.");
		if (mp3Player.isPlaying()) {
			mp3Player.stop();
		}
	}// stop 메소드 끝

	private static void checkMusic(ArrayList<PlaylistVO> playlist, Scanner scanner) {
		System.out.println("==== 전체 조회 ====");
		if (playlist.isEmpty()) {
			System.out.println("조회할 정보가 없습니다.");
		} else {
			for (int i = 0; i < playlist.size(); i++) {
				System.out.println("[" + (i + 1) + "]" + playlist.get(i).toString());
			}
		}
	}// search 메소드 끝
}
// class 끝
