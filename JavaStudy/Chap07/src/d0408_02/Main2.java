package d0408_02;

import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<MusicVO> playlist = new ArrayList<MusicVO>();

		boolean isOnOff = true;
		int currentTrackIndex = -1; // 현재 재생 중인 트랙의 인덱스

		while (isOnOff) {
			System.out.print("========================= Music Player ====================================");
			System.out.println("[1]재생  [2]플레이 리스트  [3]정지  [4]이전곡  [5]곡추가  [6]곡제거  [7]다음곡  [8]종료");

			switch (new Scanner(System.in).nextInt()) {
			case 1:
				if (!playlist.isEmpty()) {
					play(playlist.get(currentTrackIndex));
				} else {
					System.out.println("플레이리스트가 비어있습니다.");
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
					System.out.println("플레이리스트가 비어있습니다.");
				}
				break;
			case 5:
				if (!playlist.isEmpty()) {
					currentTrackIndex = nextTrack(currentTrackIndex, playlist.size());
					play(playlist.get(currentTrackIndex));
				} else {
					System.out.println("플레이리스트가 비어있습니다.");
				}
				break;
			case 6:
				isOnOff = false;
				System.out.println("음악 재생 프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	// 음악 재생 메소드
	public static void play(MusicVO music) {
		System.out.println("음악 재생: " + music.getName());
		// 여기에 음악 재생 로직을 너을 자리
	}

	// 플레이리스트 출력 메소드
	public static void showPlaylist(ArrayList<MusicVO> playlist) {
		System.out.println("플레이 리스트:");
		for (MusicVO music : playlist) {
			System.out.println(music.getName());
		}
	}

	// 정지 메소드
	public static void stop() {
		System.out.println("음악 정지");
		// 여기에 정지 로직
	}

	// 이전 곡 재생 메소드
	public static int previousTrack(int currentTrackIndex, int playlistSize) {
		if (currentTrackIndex == -1) {
			return 0;
		} else {
			return (currentTrackIndex - 1 + playlistSize) % playlistSize;
		}
	}

	// 다음 곡 재생 메소드
	public static int nextTrack(int currentTrackIndex, int playlistSize) {
		if (currentTrackIndex == -1) {
			return 0;
		} else {
			return (currentTrackIndex + 1) % playlistSize;
		}
	}
}
