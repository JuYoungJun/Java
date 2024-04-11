package EX00;

import java.util.*;

public class EX32 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] counts = new int[5]; // 1부터 5까지의 숫자의 개수를 저장할 배열 생성

		// 100번 반복하여 랜덤한 숫자를 생성하고, 해당 숫자의 개수를 카운트
		for (int i = 0; i < 100; i++) {
		int randomNumber = random.nextInt(5) + 1;
		counts[randomNumber - 1]++;// 생성된 숫자의 개수를 증가
		}
		// 각 숫자별로 개수와 별을 출력
		for (int i = 0; i < counts.length; i++) {
		// 숫자와 개수 출력
		System.out.print((i + 1) + " (" + counts[i] + "개): ");
		// 개수만큼 별 출력
		printStars(counts[i]);
		System.out.println();
		}
		}

		// 별을 출력하는 메서드
		public static void printStars(int count) {
		for (int i = 0; i < count; i++) {
		System.out.print("*");
		}

	}

}
