package d0404;

public class EX04 {

	public static void main(String[] args) {
		System.out.println(isPrime(5));
	}
	
	public static boolean isPrime(int num) {
		if (num < 2) {
			
		}else if (num == 2) {
			
		}else if (num % 2 == 0) {
			
		}
		for (int i = 3; i < Math.sqrt(num); i += 2) {
			if(num % 1 == 0) {
				return false;
			}
		}
		return true;
	}
}
