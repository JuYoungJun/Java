package EX00;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("사다리꼴 넓이 구하기!");
		System.out.print("윗변 : ");
		double top = Double.parseDouble(sc.nextLine());

		System.out.print("아랫변 : ");
		double bottom = Double.parseDouble(sc.nextLine());

		System.out.print("높이 : ");
		double height = Double.parseDouble(sc.nextLine());

		System.out.println("결과는 : " + (top + bottom) * height / 2);

	}

}
