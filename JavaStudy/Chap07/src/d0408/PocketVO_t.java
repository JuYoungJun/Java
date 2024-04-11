package d0408;

public class PocketVO_t {
	// Vo �������! (DTO)
	// 1. �ʵ�
	// - �빮�ڸ� ������ �����
	// - ������ �Ҷ��� int, ������ �ʿ������ String
	private String name;
	private String type;
	private String area;
	private int hp;
	private int lv;

	// 2. ������
	public PocketVO_t(String name, String type, String area, int hp, int lv) {
		this.name = name;
		this.type = type;
		this.area = area;
		this.hp = hp;
		this.lv = 1;
	}

	// 3. get/set
	// -get = �� Ȯ�ο�
	// -set = �� ������(�ʿ��ѰŸ� �ϱ�(���ع����� ĸ��ȭ �ϴ� �ǹ̰� ����))
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
	// => ��ü���� �ʵ尪�� ���ڿ��� ���� ���� ���ش�
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