package d0405;

public class MapleVO {
	// vo(����� ���� �ڷ���)
	// 1. �� �ڷ����� �����ϰ� ���� ������ ����(�̰� �ʵ�� �θ���)
	private String nick;
	private int str;
	private int dex;
	private int intel;
	private int luck;
	private String server;

	// 2. ������ �޼ҵ�
	public MapleVO(String nick, int str, int dex, int intel, int luck, String sever) {
		// ����Ÿ�� ��� X, �̸��� class �̸��� ����
		System.out.println("������ȣ��!!!");//��ü�� �����Ҷ� ���� ȣ�� �Ǵµ� ��ü ������ ���� 2���� �ؼ� 2���� ȣ���Ѵ� - > ��ü ���� �ϰ� ������ �� ȣ��!//�ʵ� �ʱ�ȭ�� ����Ѵ�
		this.nick = nick;
		this.str = str;
		this.dex = dex;
		this.intel = intel;
		this.luck = luck;
		this.server = server;
	}
	
	//3.���� ���� �ϴ� �޼ҵ�
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
