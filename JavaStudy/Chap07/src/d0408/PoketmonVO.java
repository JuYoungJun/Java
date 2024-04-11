package d0408;

public class PoketmonVO {
	private String nick;
	private String property;
	private String hauntingPlace;
	private int hp;
	private int lv;
	
	public PoketmonVO (String nick, String property, String hauntingplace, int hp, int lv) {
		this.nick = nick;
		this.property = property;
		this.hauntingPlace = hauntingplace;
		this.hp = hp;
		this.lv = lv;
	}
	
	public String getNick() {
		return nick;
	}
	
	public String getProperty() {
		return property;
	}
	
	public String getHauntingplace() {
		return hauntingPlace;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getLv() {
		return lv;
	}
}
