package d0405;

public class MapleVO {
	// vo(사용자 정의 자료형)
	// 1. 이 자료형에 저장하고 싶은 데이터 변수(이걸 필드라 부른다)
	private String nick;
	private int str;
	private int dex;
	private int intel;
	private int luck;
	private String server;

	// 2. 생성자 메소드
	public MapleVO(String nick, int str, int dex, int intel, int luck, String sever) {
		// 리턴타입 명시 X, 이름이 class 이름과 동일
		System.out.println("생성자호출!!!");//객체를 생성할때 같이 호출 되는데 객체 생성이 지금 2개를 해서 2번을 호출한다 - > 객체 생성 하고 생성자 를 호출!//필드 초기화로 사용한다
		this.nick = nick;
		this.str = str;
		this.dex = dex;
		this.intel = intel;
		this.luck = luck;
		this.server = server;
	}
	
	//3.값을 리턴 하는 메소드
	public String getNick() {
		return nick;
	}
	
	public int getstr() {
		return str;
	}
	
	public int getDex() {
		return dex;
	}
	
	public int getIntel() {
		return intel;
	}
	
	public int getLuck() {
		return luck;
	}
	
	public String getServer() {
		return server;
	}
}
