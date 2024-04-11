package d0405;

public class MapleVO2 {
	private String nick;
	private int str;
	private int dex;
	private int intel;
	private int luck;
	private String server;

	public MapleVO2(String nick, int str, int dex, int intel, int luck, String server) {
		this.nick = nick;
		this.str = str;
		this.dex = dex;
		this.intel = intel;
		this.luck = luck;
		this.server = server;
	}

	public String getNick() {
		return nick;
	}

	public int getStr() {
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
