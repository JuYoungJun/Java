package po;

public class PokemonVO {
	private String name;// 포켓몬 이름
	private String type;// 포켓몬 타입
	private String area;// 출몰지
	private int number;// 고유 번호

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
