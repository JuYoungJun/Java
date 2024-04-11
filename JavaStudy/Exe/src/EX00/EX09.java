package EX00;

import java.util.Scanner;

public class EX09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("가위바위보 게임");
		System.out.print(("가위(1.), 바위(2.), 보(3.) 를 입력하세요 : "));
		int user = sc.nextInt();
		int com = (int) (Math.random() * 3) + 1;
		if (user == 1) {
			System.out.println("유저 : 가위");
		} else if (user == 2) {
			System.out.println("유저 : 바위");
		} else if (user == 3) {
			System.out.println("유저 : 보");
		} else {
			System.out.println("잘못된 입력입니다!");
		}

		if (com == 1) {
			System.out.println("컴퓨터 : 가위");
		} else if (com == 2) {
			System.out.println("컴퓨터 : 바위");
		} else if (com == 3) {
			System.out.println("컴퓨터 : 보");
		}

		if (com == 1) {
			if (user == 2) {
				System.out.println("이겼습니다");
			} else if (user == 3) {
				System.out.println("졌습니다");
			} else {
				System.out.println("비겼습니다");
			}

			if (com == 2) {
				if (user == 3) {
					System.out.println("이겼습니다");
				} else if (user == 1) {
					System.out.println("졌습니다");
				} else {
					System.out.println("비겼습니다");
				}

				if (com == 3) {
					if (user == 1) {
						System.out.println("이겼습니다");
					} else if (user == 2) {
						System.out.println("졌습니다");
					} else {
						System.out.println("비겼습니다");
					}
				}
			}
		}
	}
}
