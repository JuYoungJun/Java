package d0320;

public class TypeExample2 {

	public static void main(String[] args) {
		byte num1 = 127;//byte�� -128 ~ 127 ����
		short num2 = 10;//short�� -32,768 ~ 32,767 ����
		char ch = 65;//char�� 0~65535(�����ڵ�) ����
		System.out.println(ch); //�ҹ��� a 97, �빮�� A 65
		int num3 = -2100000000;
		long num4 = 2000000000000L;
		
		num4 = num1;//�ڵ� ����ȯ ���� ������Ÿ���� ū ������Ÿ���� ������ ���� ��
		//ch = num2;
		//num2 = ch;
		byte num5 = 20;
		num5 = num1;
		
		//2���� 1011 -> 11
		//8ģ�� 13
		//16���� 
		int a = 0b1011;
		System.out.println(a);
		
		int b = 013;
		System.out.println(b);
		
		int c = 0xB;
		System.out.println(c);
		
	}

}
