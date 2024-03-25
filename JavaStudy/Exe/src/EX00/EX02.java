package EX00;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
//		int charCode = 'A';
//		
//		if((charCode >= 65) & (charCode <= 90)) {
//			System.out.println("대문자군요");
//		}
//
//		if((charCode >= 97) && (charCode <= 122)) {
//			System.out.println("소문자군요");
//		}
//
//		if((charCode < 48) && !(charCode > 57)) {
//			System.out.println("0~9 숫자군요");
//		}
//		
//		int value = 6;
//		
//		if((value %2 == 0) | (value %3 == 0)) {
//			System.out.println("2 또는 3의 배수군요");
//		}
//		
//		if((value %2 == 0) | (value %3 == 0)) {
//			System.out.println("2 또는 3의 배수군요");
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
//			System.out.println("10%입니다");
//		}else {
//			System.out.println("10%가 아닙니다.");
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
		
		System.out.print("첫 번째 수 : ");
		double num1 = Double.parseDouble(sc.nextLine());

		
		System.out.print("두 번째 수 : ");
		double num2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("----------------------------");
		if(num2 != 0.0) {
			System.out.println("결과 : " + num1 / num2);
		}else{
			System.out.println("결과 : 무한대");
	}
//		
//		int score = 85;
//		String result = (!(score > 90)? "가" : "나");
//				System.out.println(result);
	}
}
