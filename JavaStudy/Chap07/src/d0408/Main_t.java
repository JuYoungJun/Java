package d0408;

public class Main_t {

	public static void main(String[] args) {
		PocketVO_t p1 = new PocketVO_t("피카츄", "전기", "태초마을", 99, 10);
		PocketVO_t p2 = new PocketVO_t("라이츄", "전기", "태초마을", 99, 10);
		PocketVO_t p3 = new PocketVO_t("파이리", "불", "태초마을", 99, 10);
		PocketVO_t p4 = new PocketVO_t("꼬부기", "물", "태초마을", 99, 10);
		
		PocketVO_t[] allpocket = {p1, p2, p3, p4};
		
		for(int i =0; i < allpocket.length; i++) {
			PocketVO_t temp = allpocket[i];
			
			System.out.println(temp);
			System.out.println(temp.getName());
			System.out.println(allpocket[i].getName());
		}
	}
}
