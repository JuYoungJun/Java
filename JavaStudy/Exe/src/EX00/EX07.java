package EX00;

import java.util.Scanner;

public class EX07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("월을 입력하세요 : ");
		String str = sc.next();
		int month = Integer.parseInt(str);

		if (month == 12 || month == 1 || month == 2) {
			str = "A";
		} else if (month == 3 || month == 4 || month == 5) {
			str = "B";
		} else if (month == 6 || month == 7 || month == 8) {
			str = "C";
		} else if (month == 9 || month == 10 || month == 11) {
			str = "D";
		} else {
			str = "";
		}

		switch (str) {
		case "A":
			System.out.println(month + "월은 겨울 입니다!");
			break;
		case "B":
			System.out.println(month + "월은 봄 입니다!");
			break;
		case "C":
			System.out.println(month + "월은 여름 입니다!");
			break;
		case "D":
			System.out.println(month + "월은 가을 입니다!");
			break;
		default:
			System.out.println("잘못된 입력입니다!");
		}
	}

}
