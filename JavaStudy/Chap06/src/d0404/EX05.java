package d0404;

public class EX05 {

	public static void main(String[] args) {
		int result = shortest(-10, 9);
		System.out.println("10�� ����� ���� : " + result);
	}

	// 1. Math.abs() ���밪 �Լ�
	// 2. 10���� ū����� ���� -10 10���� �������� 10-����
	// 3. ����
	public static int shortest(int num1, int num2) {
		// 10�� �� ������ ���� ��������
		int res = 0;

		// 10���� ����(�����ϼ��� �ִ�)
		int resultNum1 = 10 - num1;
		int resultNum2 = 10 - num2;

		// ������ resultNum�� ���� �ֱ�
		if (resultNum1 < 0) {
			resultNum1 = -1 * resultNum1;
		}

		if (resultNum2 < 0) {
			resultNum2 = -1 * resultNum2;
		}

		// ���ؼ� return ���ֱ�
		if (resultNum1 > resultNum2) {
			res = num2;
		} else if (resultNum1 < resultNum2) {
			res = num1;
		} else {
			res = 0;
		}
		return res;
	}
}
