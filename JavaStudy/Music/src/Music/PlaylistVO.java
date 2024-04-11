package Music;

public class PlaylistVO {
	private String title;// 노래제목정보
	private String singer;// 가수정보
	private int playTime;// 재생시간정보
	private String path;// 파일결로 정보

	public PlaylistVO(String title, String singet, int playTime, String path) {
		this.title = title;
		this.singer = singet;
		this.playTime = playTime;
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public String getSinget() {
		return singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public String getPath() {
		return path;
	}

	@Override
	public String toString() {
		return "[title = " + title + ", singer = " + singer + ", path = " + path + "]";
	}

}
