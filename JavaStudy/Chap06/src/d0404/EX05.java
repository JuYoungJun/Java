package d0404;

public class EX05 {

	public static void main(String[] args) {
		int result = shortest(-10, 9);
		System.out.println("10에 가까운 수는 : " + result);
	}

	// 1. Math.abs() 절대값 함수
	// 2. 10보다 큰수라면 숫자 -10 10보다 작은수면 10-숫자
	// 3. 제곱
	public static int shortest(int num1, int num2) {
		// 10과 더 가까운수 담을 변수생성
		int res = 0;

		// 10과의 차이(음수일수도 있다)
		int resultNum1 = 10 - num1;
		int resultNum2 = 10 - num2;

		// 음수인 resultNum에 절댓값 주기
		if (resultNum1 < 0) {
			resultNum1 = -1 * resultNum1;
		}

		if (resultNum2 < 0) {
			resultNum2 = -1 * resultNum2;
		}

		// 비교해서 return 해주기
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
