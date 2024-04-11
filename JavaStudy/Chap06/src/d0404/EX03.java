package d0404;

public class EX03 {

	public static void main(String[] args) {
		System.out.println(isnum(5, 6));
	}
	
	public static boolean isnum(int i, int j) {
//		if(i % j == 0) {
//				return "true";
//			}else {
//				return "false";
//			}
		return i % j == 0;
	}
}
