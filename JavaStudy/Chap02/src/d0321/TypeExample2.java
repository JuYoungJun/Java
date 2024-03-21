package d0321;

public class TypeExample2 {

	public static void main(String[] args) {
//		byte num1 = 10;
//		int num2 = num1; //자동타입변환
//		long num3 = num2;
//		float num4 = num3;
//		double num5 = num4;
//		
//		byte n1 = (byte)num2;//강제 형변환
//		int n2 = (int)num3;
//		int n3 = 65;
//		
//		char ch1 = (char)n3;
//		System.out.println(ch1);
//		
//		byte b1 = 10;
//		byte b2 = 20;
////		byte b3 = b1+b2; 연산후 결과는 int다
//		int i1 = 10;
//		long l1 = 20;
////		int result = i1+l1; 작은 데이터 타입 +큰 데이터 타입 연산 -> 큰 데이터 타입이 된다
//		double result = i1+3.14; //int + double=double
		
		int a = 10;
		int b = 2;
		System.out.println(a/b);
		
		int a2 = 5;
		int b2 = 2;
		System.out.println(a2/b2);//2 수수점 아래는 날아간다
		
		System.out.println(5/2.0);
		
		System.out.println("얀녕"+"하세요");//+는연결
		System.out.println(2+3+4);
		System.out.println(2+3+"안녕하세요");
		System.out.println("안녕하세요"+2+3);
		
		String str1 = "10";
		String str2 = "20";
		System.out.println(str1+str2);
		
		//문자역을 기본 데이터 타입으로 변환 
		byte byte1 = Byte.parseByte(str1);
		short short1 = Byte.parseByte(str2);
		int int1 = Integer.parseInt(str2);
		long long1 = Long.parseLong(str2);
		float float1 = Float.parseFloat(str2);
		double double1 = Double.parseDouble(str2);
		Boolean bool1 = Boolean.parseBoolean("true");
		System.out.println(byte1);
		
	}

}
