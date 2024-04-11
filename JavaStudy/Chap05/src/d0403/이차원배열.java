package d0403;

public class 이차원배열 {

	public static void main(String[] args) {
		//2차원 배열 배열안에 배열을 저장한다!
		int[] stu1 = {100, 100, 100};
		int[] stu2 = {90, 90, 90};
		int[] stu3 = {80, 80};
		int[] stu4 = {100, 100, 100};
		int[] stu5 = {100, 100, 100};
		
		int[][] allStu = {stu1, stu2, stu3, stu4, stu5};
		
		System.out.println(allStu[0]);
		System.out.println(allStu[0][1]);//0번 배열의 1번값
		System.out.println(allStu.length);//5
		System.out.println(allStu[0].length);//3
		//배열의 참조변수는 배열의 길이와는 연관성이 없다! => 데이터의 자료형
		System.out.println(allStu[2].length);//2
		
		//3칸 짜리 배열 5개 저장하는 이차원배열!
		int[][] score = new int[5][3];
		
		//score의 0번 배열에 저장된 모든값 출력
		// alt + shift + r => 변수명 한번에 변경
//		for(int 점수 = 0; 점수 < score[0].length; 점수++) {
//			System.out.println(score[0][점수]);
//		}
		
		//한번에 출력하기
		for (int 학생 = 0; 학생 < score.length; 학생++) {
			for(int 점수 = 0; 점수 < score[학생].length; 점수++) {
				System.out.println(score[학생][점수]);
			}
		}
	
	}

}
