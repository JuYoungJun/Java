package d0405;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class Main {
	public static void main(String[] args) {
		//main메소드가 포함된 클래스 => Main클래스
		
		//초보가 처음부터 객체지향 설계법을 사용하는 것은 매우 어려운일
		//오늘의 목표 클래스와 객체 구분하기!!
		//예제) 클래스를 새로운 자료형으로 활용! => ValueObject(VO)
		//사용자 정의자료형 => 설계
		
		//메이플 캐릭터 생성
//		String nick = "zI존법사";
//		int str = 4;//힘
//		int dex = 5;//민첩
//		int luck = 6;//운
//		int intel = 8;//지능
//		String sever = "카스티아";
		
		//메모리 할당 (이걸 객체생성 이라 부른다)
//		MapleVO m1 = new MapleVO();
		//객체를 생성할 때 생성자가 호출이 되는데
		//생성자에 매개변수가 있으니 개수와 타입을 맞춰서 지정하다.
		//=>반드시 초기화해야하는 필드는 생성자로 초기화한다.
		MapleVO m3 = new MapleVO("이름", 10, 10, 10, 10, "null");//코드생성 예시 이런식으로 해줘야한다!
		
//		m1.nick = "v타락파워전사v";
//		m1.str = 150;
//		m1.dex = 10;
//		m1.intel = 20;
//		m1.luck = 30;
//		m1.server = "스카니아";
//		
//		MapleVO m2 = new MapleVO();
//		
//		m2.nick = "번개의신";
//		m2.str = 100;
//		m2.dex = 10;
//		m2.intel = 10;
//		m2.luck = 10;
//		m2.server ="엘리시움";
		
		//한번 타락파워전사는 영운히 타락파워전사여야됨
		//함부로 바꾸면 안됨! 캡슐화에 위배!
		//객체생성하 때 딱 한번 지정하면 더이상 바꿀 수 없게!!
		//=>생성사메소드(따로 호출불가는 대시 겍채생성할 떄 함께 호출(딱 한번만))
		
		//MapleVO[] chars = {m1, m2}; //배열에도 저장할수있다!
		
		//m3에 있는 nick 출력
		System.out.println(m3.getNick());
	}
}
