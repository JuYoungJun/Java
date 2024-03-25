package d0325;

public class OperatorExample {

	public static void main(String[] args) {
		System.out.println(3%2);
		System.out.println(4%2);
		
		byte a = 5;
//		byte b = -a;
		byte c;//선언
		c=10;//저장, 초기화, 할당, 대입
		
		int num1 = 10;
		num1 = num1+1;
		num1++;//증감연산자
		num1--;//감소연산자
		
		num1 +=1;
		
		
		int num2 = 2;
		num2 *= 3;
		
		int num3 = 5;
		System.out.println(++num3);
		
		
		//기준점을 왼쪽으로
		System.out.println(num2 == num3);
		
		System.out.println(!true);
		System.out.println(!false);
		
		//and * && or+||
		//(true, 1) (false, 0)
		
		int value1 = 5;
		int value2 = 3;
		
		if(value1>value2 && num1 > num2) {
			System.out.println("value1은 value2보다 크고 num1은 num2보다 큽니다.");
		}else{
			System.out.println("value1은 value2보다 작고 num1은 num2보다 작습니다.");
		}
		
		int d = 5;//101
		int e = 7;//111
		
		System.out.println(d|e);
		
		//(조건식)?A:B
		String result = d>e?"참":"거짓";
		System.out.println(result);
		
		//
		System.out.println(d^e);
		
	}

}
