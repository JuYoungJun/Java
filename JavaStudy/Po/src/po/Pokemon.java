package po;

import java.util.*;

public class Pokemon {
	public static void main(String[] args) {
		ArrayList<PokemonVO> poketindex = new ArrayList<PokemonVO>();
		Scanner sc = new Scanner(System.in);

		boolean isRunning = true;

		while (isRunning) {
			System.out.println("=================== 포켓몬 도감 ===================");
			System.out.println("[1]추가  [2]삭제  [3]검색  [4]전체조회  [5]수정  [6]종료");
			System.out.print("메뉴를 선택하세요 : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addPokemon(poketindex, sc);
				break;

			case 2:
				removePokemon(poketindex, sc);
				break;

			case 3:
				searchPokemon(poketindex, sc);
				break;

			case 4:
				checkPokemon(poketindex, sc);
				break;

			case 5:
				modifyPokemon(poketindex, sc);
				break;

			case 6:
				isRunning = false;
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				System.out.println("잘못된 입력입니다 다시입력하세요.");
				break;
			}
		}
	}// main끝

	// 1~5번 까지의 메소드들 (.isEmpty, .equalsIgnoreCase 찾아서 함)
	// (.isEmpty : 메소드는 문자열이 빈 값이면 true, 비어있지 않으면 false)
	// (.equalsIgnoreCase : 대소문자 차이(소문자 및 대문자)를 무시하면서 두 문자열을 비교하는 데 사용)
	private static void addPokemon(ArrayList<PokemonVO> poketindex, Scanner scanner) {
		System.out.println("===== 추가 =====");
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.print("타입 : ");
		String type = scanner.next();
		System.out.print("번호 : ");
		int number = scanner.nextInt();
		System.out.print("출몰지역 : ");
		String area = scanner.next();

		PokemonVO pokemon = new PokemonVO(name, type, area, number);
		poketindex.add(pokemon);

		System.out.println("포켓몬 정보가 포켓몬 도감에 저장되었습니다!");
	}// add메소드 끝

	private static void removePokemon(ArrayList<PokemonVO> poketindex, Scanner scanner) {
		if (poketindex.isEmpty()) {
			System.out.println("비어있습니다");
		} else {
			for (int i = 0; i < poketindex.size(); i++) {
				System.out.println((i + 1) + ". " + poketindex.get(i).toString());
			}

			System.out.print("삭제할 번호를 입력하세요 : ");
			int remove = scanner.nextInt();

			System.out.println("정말 삭제하시겠습니까? 삭제를 진행하려면 (Y or y)를, 취소하려면 (N or n)를 입력해주세요.");
			System.out.print(">>>");
			String cancel = scanner.next();

			if (cancel.equalsIgnoreCase("N")) {
				System.out.println("삭제를 취소합니다");
			} else if (cancel.equalsIgnoreCase("Y")) {
				poketindex.remove(remove - 1);
				System.out.println("포켓몬 정보가 삭제되었습니다.");
			} else {
				System.out.println("잘못된입력입니다. 처음으로 다시 돌아갑니다");

				removePokemon(poketindex, scanner);
			}
		}
	}// remove 메소드 끝

	private static void searchPokemon(ArrayList<PokemonVO> poketindex, Scanner scanner) {
		System.out.print("검색할 포켓몬 이름을 입력하세요 : ");
		String search = scanner.next();
		boolean found = false;

		for (int i = 0; i < poketindex.size(); i++) {
			PokemonVO pokemon = poketindex.get(i);
			if (pokemon.getName().equals(search)) {
				System.out.println(pokemon);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println(search + "라는 이름의 포켓몬을 찾을 수 없습니다.");
		}

	}// search 메소드 끝

	private static void checkPokemon(ArrayList<PokemonVO> poketindex, Scanner scanner) {
		System.out.println("==== 전체 조회 ====");
		if (poketindex.isEmpty()) {
			System.out.println("도감에서 조회할 정보가 없습니다.");
		} else {
			for (int i = 0; i < poketindex.size(); i++) {
				System.out.println((i + 1) + ". " + poketindex.get(i).toString());
			}
		}
	}// check 메소드 끝

	private static void modifyPokemon(ArrayList<PokemonVO> poketindex, Scanner scanner) {
		System.out.println("==== 출몰지 수정 ====");
		if (poketindex.isEmpty()) {
			System.out.println("수정할 정보가 없습니다.");
		} else {
			for (int i = 0; i < poketindex.size(); i++) {
				System.out.println((i + 1) + ". " + poketindex.get(i).toString());
			}
		}

		System.out.print("수정할 포켓몬의 번호 : ");
		int index = scanner.nextInt();
		index--;

		String pokemonName = poketindex.get(index).getName();// 수정 준비단계
		System.out.println(pokemonName + "의 출몰지를 수정합니다.");

		if (index >= 0 && index < poketindex.size()) {
			System.out.print("새로운 출몰지를 입력하세요 : ");
			String newArea = scanner.next();

			poketindex.get(index).setArea(newArea);
			// get(index)는 ArrayList에서 해당 인덱스의 PokemonVO 객체를 가져온다
			// set(newArea)는 출몰지를 새로운 값으로 설정한다

			System.out.println("수정이 완료되었습니다");
			System.out.println(poketindex.get(index));
		} else {
			System.out.println("잘못된 입력값 입니다 다시 입력해주세요.");

			modifyPokemon(poketindex, scanner);
		}

	}// modify 메소드 끝

}// class 끝
