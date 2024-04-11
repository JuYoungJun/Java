package d0408_02;

import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<MusicVO> playlist = new ArrayList<MusicVO>();

		boolean isOnOff = true;
		int currentTrackIndex = -1; // ���� ��� ���� Ʈ���� �ε���

		while (isOnOff) {
			System.out.print("========================= Music Player ====================================");
			System.out.println("[1]���  [2]�÷��� ����Ʈ  [3]����  [4]������  [5]���߰�  [6]������  [7]������  [8]����");

			switch (new Scanner(System.in).nextInt()) {
			case 1:
				if (!playlist.isEmpty()) {
					play(playlist.get(currentTrackIndex));
				} else {
					System.out.println("�÷��̸���Ʈ�� ����ֽ��ϴ�.");
				}
				break;
			case 2:
				showPlaylist(playlist);
				break;
			case 3:
				stop();
				break;
			case 4:
				if (!playlist.isEmpty()) {
					currentTrackIndex = previousTrack(currentTrackIndex, playlist.size());
					play(playlist.get(currentTrackIndex));
				} else {
					System.out.println("�÷��̸���Ʈ�� ����ֽ��ϴ�.");
				}
				break;
			case 5:
				if (!playlist.isEmpty()) {
					currentTrackIndex = nextTrack(currentTrackIndex, playlist.size());
					play(playlist.get(currentTrackIndex));
				} else {
					System.out.println("�÷��̸���Ʈ�� ����ֽ��ϴ�.");
				}
				break;
			case 6:
				isOnOff = false;
				System.out.println("���� ��� ���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		}
	}

	// ���� ��� �޼ҵ�
	public static void play(MusicVO music) {
		System.out.println("���� ���: " + music.getName());
		// ���⿡ ���� ��� ������ ���� �ڸ�
	}

	// �÷��̸���Ʈ ��� �޼ҵ�
	public static void showPlaylist(ArrayList<MusicVO> playlist) {
		System.out.println("�÷��� ����Ʈ:");
		for (MusicVO music : playlist) {
			System.out.println(music.getName());
		}
	}

	// ���� �޼ҵ�
	public static void stop() {
		System.out.println("���� ����");
		// ���⿡ ���� ����
	}

	// ���� �� ��� �޼ҵ�
	public static int previousTrack(int currentTrackIndex, int playlistSize) {
		if (currentTrackIndex == -1) {
			return 0;
		} else {
			return (currentTrackIndex - 1 + playlistSize) % playlistSize;
		}
	}

	// ���� �� ��� �޼ҵ�
	public static int nextTrack(int currentTrackIndex, int playlistSize) {
		if (currentTrackIndex == -1) {
			return 0;
		} else {
			return (currentTrackIndex + 1) % playlistSize;
		}
	}
}
