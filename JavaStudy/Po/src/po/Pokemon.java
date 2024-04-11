package po;

import java.util.*;

public class Pokemon {
	public static void main(String[] args) {
		ArrayList<PokemonVO> poketindex = new ArrayList<PokemonVO>();
		Scanner sc = new Scanner(System.in);

		boolean isRunning = true;

		while (isRunning) {
			System.out.println("=================== ���ϸ� ���� ===================");
			System.out.println("[1]�߰�  [2]����  [3]�˻�  [4]��ü��ȸ  [5]����  [6]����");
			System.out.print("�޴��� �����ϼ��� : ");
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
				System.out.println("���α׷��� �����մϴ�.");
				break;

			default:
				System.out.println("�߸��� �Է��Դϴ� �ٽ��Է��ϼ���.");
				break;
			}
		}
	}// main��

	// 1~5�� ������ �޼ҵ�� (.isEmpty, .equalsIgnoreCase ã�Ƽ� ��)
	// (.isEmpty : �޼ҵ�� ���ڿ��� �� ���̸� true, ������� ������ false)
	// (.equalsIgnoreCase : ��ҹ��� ����(�ҹ��� �� �빮��)�� �����ϸ鼭 �� ���ڿ��� ���ϴ� �� ���)
	private static void addPokemon(ArrayList<PokemonVO> poketindex, Scanner scanner) {
		System.out.println("===== �߰� =====");
		System.out.print("�̸� : ");
		String name = scanner.next();
		System.out.print("Ÿ�� : ");
		String type = scanner.next();
		System.out.print("��ȣ : ");
		int number = scanner.nextInt();
		System.out.print("������� : ");
		String area = scanner.next();

		PokemonVO pokemon = new PokemonVO(name, type, area, number);
		poketindex.add(pokemon);

		System.out.println("���ϸ� ������ ���ϸ� ������ ����Ǿ����ϴ�!");
	}// add�޼ҵ� ��

	private static void removePokemon(ArrayList<PokemonVO> poketindex, Scanner scanner) {
		if (poketindex.isEmpty()) {
			System.out.println("����ֽ��ϴ�");
		} else {
			for (int i = 0; i < poketindex.size(); i++) {
				System.out.println((i + 1) + ". " + poketindex.get(i).toString());
			}

			System.out.print("������ ��ȣ�� �Է��ϼ��� : ");
			int remove = scanner.nextInt();

			System.out.println("���� �����Ͻðڽ��ϱ�? ������ �����Ϸ��� (Y or y)��, ����Ϸ��� (N or n)�� �Է����ּ���.");
			System.out.print(">>>");
			String cancel = scanner.next();

			if (cancel.equalsIgnoreCase("N")) {
				System.out.println("������ ����մϴ�");
			} else if (cancel.equalsIgnoreCase("Y")) {
				poketindex.remove(remove - 1);
				System.out.println("���ϸ� ������ �����Ǿ����ϴ�.");
			} else {
				System.out.println("�߸����Է��Դϴ�. ó������ �ٽ� ���ư��ϴ�");

				removePokemon(poketindex, scanner);
			}
		}
	}// remove �޼ҵ� ��

	private static void searchPokemon(ArrayList<PokemonVO> poketindex, Scanner scanner) {
		System.out.print("�˻��� ���ϸ� �̸��� �Է��ϼ��� : ");
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
			System.out.println(search + "��� �̸��� ���ϸ��� ã�� �� �����ϴ�.");
		}

	}// search �޼ҵ� ��

	private static void checkPokemon(ArrayList<PokemonVO> poketindex, Scanner scanner) {
		System.out.println("==== ��ü ��ȸ ====");
		if (poketindex.isEmpty()) {
			System.out.println("�������� ��ȸ�� ������ �����ϴ�.");
		} else {
			for (int i = 0; i < poketindex.size(); i++) {
				System.out.println((i + 1) + ". " + poketindex.get(i).toString());
			}
		}
	}// check �޼ҵ� ��

	private static void modifyPokemon(ArrayList<PokemonVO> poketindex, Scanner scanner) {
		System.out.println("==== ����� ���� ====");
		if (poketindex.isEmpty()) {
			System.out.println("������ ������ �����ϴ�.");
		} else {
			for (int i = 0; i < poketindex.size(); i++) {
				System.out.println((i + 1) + ". " + poketindex.get(i).toString());
			}
		}

		System.out.print("������ ���ϸ��� ��ȣ : ");
		int index = scanner.nextInt();
		index--;

		String pokemonName = poketindex.get(index).getName();// ���� �غ�ܰ�
		System.out.println(pokemonName + "�� ������� �����մϴ�.");

		if (index >= 0 && index < poketindex.size()) {
			System.out.print("���ο� ������� �Է��ϼ��� : ");
			String newArea = scanner.next();

			poketindex.get(index).setArea(newArea);
			// get(index)�� ArrayList���� �ش� �ε����� PokemonVO ��ü�� �����´�
			// set(newArea)�� ������� ���ο� ������ �����Ѵ�

			System.out.println("������ �Ϸ�Ǿ����ϴ�");
			System.out.println(poketindex.get(index));
		} else {
			System.out.println("�߸��� �Է°� �Դϴ� �ٽ� �Է����ּ���.");

			modifyPokemon(poketindex, scanner);
		}

	}// modify �޼ҵ� ��

}// class ��
