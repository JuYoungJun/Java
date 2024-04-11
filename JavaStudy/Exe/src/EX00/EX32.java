package EX00;

import java.util.*;

public class EX32 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] counts = new int[5]; // 1���� 5������ ������ ������ ������ �迭 ����

		// 100�� �ݺ��Ͽ� ������ ���ڸ� �����ϰ�, �ش� ������ ������ ī��Ʈ
		for (int i = 0; i < 100; i++) {
		int randomNumber = random.nextInt(5) + 1;
		counts[randomNumber - 1]++;// ������ ������ ������ ����
		}
		// �� ���ں��� ������ ���� ���
		for (int i = 0; i < counts.length; i++) {
		// ���ڿ� ���� ���
		System.out.print((i + 1) + " (" + counts[i] + "��): ");
		// ������ŭ �� ���
		printStars(counts[i]);
		System.out.println();
		}
		}

		// ���� ����ϴ� �޼���
		public static void printStars(int count) {
		for (int i = 0; i < count; i++) {
		System.out.print("*");
		}

	}

}
