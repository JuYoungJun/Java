package d0409_2;

public class MusicVO {
	private String title;
	private String singer;
	private int playTime;
	private String path;

	public MusicVO(String title, String singer, int playTime, String path) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}

//	public String getTitle() {
//		return title;
//	}
//
//	public String getSinger() {
//		return singer;
//	}
//
//	public int getPlayTime() {
//		return playTime;
//	}
//
//	public String getPath() {
//		return path;
//	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MusicVO [title=");
		builder.append(title);
		builder.append(", singer=");
		builder.append(singer);
		builder.append(", playTime=");
		builder.append(playTime);
		builder.append(", path=");
		builder.append(path);
		builder.append("]");
		return builder.toString();
	}

}
