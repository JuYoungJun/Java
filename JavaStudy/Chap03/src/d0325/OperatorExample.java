package d0325;

public class OperatorExample {

	public static void main(String[] args) {
		System.out.println(3%2);
		System.out.println(4%2);
		
		byte a = 5;
//		byte b = -a;
		byte c;//����
		c=10;//����, �ʱ�ȭ, �Ҵ�, ����
		
		int num1 = 10;
		num1 = num1+1;
		num1++;//����������
		num1--;//���ҿ�����
		
		num1 +=1;
		
		
		int num2 = 2;
		num2 *= 3;
		
		int num3 = 5;
		System.out.println(++num3);
		
		
		//�������� ��������
		System.out.println(num2 == num3);
		
		System.out.println(!true);
		System.out.println(!false);
		
		//and * && or+||
		//(true, 1) (false, 0)
		
		int value1 = 5;
		int value2 = 3;
		
		if(value1>value2 && num1 > num2) {
			System.out.println("value1�� value2���� ũ�� num1�� num2���� Ů�ϴ�.");
		}else{
			System.out.println("value1�� value2���� �۰� num1�� num2���� �۽��ϴ�.");
		}
		
		int d = 5;//101
		int e = 7;//111
		
		System.out.println(d|e);
		
		//(���ǽ�)?A:B
		String result = d>e?"��":"����";
		System.out.println(result);
		
		//
		System.out.println(d^e);
		
	}

}
