package d0405;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class Main {
	public static void main(String[] args) {
		//main�޼ҵ尡 ���Ե� Ŭ���� => MainŬ����
		
		//�ʺ��� ó������ ��ü���� ������� ����ϴ� ���� �ſ� �������
		//������ ��ǥ Ŭ������ ��ü �����ϱ�!!
		//����) Ŭ������ ���ο� �ڷ������� Ȱ��! => ValueObject(VO)
		//����� �����ڷ��� => ����
		
		//������ ĳ���� ����
//		String nick = "zI������";
//		int str = 4;//��
//		int dex = 5;//��ø
//		int luck = 6;//��
//		int intel = 8;//����
//		String sever = "ī��Ƽ��";
		
		//�޸� �Ҵ� (�̰� ��ü���� �̶� �θ���)
//		MapleVO m1 = new MapleVO();
		//��ü�� ������ �� �����ڰ� ȣ���� �Ǵµ�
		//�����ڿ� �Ű������� ������ ������ Ÿ���� ���缭 �����ϴ�.
		//=>�ݵ�� �ʱ�ȭ�ؾ��ϴ� �ʵ�� �����ڷ� �ʱ�ȭ�Ѵ�.
		MapleVO m3 = new MapleVO("�̸�", 10, 10, 10, 10, "null");//�ڵ���� ���� �̷������� ������Ѵ�!
		
//		m1.nick = "vŸ���Ŀ�����v";
//		m1.str = 150;
//		m1.dex = 10;
//		m1.intel = 20;
//		m1.luck = 30;
//		m1.server = "��ī�Ͼ�";
//		
//		MapleVO m2 = new MapleVO();
//		
//		m2.nick = "�����ǽ�";
//		m2.str = 100;
//		m2.dex = 10;
//		m2.intel = 10;
//		m2.luck = 10;
//		m2.server ="�����ÿ�";
		
		//�ѹ� Ÿ���Ŀ������ ������ Ÿ���Ŀ����翩�ߵ�
		//�Ժη� �ٲٸ� �ȵ�! ĸ��ȭ�� ����!
		//��ü������ �� �� �ѹ� �����ϸ� ���̻� �ٲ� �� ����!!
		//=>������޼ҵ�(���� ȣ��Ұ��� ��� ��ä������ �� �Բ� ȣ��(�� �ѹ���))
		
		//MapleVO[] chars = {m1, m2}; //�迭���� �����Ҽ��ִ�!
		
		//m3�� �ִ� nick ���
		System.out.println(m3.getNick());
	}
}
