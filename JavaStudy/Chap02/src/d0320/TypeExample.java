package d0320;

public class TypeExample {

	public static void main(String[] args) {
		byte num1 = 127;//byte는 -128 ~ 127 가능
		short num2 = 10;//short는 -32,768 ~ 32,767 가능
		char ch = 65;//char는 0~65535(유니코드) 가능
		System.out.println(ch); //소문자 a 97, 대문자 A 65
		int num3 = -2100000000;
		long num4 = 2000000000000L;
		
		byte num5 = (byte)(num1+1);//강제 형변환
		System.out.println(num5);
		byte num6 = (byte)(-128-1);
		System.out.println(num6);
	}

}
