package d0408;

public class Main_t {

	public static void main(String[] args) {
		PocketVO_t p1 = new PocketVO_t("��ī��", "����", "���ʸ���", 99, 10);
		PocketVO_t p2 = new PocketVO_t("������", "����", "���ʸ���", 99, 10);
		PocketVO_t p3 = new PocketVO_t("���̸�", "��", "���ʸ���", 99, 10);
		PocketVO_t p4 = new PocketVO_t("���α�", "��", "���ʸ���", 99, 10);
		
		PocketVO_t[] allpocket = {p1, p2, p3, p4};
		
		for(int i =0; i < allpocket.length; i++) {
			PocketVO_t temp = allpocket[i];
			
			System.out.println(temp);
			System.out.println(temp.getName());
			System.out.println(allpocket[i].getName());
		}
	}
}
