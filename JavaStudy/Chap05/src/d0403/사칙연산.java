package d0403;

public class ��Ģ���� {

	public static void main(String[] args) {
		int add = addNumber(100, 200);
		double minus = minusNumber(100, 200);
		double multiply = multiplyNumber(10, 20);
		double division = divisionNumber(5, 2);
		System.out.println("������ ���ϱ�� : " + add);
		System.out.println("������ ����� : " + minus);
		System.out.println("������ ���ϱ�� : " + multiply);
		System.out.println("������ ������� : " + division);
	}//main��

	public static int addNumber(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}//add class��

	public static double minusNumber(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}//minus class��

	public static double multiplyNumber(double num1, double num2) {
		double result1 = num1 * num2;
		return result1;
	}//multiply class��

	public static double divisionNumber(double num1, double num2) {
		double result2 = num1 / num2;
		return result2;
		//����ȯ -> ������ => 2.5
		//������ -> ����ȯ => 2.0
	}//division class��
}//class��
