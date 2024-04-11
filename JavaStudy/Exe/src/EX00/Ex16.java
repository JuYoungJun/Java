package EX00;

public class Ex16 {

	public static void main(String[] args) {
		int a = 77;
		int b = 1;
		int sum = 0;
		
//		while(b < 78) {
//			sum += (a * b);
//			
//			a--;
//			b++;
//		}
//		System.out.println(sum);
		
		for(b = 1; b < 78; b++) {
			sum += a*b;
			a--;
		}
		System.out.println(sum);
	}

}
