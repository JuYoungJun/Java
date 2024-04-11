package d0408;

public class PocketVO_t {
	// Vo 구성요소! (DTO)
	// 1. 필드
	// - 대문자를 쓸떄는 상수만
	// - 연산을 할때는 int, 연산이 필요없으면 String
	private String name;
	private String type;
	private String area;
	private int hp;
	private int lv;

	// 2. 생성자
	public PocketVO_t(String name, String type, String area, int hp, int lv) {
		this.name = name;
		this.type = type;
		this.area = area;
		this.hp = hp;
		this.lv = 1;
	}

	// 3. get/set
	// -get = 값 확인용
	// -set = 값 수정용(필용한거만 하기(다해버리면 캡슐화 하는 의미가 없다))
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getArea() {
		return area;
	}

	// 4. toString
	// => 객체내의 필드값을 문자열로 만들어서 리턴 해준다
//	@Override
//	public String toString() {
//		return "PocketVO_t [name=" + name + ", type=" + type + ", area=" + area + ", hp=" + hp + ", lv=" + lv + "]";
//	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PocketVO_t [name=");
		builder.append(name);
		builder.append(", type=");
		builder.append(type);
		builder.append(", area=");
		builder.append(area);
		builder.append(", hp=");
		builder.append(hp);
		builder.append(", lv=");
		builder.append(lv);
		builder.append("]");
		return builder.toString();
	}

}