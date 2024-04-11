package EX00;

import java.util.*;

public class EX24 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					--i;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Ád¿îÀÇ ¼ýÀÚ : " + arr[i]);
		}
	}

}