package d0403;

public class Method {

	public static void main(String[] args) {
		// 메소드 는 설계법(추상적이게 짜야된다 구체적이게하면 안되고) 메소드를 쓰면 유연하다
//		public(접근제한자) static(메모리 할당 위치/ 스태틱 에어리어 논 스태틱 에어리어) int(리턴타입/ void 아무값도안오면/배열도 올수있다) add(메소드 이름/ 의미있는 이름으로/ 변수명규칙과 같음) (int a, int b)(매개변수 /변수생성 매소드 변스 안에서만 사용가능){
//			return(리턴 키워드/ return키워드를 만나면 무조건 바로 리턴한다 호출한곳으로(리턴값을가지고 간다)) a+b;(리턴값/ 연산식을 사용할수도 있다/ 리턴타입이랑 같은 값으로 해야된다(주의해서 사용하기))
//	}
		int value = addNumber(100, 200);
		System.out.println("연산결과 : " + value);
	}
	public static int addNumber(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

}
