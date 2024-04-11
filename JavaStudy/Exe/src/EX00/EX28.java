package EX00;

import java.util.*;

public class EX28 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		String[] names = { "아이유", "카리나", "윈 터", "장원영", "안유진" };
//
//		System.out.print("입력 >> ");
//		String na = sc.nextLine();
//
//		for (int i = 0; i < names.length; i++) {
//
//		}
//		for (String str : names) {
//			if (na.equals(str)) {
//				System.out.println(na + "님은 존재합니다");
//			} else {
//				System.out.println("존재하지 않은 이름입니다");
//			}
//		}

//		Scanner sc = new Scanner(System.in);
//
//		String[] names = new String[10]; // 최대 10개의 이름을 저장할 배열
//		int currentSize = 0; // 현재 배열에 저장된 요소의 개수
//
//		while (true) {
//			System.out.print("입력 >> ");
//			String na = sc.nextLine();
//
//			int index = -1; // 이름의 인덱스를 저장할 변수를 추가하고 초기화
//
//			for (int i = 0; i < currentSize; i++) {
//				if (na.equals(names[i])) {
//					index = i; // 이름을 찾았으므로 해당 인덱스를 저장
//					break;
//				}
//			}
//
//			if (index != -1) {
//				System.out.println(na + "님은 존재합니다. " + na + "는 배열의 " + (index + 1) + "번째에 있습니다.");
//			} else {
//				System.out.println(na + " 이라는 이름은 존재하지 않은 이름입니다.");
//				if (currentSize < 10) {
//					System.out.print("저장하시겠습니까? (y/n): ");
//					String response = sc.nextLine();
//					if (response.equalsIgnoreCase("y")) {
//						names[currentSize] = na; // 현재 크기를 인덱스로 활용하여 새 이름 저장
//						currentSize++; // 현재 크기를 증가시킴
//						System.out.println(na + "이(가) 배열의 " + currentSize + "번째에 추가되었습니다.");
//					}
//				} else {
//					System.out.println("더 이상 저장할 공간이 없습니다.");
//					break; // 배열이 가득 찼으므로 더 이상 입력 받지 않음
//				}
//			}
//		}
//
//		// 배열 출력
//		System.out.println("배열 확인:");
//		for (int i = 0; i < currentSize; i++) {
//			System.out.println("[" + i + "] " + names[i]);
//		}
		
		//문법오류 계발자가 잘못한거
		//예외 실행하다가 잘못된거 : Exception
		// ArrayIndecOutOfBoundException : 배열 index 범위 벗어남!

		Scanner sc = new Scanner(System.in);

		String[] originalNames = { "아이유", "카리나", "윈 터", "장원영", "안유진" };
		String[] names = new String[10]; // 최대 10개의 이름을 저장할 배열
		int currentSize = originalNames.length; // 현재 배열에 저장된 요소의 개수

		// 기존 배열의 내용을 새 배열로 복사
		for (int i = 0; i < currentSize; i++) {
			names[i] = originalNames[i];
		}

		while (true) {
			System.out.print("입력 >> ");
			String na = sc.nextLine();

			int index = -1; // 이름의 인덱스를 저장할 변수를 추가하고 초기화

			for (int i = 0; i < currentSize; i++) {
				if (na.equals(names[i])) {
					index = i; // 이름을 찾았으므로 해당 인덱스를 저장
					break;
				}
			}

			if (index != -1) {
				System.out.println(na + "님은 존재합니다. " + na + "이라는 이름은 인덱스 " + index + "번째에 있습니다.");
			} else {
				System.out.println(na + " 이라는 이름은 존재하지 않은 이름입니다.");
				if (currentSize < 10) {
					System.out.print("저장하시겠습니까? (y/n): ");
					String response = sc.nextLine();
					if (response.equalsIgnoreCase("y")) {
						names[currentSize] = na; // 현재 크기를 인덱스로 활용하여 새 이름 저장
						currentSize++; // 현재 크기를 증가시킴
						System.out.println(na + "이(가) 인덱스 " + (currentSize - 1) + "번째에 추가되었습니다.");
					}
				} else {
					System.out.println("더 이상 저장할 공간이 없습니다.");
					break; // 배열이 가득 찼으므로 더 이상 입력 받지 않음
				}
			}
		}

		// 배열 출력
//		System.out.println("배열 확인:");
//		for (int i = 0; i < currentSize; i++) {
//			System.out.println("인덱스 " + i + ": " + names[i]);
//		}
	}

}
