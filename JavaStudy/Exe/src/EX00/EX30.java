package EX00;

public class EX30 {
	public static void main(String[] args) {
		String[][] grid = { { "apple", "banana", "cherry" },
							{ "dog", "elephant", "fox" },
							{ "grape", "hedgehog", "iguana" } };

		// �� ���� ���ڿ� ������ ���� ������ �迭
		int[] columnSum = new int[grid[0].length];

		// �� ���� ���ڿ� ������ �� ���
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				columnSum[j] += grid[i][j].length();
			}
		}

		// ��� ���
		for (int i = 0; i < columnSum.length; i++) {
			System.out.println((i + 1) + "��° ���� ���ڿ� ������ ��: " + columnSum[i]);
		}
	}

}
