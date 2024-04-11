package EX00;

public class EX30 {
	public static void main(String[] args) {
		String[][] grid = { { "apple", "banana", "cherry" },
							{ "dog", "elephant", "fox" },
							{ "grape", "hedgehog", "iguana" } };

		// 각 열의 문자열 개수의 합을 저장할 배열
		int[] columnSum = new int[grid[0].length];

		// 각 열의 문자열 개수의 합 계산
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				columnSum[j] += grid[i][j].length();
			}
		}

		// 결과 출력
		for (int i = 0; i < columnSum.length; i++) {
			System.out.println((i + 1) + "번째 열의 문자열 개수의 합: " + columnSum[i]);
		}
	}

}
