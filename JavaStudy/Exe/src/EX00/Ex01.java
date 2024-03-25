package EX00;

public class Ex01 {

	public static void main(String[] args) {
		//변수 variable
		//값 가지고 연산, 출력, 재사용할 때에는 변수에 담아야 한다.
		//데이터타입 변수명 = 값(리터럴);
		int a;// 변수 선언
//		int a = 10; //불가능
		a=10; //초기화, 저장, 대입, 할당
		
		int b = 20;
		int c = 30;
//		int x, y, z;
		int x = 10, y= 20, z = 30;
		
		//value1, value2 각각 100,200 넣어서 두개의 값을 합한 결과를 담는 변수를 만들어서 출력
		int value1 = 100, value2=200;
		int value3 = value1+value2;
		System.out.println(value3);
		
		//현재 시간 17:30분 hour, minute 변수에 각각 숫자를 담고 출력할 때에는 현재 시간으 17시 30분 입니다.
		String hour = "17";
		String minute = "30";
		System.out.println("현재 시간은 "+hour+"시 "+minute+"분 입니다.");
		
		//printf -> 형식을 지정해서 출력하고자 할 때 정수 %d
		System.out.printf("현재 시간은 %s시 %s분 입니다.\n", hour, minute);
		
		System.out.println("3 + 4 = "+ 3 +4);
		System.out.println("5 * 6 = "+ 5 * 6);
		System.out.println("10 - 5 = "+ (10 - 5));// 문자열 - 문자열은 없다 출력할려면 ()를 해야한다 
		System.out.println("10 / 2 = "+ 10 / 2);
	}

}
