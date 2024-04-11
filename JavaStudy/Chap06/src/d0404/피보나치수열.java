package d0404;

public class 피보나치수열 {

	public static void main(String[] args) {
		// 피보나치 수열은 = F(n) = F(n - 1) + F(n - 2)
		System.out.println(pibo(35));
	}
	
	public static int pibo(int n) {
		// n이 1이거나 2면
		if(n == 1 || n == 2) {
			return 1;
		}else {
			return pibo(n - 2) + pibo(n - 1); //재귀함수(자기가 자기를 부른거)
		}
	}

}
