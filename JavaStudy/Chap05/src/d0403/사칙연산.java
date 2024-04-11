package d0403;

public class 사칙연산 {

	public static void main(String[] args) {
		int add = addNumber(100, 200);
		double minus = minusNumber(100, 200);
		double multiply = multiplyNumber(10, 20);
		double division = divisionNumber(5, 2);
		System.out.println("연산결과 더하기는 : " + add);
		System.out.println("연산결과 빼기는 : " + minus);
		System.out.println("연산결과 곱하기는 : " + multiply);
		System.out.println("연산결과 나누기는 : " + division);
	}//main끝

	public static int addNumber(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}//add class끝

	public static double minusNumber(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}//minus class끝

	public static double multiplyNumber(double num1, double num2) {
		double result1 = num1 * num2;
		return result1;
	}//multiply class끝

	public static double divisionNumber(double num1, double num2) {
		double result2 = num1 / num2;
		return result2;
		//형변환 -> 나누기 => 2.5
		//나누기 -> 형변환 => 2.0
	}//division class끝
}//class끝
