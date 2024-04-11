package d0409;

import java.util.*;

public class C {
	public static void main(String[] args) {
		ArrayList<String> playlist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		boolean isOnOff = true;

		while (isOnOff) {
			System.out.println("==== Music Player ====");
			System.out.println("[1]�߰�  [2]����  [3]�˻�  [4]��ü��ȸ  [5]����");
			System.out.print("�޴��� �����ϼ���: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("�뷡 ���� : ");
				String music = sc.next();
				playlist.add(music);
				System.out.println(music + "�� playlist�� �߰� �Ǿ����ϴ�");
				break;
			case 2:
				System.out.print("������ �뷡�� �����ϼ��� : ");
				System.out.println();
				for (int i = 0; i < playlist.size(); i++) {
					System.out.println(i + 1 + "." + playlist.get(i));
				}

				System.out.print("��ȣ >> ");
				int i = sc.nextInt();
				playlist.remove(i - 1);
				break;

			case 3:
				System.out.print("�˻��� �뷡 ������ �Է��ϼ��� :");
				String search = sc.next();
				boolean found = false;

				for (int k = 0; k < playlist.size(); k++) {
					if (playlist.get(k).contains(search)) {
						System.out.println(playlist.get(k));
						found = true;
					}
				}
				if (!found) {
					System.out.println("�뷡����");
				}

				break;

			case 4:
				for (int j = 0; j < playlist.size(); j++) {
					System.out.println(j + 1 + "." + playlist.get(j));
				}

				break;

			case 5:
				isOnOff = false;
				System.out.println("���α׷��� �����մϴ�");
				break;
			}

		}

	}
}
