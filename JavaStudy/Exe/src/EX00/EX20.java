package EX00;

import java.util.Scanner;

public class EX20 {

	public static void main(String[] args) {
		int input; //�Է¹��� ���ڿ��� �����ϱ� ���� ����
		int result = 0;//���� ������� �����ϱ� ���� ����, 0���� �ʱ�ȭ
		int tmp;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ���(���ڸ�) : ");
		input = sc.nextInt();
		
		tmp = input;
		
		while (tmp != 0) {
			result += (tmp%10);//������ �����ϴ� result�� ���������� ����
			tmp -= (tmp%10);//���������� ���ش�
			tmp /= 10;//10���� �����ش�
		}
		System.out.println(input + "�� ���ڸ��� �� : " + result); //����� ���
	}

}
