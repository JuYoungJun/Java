package d0321;

import java.util.Scanner;

public class TypeExample3 {

	public static void main(String[] args) {
		
		//사용자한테 키보드 값을 입력받는 코드
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		int num = Integer.parseInt(str);
		int num2 = Integer.parseInt(str2);
		System.out.println(num+num2);
	
//		int scd = sc.nextInt();
//		int scd2 = sc.nextInt();
//		System.out.println(scd+scd2);
		
//		문자열을 기본 데이터 차입으로 바꾸는 방법
//		byte타입 -> Byte.parseByte(문자열) 나머지도 똑같이하고 int는 Integer.parseInt(문자열)
//		syso(정수+정수) -> 정수
//		syso(문자열+정수+정수) -> 문자열+정수+정수
//		syso(문자열+문자열) -> 문자열+문자열 -> 문자열
		
		System.out.println('A'+1);//char+정수 -> int
		
		char ch = 'A'+1;//
//		char ch = 66;
		System.out.println(ch);
		
//		문자열에 정수 대입하는방법
		String str5 = ""+10;
		String str6 = String.valueOf(10);
	}

}
