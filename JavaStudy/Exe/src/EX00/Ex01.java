package EX00;

public class Ex01 {

	public static void main(String[] args) {
		//���� variable
		//�� ������ ����, ���, ������ ������ ������ ��ƾ� �Ѵ�.
		//������Ÿ�� ������ = ��(���ͷ�);
		int a;// ���� ����
//		int a = 10; //�Ұ���
		a=10; //�ʱ�ȭ, ����, ����, �Ҵ�
		
		int b = 20;
		int c = 30;
//		int x, y, z;
		int x = 10, y= 20, z = 30;
		
		//value1, value2 ���� 100,200 �־ �ΰ��� ���� ���� ����� ��� ������ ���� ���
		int value1 = 100, value2=200;
		int value3 = value1+value2;
		System.out.println(value3);
		
		//���� �ð� 17:30�� hour, minute ������ ���� ���ڸ� ��� ����� ������ ���� �ð��� 17�� 30�� �Դϴ�.
		String hour = "17";
		String minute = "30";
		System.out.println("���� �ð��� "+hour+"�� "+minute+"�� �Դϴ�.");
		
		//printf -> ������ �����ؼ� ����ϰ��� �� �� ���� %d
		System.out.printf("���� �ð��� %s�� %s�� �Դϴ�.\n", hour, minute);
		
		System.out.println("3 + 4 = "+ 3 +4);
		System.out.println("5 * 6 = "+ 5 * 6);
		System.out.println("10 - 5 = "+ (10 - 5));// ���ڿ� - ���ڿ��� ���� ����ҷ��� ()�� �ؾ��Ѵ� 
		System.out.println("10 / 2 = "+ 10 / 2);
	}

}
