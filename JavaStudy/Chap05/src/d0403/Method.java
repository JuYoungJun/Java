package d0403;

public class Method {

	public static void main(String[] args) {
		// �޼ҵ� �� �����(�߻����̰� ¥�ߵȴ� ��ü���̰��ϸ� �ȵǰ�) �޼ҵ带 ���� �����ϴ�
//		public(����������) static(�޸� �Ҵ� ��ġ/ ����ƽ ����� �� ����ƽ �����) int(����Ÿ��/ void �ƹ������ȿ���/�迭�� �ü��ִ�) add(�޼ҵ� �̸�/ �ǹ��ִ� �̸�����/ �������Ģ�� ����) (int a, int b)(�Ű����� /�������� �żҵ� ���� �ȿ����� ��밡��){
//			return(���� Ű����/ returnŰ���带 ������ ������ �ٷ� �����Ѵ� ȣ���Ѱ�����(���ϰ��������� ����)) a+b;(���ϰ�/ ������� ����Ҽ��� �ִ�/ ����Ÿ���̶� ���� ������ �ؾߵȴ�(�����ؼ� ����ϱ�))
//	}
		int value = addNumber(100, 200);
		System.out.println("������ : " + value);
	}
	public static int addNumber(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

}
