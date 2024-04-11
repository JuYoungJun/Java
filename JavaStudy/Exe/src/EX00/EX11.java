package EX00;

import java.util.Scanner;

public class EX11 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;// 잔고
		String money = "";
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("------------------------");
			System.out.print("선택> ");
			String select = scanner.nextLine();
			if (select.equals("1")) {
				System.out.print("예금액> ");
				money = scanner.nextLine();
				balance += Integer.parseInt(money);
			} else if (select.equals("2")) {
				System.out.print("출금액> ");
				money = scanner.nextLine();
				int int_money = Integer.parseInt(money);
				if (balance >= int_money) {
					balance -= int_money;
				} else {
					System.out.println("잔액이 부족합니다.");
				}
			} else if (select.equals("3")) {
				System.out.println("잔고> " + balance);
			} else if (select.equals("4")) {
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
}
