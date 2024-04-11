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
			System.out.println("[1]�߰�  [2]����  [3]���  [4]����  [5]�뷡���� ��ȸ  [6]���� ");
			System.out.print("�޴��� �����ϼ��� : ");
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
				System.out.println("���α׷��� �����մϴ�.");
				break;

			default:
				System.out.println("�߸��� �Է��Դϴ� �ٽ��Է��ϼ���.");
				break;
			}
		}
	}// main ��

	private static void addMusic(ArrayList<PlaylistVO> playlist, Scanner scanner) {
		System.out.println("===== �߰� =====");
		System.out.print("���� : ");
		String title = scanner.next();
		System.out.print("���� : ");
		String singer = scanner.next();
		System.out.print("��� : ");
		String path = scanner.next();

		PlaylistVO music = new PlaylistVO(title, singer, 0, path);
		playlist.add(music);

		System.out.println("�뷡 ������ �߰� �Ǿ����ϴ�.");
	}// add �޼ҵ� ��

	private static void removeMusic(ArrayList<PlaylistVO> playlist, Scanner scanner) {
		if (playlist.isEmpty()) {
			System.out.println("����ֽ��ϴ�.");
		} else {
			for (int i = 0; i < playlist.size(); i++) {
				System.out.println("[" + (i + 1) + "] " + playlist.get(i).toString());
			}

			System.out.print("������ �뷡�� ��ȣ�� �Է��ϼ��� : ");
			int remove = scanner.nextInt();

			System.out.println("���� �����Ͻðڽ��ϱ�? ������ �����Ϸ��� (Y or y)��, ����Ϸ��� (N or n)�� �Է����ּ���.");
			System.out.print(">>>");
			String cancel = scanner.next();

			if (cancel.equalsIgnoreCase("N")) {
				System.out.println("������ ����մϴ�");
			} else if (cancel.equalsIgnoreCase("Y")) {
				playlist.remove(remove - 1);
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			} else {
				System.out.println("�߸����Է��Դϴ�. �ٽ��Է��ϼ���.");
				removeMusic(playlist, scanner);
			}
		}
	}// remove �޼ҵ� ��

	private static void playMusic(ArrayList<PlaylistVO> playlist, Scanner scanner, MP3Player mp3Player) {
		System.out.println("==== ��ü �뷡 ��� ====");
		for (int i = 0; i < playlist.size(); i++) {
			System.out.println("[" + (i + 1) + "] " + playlist.get(i).toString());
		}

		System.out.print("����� �뷡�� ��ȣ�� �Է��ϼ���: ");
		int index = scanner.nextInt();
		String path = playlist.get(index - 1).getPath();

		if (index < 1 || index > playlist.size()) {
			System.out.println("��ȿ���� ���� �뷡 ��ȣ�Դϴ�.");
			return;
		}

		PlaylistVO song = playlist.get(index - 1);
		System.out.println("�뷡�� ����մϴ� : " + song.getTitle() + " - " + song.getSinget());

		if (mp3Player.isPlaying()) { // ������̸�
			mp3Player.stop(); // �����.
		}

		mp3Player.play(path);
	}// play �޼ҵ� ��

	private static void stopMusic(ArrayList<PlaylistVO> playlist, Scanner scanner, MP3Player mp3Player) {
		System.out.println("������� ���� �����մϴ�.");
		if (mp3Player.isPlaying()) {
			mp3Player.stop();
		}
	}// stop �޼ҵ� ��

	private static void checkMusic(ArrayList<PlaylistVO> playlist, Scanner scanner) {
		System.out.println("==== ��ü ��ȸ ====");
		if (playlist.isEmpty()) {
			System.out.println("��ȸ�� ������ �����ϴ�.");
		} else {
			for (int i = 0; i < playlist.size(); i++) {
				System.out.println("[" + (i + 1) + "]" + playlist.get(i).toString());
			}
		}
	}// search �޼ҵ� ��
}
// class ��
