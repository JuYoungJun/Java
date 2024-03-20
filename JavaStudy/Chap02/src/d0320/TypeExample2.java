package d0320;

public class TypeExample2 {

	public static void main(String[] args) {
		byte num1 = 127;//byte는 -128 ~ 127 가능
		short num2 = 10;//short는 -32,768 ~ 32,767 가능
		char ch = 65;//char는 0~65535(유니코드) 가능
		System.out.println(ch); //소문자 a 97, 대문자 A 65
		int num3 = -2100000000;
		long num4 = 2000000000000L;
		
		num4 = num1;//자동 형변환 작은 데이터타입이 큰 데이터타입인 변수에 들어가는 것
		//ch = num2;
		//num2 = ch;
		byte num5 = 20;
		num5 = num1;
		
		//2진수 1011 -> 11
		//8친수 13
		//16진수 
		int a = 0b1011;
		System.out.println(a);
		
		int b = 013;
		System.out.println(b);
		
		int c = 0xB;
		System.out.println(c);
		
	}

}
