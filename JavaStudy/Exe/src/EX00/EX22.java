package EX00;

import java.util.Scanner;

public class EX22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���̵� : ");
		String name = sc.nextLine();

		String id1 = "person1";
		String id2 = "person2";
		String id3 = "person3";


		if (name.equals(id1)) {
			System.out.println("�����߽��ϴ�");
		} else if (name.equals(id2)) {
			System.out.println("�����߽��ϴ�");
		} else if(name.equals(id3)) {
			System.out.println("�����߽��ϴ�");
		}else {
			System.out.println("�����߽��ϴ�");
		}
	}

}
