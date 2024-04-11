package EX00;

import java.util.*;

public class EX31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] grid = new String[3][3];
		boolean isRunning = true;

		while (isRunning) {
			System.out.println("===== �޴� =====");
			System.out.println("1. �迭 �Է��ϱ�");
			System.out.println("2. �迭�� ���� �� ���ϱ�");
			System.out.println("3. �迭 Ȯ���ϱ�");
			System.out.println("4. ����");
			System.out.print("�޴��� �����ϼ���: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				// �迭 �Է��ϱ�
				System.out.println("3���� ���ڿ��� ���ʴ�� �Է��ϼ���:");
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						grid[i][j] = scanner.next();
					}
				}
				break;
			case 2:
				// �迭�� ���� �� ���ϱ�
				int[] columnSum = new int[grid[0].length];
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						columnSum[j] += grid[i][j].length();
					}
				}
				System.out.println("�� ���� ���ڿ� ������ ��:");
				for (int i = 0; i < columnSum.length; i++) {
					System.out.println((i + 1) + "��° ��: " + columnSum[i]);
				}
				break;
			case 3:
				// �迭 Ȯ���ϱ�
				System.out.println("�Էµ� �迭:");
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						System.out.print(grid[i][j] + " ");
					}
					System.out.println();
				}
				break;
			case 4:
				// ����
				isRunning = false;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸��� �����Դϴ�. �ٽ� �����ϼ���.");
			}
		}
	}

}
