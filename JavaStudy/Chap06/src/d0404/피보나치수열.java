package d0404;

public class �Ǻ���ġ���� {

	public static void main(String[] args) {
		// �Ǻ���ġ ������ = F(n) = F(n - 1) + F(n - 2)
		System.out.println(pibo(35));
	}
	
	public static int pibo(int n) {
		// n�� 1�̰ų� 2��
		if(n == 1 || n == 2) {
			return 1;
		}else {
			return pibo(n - 2) + pibo(n - 1); //����Լ�(�ڱⰡ �ڱ⸦ �θ���)
		}
	}

}
