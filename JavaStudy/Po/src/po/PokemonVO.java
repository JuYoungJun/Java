package po;

public class PokemonVO {
	private String name;// ���ϸ� �̸�
	private String type;// ���ϸ� Ÿ��
	private String area;// �����
	private int number;// ���� ��ȣ

	public PokemonVO(String name, String type, String area, int number) {
		this.name = name;
		this.type = type;
		this.area = area;
		this.number = number;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "name = " + name + ", type = " + type + ", number = " + number + ", area = " + area;
	}

}
