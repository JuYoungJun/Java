package d0321;

public class TypeExample {

	public static void main(String[] args) {
		char ch1 = 'a';//���ڴ� ''�� �ϰ� ���ڿ��� ""�� �Ѵ�
		System.out.println(ch1);
		
		char ch2 = '\u0041';
		System.out.println(ch2);
		char ch3 = 97;
		System.out.println(ch3);
		
		char ch4 = '��';
		System.out.println(ch4);
		
//		char ch5 = '������';���ڿ� �Ұ�
		char ch5 = '\uAC00';
		System.out.println(ch5);
		char ch6 = '\uAC52';
		System.out.println(ch6);
		
		float f1 = 3.14f; //4byte �Ҽ��� �Ʒ� 7�ڸ�����
		float f2 = 314e-2f;//3.14
		float f3 = 3.14e2f;//314.0
		System.out.println(f3);
		System.out.println(f2);
		double d1 = 3.14;//8byt �Ҽ��� �Ʒ� 15�ڸ����� �Ǽ� �⺻��		
		System.out.println(0.1f+0.2f);
		
//		boolean -> true(1), false(0) 1byte
		boolean result = true;
		boolean result2 = false;
		//byte < short = char < int < long < float < double
		
		String name = "ȫ�浿";
		String jop = "����";
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1+num2);
		System.out.println(name+jop);
		
		String str= "���� \"�ڹٸ�\" �����մϴ�.";
		System.out.println(str);//\�� �̽������� ����
		String str2 = "���� \\�ڹ�\\�� �����մϴ�.";
		System.out.println(str2);
		String str3 = "������\t �ֿ���\t ����ȭ";
		String str4 = "������\n�ֿ���\n����ȭ";
		System.out.println(str3);
		System.out.println(str4);
//		System.out.println(); �ڵ� ����� �⺻ \ln�����
	}

}
