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
			System.out.println("[1]�߰�  [2]����  [3]�˻�  [4]��ü��ȸ  [5]����");
			System.out.print("�޴��� �����ϼ���: ");
			int choice = sc.nextInt();
//
//			while (choice != 3) {
//				if (choice == 1) {
//					System.out.println("�뷡���� : ");
//					String music = sc.next();
//					playlist.add(music);
//					System.out.println(music + "��(��) playlist�� �߰� �Ǿ����ϴ�");
//				} else if (choice == 2) {
//					System.out.println("������ �뷡������ �Է��ϼ��� : ");
//					String music = sc.next();
//					if (playlist.contains(music)) {
//						playlist.remove(music);
//						System.out.println(music + "��(��) playlist���� ���ŵǾ����ϴ�.");
//					} else {
//						System.out.println(music + "��(��) playlist�� �������� �ʽ��ϴ�");
//					}
//				} else if (choice == 3) {
//
//				} else if (choice == 4) {
//					System.out.println("playlist�� �뷡����");
//					for (String musics : playlist) {
//						System.out.println(musics);
//					}
//				}

			switch (choice) {
			case 1:
				System.out.print("�뷡 ���� : ");
				String music = sc.next();
				playlist.add(music);
				System.out.println(music + "�� playlist�� �߰� �Ǿ����ϴ�");
				break;
			case 2:
				System.out.print("������ �뷡�� �����ϼ��� : ");
//				String remove = sc.next();
//				if (playlist.contains(remove)) {
//					playlist.remove(remove);
//					System.out.println(remove + "�� playlist���� �����Ǿ����ϴ�");
//				} else {
//					System.out.println(remove + "�� playlist�� �������� �ʽ��ϴ�");
//				}
				for (int i = 0; i < playlist.size(); i++) {
					System.out.println(i + 1 + "." + playlist.get(i));
				}

				System.out.print("��ȣ >> ");
				int i = sc.nextInt();
				playlist.remove(i - 1);
				break;

			case 3:
				System.out.print("�˻��� �뷡 ������ �Է��ϼ��� :");
//				String serch = sc.next();
//				if (playlist.contains(serch)) {
//					System.out.println(serch + "�� �����Ͽ� �ֽ��ϴ�.");
//				} else {
//					System.out.println(serch + "�� �����Ͽ� �����ϴ�.");
//				}
				break;

			case 4:
				for (int j = 0; j < playlist.size(); j++) {
					System.out.println(j + 1 + "." + playlist.get(j));
				}
//				System.out.println("playlist�� �뷡����");
//				for (String musics : playlist) {
//					System.out.println(musics);
//				}
				break;

			case 5:
				isOnOff = false;
				System.out.println("���α׷��� �����մϴ�");
				break;
			}

		}
	}
}
