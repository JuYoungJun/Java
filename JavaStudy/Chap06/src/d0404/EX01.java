package d0404;

public class EX01 {

	public static void main(String[] args) {
		double num = Number(5, 5);
		System.out.println(num);
	}
	
	public static double Number(double a, double b) {
		if(a < b) {
			return b;
		}else if (a > b){
			return a;
		}else {
			return 0;
		}
	}
}
