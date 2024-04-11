package d0404;

public class EX02 {

	public static void main(String[] args) {
		System.out.println(Number(5));
	}
	
	public static String Number(int a) {
		if(a > 0) {
			return "양수입니다!";
		}else if(a < 0) {
			return "음수입니다!";
		}else {
			return "zero!";
		}
	}

}
