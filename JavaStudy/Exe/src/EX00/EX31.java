package EX00;

import java.util.*;

public class EX31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] grid = new String[3][3];
		boolean isRunning = true;

		while (isRunning) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 배열 입력하기");
			System.out.println("2. 배열의 열의 합 구하기");
			System.out.println("3. 배열 확인하기");
			System.out.println("4. 종료");
			System.out.print("메뉴를 선택하세요: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				// 배열 입력하기
				System.out.println("3개의 문자열을 차례대로 입력하세요:");
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						grid[i][j] = scanner.next();
					}
				}
				break;
			case 2:
				// 배열의 열의 합 구하기
				int[] columnSum = new int[grid[0].length];
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						columnSum[j] += grid[i][j].length();
					}
				}
				System.out.println("각 열의 문자열 개수의 합:");
				for (int i = 0; i < columnSum.length; i++) {
					System.out.println((i + 1) + "번째 열: " + columnSum[i]);
				}
				break;
			case 3:
				// 배열 확인하기
				System.out.println("입력된 배열:");
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						System.out.print(grid[i][j] + " ");
					}
					System.out.println();
				}
				break;
			case 4:
				// 종료
				isRunning = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 선택입니다. 다시 선택하세요.");
			}
		}
	}

}
