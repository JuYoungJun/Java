package d0403;

public class �������迭 {

	public static void main(String[] args) {
		//2���� �迭 �迭�ȿ� �迭�� �����Ѵ�!
		int[] stu1 = {100, 100, 100};
		int[] stu2 = {90, 90, 90};
		int[] stu3 = {80, 80};
		int[] stu4 = {100, 100, 100};
		int[] stu5 = {100, 100, 100};
		
		int[][] allStu = {stu1, stu2, stu3, stu4, stu5};
		
		System.out.println(allStu[0]);
		System.out.println(allStu[0][1]);//0�� �迭�� 1����
		System.out.println(allStu.length);//5
		System.out.println(allStu[0].length);//3
		//�迭�� ���������� �迭�� ���̿ʹ� �������� ����! => �������� �ڷ���
		System.out.println(allStu[2].length);//2
		
		//3ĭ ¥�� �迭 5�� �����ϴ� �������迭!
		int[][] score = new int[5][3];
		
		//score�� 0�� �迭�� ����� ��簪 ���
		// alt + shift + r => ������ �ѹ��� ����
//		for(int ���� = 0; ���� < score[0].length; ����++) {
//			System.out.println(score[0][����]);
//		}
		
		//�ѹ��� ����ϱ�
		for (int �л� = 0; �л� < score.length; �л�++) {
			for(int ���� = 0; ���� < score[�л�].length; ����++) {
				System.out.println(score[�л�][����]);
			}
		}
	
	}

}
