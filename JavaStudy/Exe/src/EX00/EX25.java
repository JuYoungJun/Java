package EX00;

import java.util.Scanner;

public class EX25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];//�迭 ���� ���ϱ�
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "��° ���� �� : ");
			arr[i] = sc.nextInt();
		}//�Է� ���� ��
		
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " : ");
			for(int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();// *��� �ڵ�
		}
	}

}
