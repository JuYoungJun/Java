package d0325;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		/*f(���ǽ�){
			���๮A
		}else{
			���๮B
		}
	*/
//		int a = 10;
//		if(a<10){
//			System.out.println("���๮A");
//		}else if(a<15) {
//			System.out.println("���๮B");
//		}else {
//			System.out.println("���๮C");
//		}
		
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		if(value %2 == 0) {
			System.out.println("¦���Դϴ�.");
		}else {
			System.out.println("Ȧ���Դϴ�");
		}
	}

}
