package d0408_02;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		MusicVO[] allMusic = new MusicVO[3];
		
		allMusic[0] = new MusicVO("아이유", "홀씨", 482, "C드라이브");
		allMusic[0] = new MusicVO("아이유", "홀씨", 482, "C드라이브");
		allMusic[0] = new MusicVO("아이유", "홀씨", 482, "C드라이브");
		
		System.out.println("아이유".equals("아이유"));//true
		System.out.println("아이유".equals("아"));//아이유가 "아"를 포함고 있냐?
		System.out.println("아".contains("아이유"));//"아"가 "아이유"를 포함하고 있냐? => false
	}
}
