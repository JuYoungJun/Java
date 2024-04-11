package EX00;

import java.util.Scanner;

public class EX25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];//배열 개수 정하기
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			arr[i] = sc.nextInt();
		}//입력 받은 줄
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " : ");
			for(int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();// *찍는 코드
		}
	}

}
