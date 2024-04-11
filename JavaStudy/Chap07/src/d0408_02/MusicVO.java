package d0408_02;

public class MusicVO {
	private String music;
	private String name;
	private int sec;
	private String path;

	public MusicVO(String music, String name, int sec, String path) {
		this.music = music;
		this.name = name;
		this.sec = sec;
		this.path = path;
	}

	public String getMusic() {
		return music;
	}

	public String getName() {
		return name;
	}

	public int getSec() {
		return sec;
	}

	public String getPath() {
		return path;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MusicVO [music=");
		builder.append(music);
		builder.append(", name=");
		builder.append(name);
		builder.append(", sec=");
		builder.append(sec);
		builder.append(", path=");
		builder.append(path);
		builder.append("]");
		return builder.toString();
	}
	
	

	
}
