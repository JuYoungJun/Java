package d0320;

public class TypeExample {

	public static void main(String[] args) {
		byte num1 = 127;//byte�� -128 ~ 127 ����
		short num2 = 10;//short�� -32,768 ~ 32,767 ����
		char ch = 65;//char�� 0~65535(�����ڵ�) ����
		System.out.println(ch); //�ҹ��� a 97, �빮�� A 65
		int num3 = -2100000000;
		long num4 = 2000000000000L;
		
		byte num5 = (byte)(num1+1);//���� ����ȯ
		System.out.println(num5);
		byte num6 = (byte)(-128-1);
		System.out.println(num6);
	}

}
