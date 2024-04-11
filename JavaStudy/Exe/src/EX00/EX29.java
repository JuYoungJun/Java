package EX00;

import java.util.*;

public class EX29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = { "아이유", "카리나", "윈 터", "장원영", "안유진" };

		System.out.print("입력 >> ");
		String na = sc.nextLine();

		int index = -1;// 이름의 인덱스를 저장할 변수를 추가하고 초기화

		for (int i = 0; i < names.length; i++) {
			if (na.equals(names[i])) {
				index = i; // 이름을 찾았으니 인덱스를 저장
				break;
			} // if문끝
		} // for 문끝
		if (index != -1) {
			System.out.println(na + "님은 " + (index) + "번쨰인덱스에 있습니다.");
		} else {
			System.out.println(na + " 이라는 이름은 조재하지 않은 이름입니다.");
		} // if문끝
	}

}
