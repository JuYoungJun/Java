package d0408_02;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		MusicVO[] allMusic = new MusicVO[3];
		
		allMusic[0] = new MusicVO("������", "Ȧ��", 482, "C����̺�");
		allMusic[0] = new MusicVO("������", "Ȧ��", 482, "C����̺�");
		allMusic[0] = new MusicVO("������", "Ȧ��", 482, "C����̺�");
		
		System.out.println("������".equals("������"));//true
		System.out.println("������".equals("��"));//�������� "��"�� ���԰� �ֳ�?
		System.out.println("��".contains("������"));//"��"�� "������"�� �����ϰ� �ֳ�? => false
	}
}
