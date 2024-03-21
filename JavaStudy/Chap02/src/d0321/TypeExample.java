package d0321;

public class TypeExample {

	public static void main(String[] args) {
		char ch1 = 'a';//문자는 ''로 하고 문자열은 ""로 한다
		System.out.println(ch1);
		
		char ch2 = '\u0041';
		System.out.println(ch2);
		char ch3 = 97;
		System.out.println(ch3);
		
		char ch4 = '가';
		System.out.println(ch4);
		
//		char ch5 = '가나다';문자열 불가
		char ch5 = '\uAC00';
		System.out.println(ch5);
		char ch6 = '\uAC52';
		System.out.println(ch6);
		
		float f1 = 3.14f; //4byte 소수점 아래 7자리까지
		float f2 = 314e-2f;//3.14
		float f3 = 3.14e2f;//314.0
		System.out.println(f3);
		System.out.println(f2);
		double d1 = 3.14;//8byt 소수점 아래 15자리까지 실수 기본형		
		System.out.println(0.1f+0.2f);
		
//		boolean -> true(1), false(0) 1byte
		boolean result = true;
		boolean result2 = false;
		//byte < short = char < int < long < float < double
		
		String name = "홍길동";
		String jop = "도적";
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1+num2);
		System.out.println(name+jop);
		
		String str= "나는 \"자바를\" 좋아합니다.";
		System.out.println(str);//\는 이스케이프 문자
		String str2 = "나는 \\자바\\를 좋아합니다.";
		System.out.println(str2);
		String str3 = "김희재\t 주영준\t 심폄화";
		String str4 = "김희재\n주영준\n심폄화";
		System.out.println(str3);
		System.out.println(str4);
//		System.out.println(); 코드 실행시 기본 \ln사용중
	}

}
