package EX00;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
//		int charCode = 'A';
//		
//		if((charCode >= 65) & (charCode <= 90)) {
//			System.out.println("�빮�ڱ���");
//		}
//
//		if((charCode >= 97) && (charCode <= 122)) {
//			System.out.println("�ҹ��ڱ���");
//		}
//
//		if((charCode < 48) && !(charCode > 57)) {
//			System.out.println("0~9 ���ڱ���");
//		}
//		
//		int value = 6;
//		
//		if((value %2 == 0) | (value %3 == 0)) {
//			System.out.println("2 �Ǵ� 3�� �������");
//		}
//		
//		if((value %2 == 0) | (value %3 == 0)) {
//			System.out.println("2 �Ǵ� 3�� �������");
//		}
//		
//		int var1 = 5;
//		int var2 = 2;
//		double var3 = var1/var2;
//		int var4 = ((int)(var3 * var2));
//		System.out.println(var4);
		
//		float var1 = 10f;
//		float var2 = var1 / 100;
//		if(var2 == 0.1f) {
//			System.out.println("10%�Դϴ�");
//		}else {
//			System.out.println("10%�� �ƴմϴ�.");
//		}
		
//		int pencils = 534;
//		int students = 30;
//		
//		int pencilsePerStudent = (pencils / students);
//		System.out.println(pencilsePerStudent);
//		int pencilsLeft = (pencils % students);
//		System.out.println(pencilsLeft);
		
//		int value = 356;
//		System.out.println(value /100 * 100);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° �� : ");
		double num1 = Double.parseDouble(sc.nextLine());

		
		System.out.print("�� ��° �� : ");
		double num2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("----------------------------");
		if(num2 != 0.0) {
			System.out.println("��� : " + num1 / num2);
		}else{
			System.out.println("��� : ���Ѵ�");
	}
//		
//		int score = 85;
//		String result = (!(score > 90)? "��" : "��");
//				System.out.println(result);
	}
}
