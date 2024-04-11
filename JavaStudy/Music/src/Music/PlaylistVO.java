package Music;

public class PlaylistVO {
	private String title;// �뷡��������
	private String singer;// ��������
	private int playTime;// ����ð�����
	private String path;// ���ϰ�� ����

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
