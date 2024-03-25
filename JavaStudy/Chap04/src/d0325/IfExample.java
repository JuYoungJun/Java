package d0325;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		/*f(조건식){
			실행문A
		}else{
			실행문B
		}
	*/
//		int a = 10;
//		if(a<10){
//			System.out.println("실행문A");
//		}else if(a<15) {
//			System.out.println("실행문B");
//		}else {
//			System.out.println("실행문C");
//		}
		
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		if(value %2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다");
		}
	}

}
