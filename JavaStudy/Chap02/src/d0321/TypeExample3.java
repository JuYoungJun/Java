package d0321;

import java.util.Scanner;

public class TypeExample3 {

	public static void main(String[] args) {
		
		//��������� Ű���� ���� �Է¹޴� �ڵ�
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		int num = Integer.parseInt(str);
		int num2 = Integer.parseInt(str2);
		System.out.println(num+num2);
	
//		int scd = sc.nextInt();
//		int scd2 = sc.nextInt();
//		System.out.println(scd+scd2);
		
//		���ڿ��� �⺻ ������ �������� �ٲٴ� ���
//		byteŸ�� -> Byte.parseByte(���ڿ�) �������� �Ȱ����ϰ� int�� Integer.parseInt(���ڿ�)
//		syso(����+����) -> ����
//		syso(���ڿ�+����+����) -> ���ڿ�+����+����
//		syso(���ڿ�+���ڿ�) -> ���ڿ�+���ڿ� -> ���ڿ�
		
		System.out.println('A'+1);//char+���� -> int
		
		char ch = 'A'+1;//
//		char ch = 66;
		System.out.println(ch);
		
//		���ڿ��� ���� �����ϴ¹��
		String str5 = ""+10;
		String str6 = String.valueOf(10);
	}

}
