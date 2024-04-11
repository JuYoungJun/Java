package EX00;

import java.util.Scanner;

public class EX15 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;// 잔고
		String money = "";
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------");
			System.out.println("1.금액 입력");
			System.out.println("---------");
			System.out.print("선택> ");
			String select = scanner.nextLine();
			if (select.equals("1")) {
				System.out.print("총 금액 입력 > ");
				money = scanner.nextLine();
				balance += Integer.parseInt(money);
				System.out.printf("잔돈 : %d\n", balance);
				System.out.printf("10,000원 : %d개\n", balance / 10000);
				System.out.printf("5,000원 : %d개\n", (balance % 10000) / 5000);
				System.out.printf("1,000원 : %d개\n", (balance % 5000) / 1000);
				System.out.printf("500원 : %d개\n", (balance % 1000) / 500);
				System.out.printf("100원 : %d개\n", (balance % 500) / 100);
				System.out.printf("50원 : %d개\n", (balance % 100) / 50);
				System.out.printf("10원 : %d개\n", (balance % 50) / 10);
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}

}
