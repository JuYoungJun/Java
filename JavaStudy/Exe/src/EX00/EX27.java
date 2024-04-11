package EX00;

import java.util.*;

public class EX27 {

	public static void main(String[] args) {
		int[] a = new int[10];
		a[0] = 13;
		a[1] = 5;
		a[2] = 7;
		a[3] = 17;
		a[4] = 3;
		a[5] = 16;
		a[6] = 19;
		a[7] = 20;
		a[8] = 2;
		a[9] = 1;

		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("max값은 : " + max);

//		int sum = 0;
//		
//		for(int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
//		System.out.println("배열의 합은 : " + sum + "입니다.");
//		System.out.println("배열의 평균은 : " + sum/a.length + "입니다.");
	}

}
