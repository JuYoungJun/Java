package d0404;

public class EX02 {

	public static void main(String[] args) {
		System.out.println(Number(5));
	}
	
	public static String Number(int a) {
		if(a > 0) {
			return "����Դϴ�!";
		}else if(a < 0) {
			return "�����Դϴ�!";
		}else {
			return "zero!";
		}
	}

}
