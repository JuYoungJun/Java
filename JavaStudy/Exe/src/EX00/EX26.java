package EX00;

public class EX26 {

	public static void main(String[] args) {
		int[] a = new int[10];
		a[0] = 13;
		a[1] = 5;
		a[2] = 7;
		a[3] = 17;
		a[4] = 3;
		a[5] = 16;
		a[6] = 19;
		a[7] = 20;
		a[8] = 2;
		a[9] = 1;
//		System.out.print("index 0���� : " + a[0] + "\n");		
//		System.out.print("index 1���� : " + a[1] + "\n");		
//		System.out.print("index 2���� : " + a[2] + "\n");		
//		System.out.print("index 3���� : " + a[3] + "\n");		
//		System.out.print("index 4���� : " + a[4] + "\n");		
//		System.out.print("index 5���� : " + a[5] + "\n");		
//		System.out.print("index 6���� : " + a[6] + "\n");		
//		System.out.print("index 7���� : " + a[7] + "\n");		
//		System.out.print("index 8���� : " + a[8] + "\n");		
//		System.out.print("index 9���� : " + a[9] + "\n");		

//		int[] array = new int[10];// 0~9
		// new => �޸� �����ϴ� Ű����
		// new ���� ���°�? => �޸�����
		// �޸� �����ϸ� �ּ� �ο�!
		// �ּҸ� �����س��� ���߿� ã�ư� �� ����..!
		// ������ �� ���°� => ����
		// ������ �����ε� �ּҸ� ����? ���۷��� ����
		// ���۷��� ������ Ÿ���� �޸��� ���¿� �����ϰ�!

		// �迭 ���� �� ���� �ʱ�ȭ���� ������ int => 0, String => null
//		int[] array2;
//		array2[2] = 5; ������ ���� new�� ���۷��� ������ �������� ����
		
		//por-each�� (Ȯ�� for��) �迭�̶� ���̾���
//		for(int temp : a) { tem : �迭 �̸� �迭 ������ŭ �ݺ� �Ѵ�
//			System.out.println(temp);
//		}

		int sum = 0;

		System.out.print("a�� ����ִ� Ȧ���� ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.print(a[i] + " ");
				sum++;
			}
		}
		System.out.print("�̸�");
		System.out.println("�� " + sum + "�� �Դϴ�.");
	}
	
	
	

}
