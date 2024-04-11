package EX00;

public class EX26 {

	public static void main(String[] args) {
		int[] a = new int[10];
		a[0] = 13;
		a[1] = 5;
		a[2] = 7;
		a[3] = 17;
		a[4] = 3;
		a[5] = 16;
		a[6] = 19;
		a[7] = 20;
		a[8] = 2;
		a[9] = 1;
//		System.out.print("index 0번은 : " + a[0] + "\n");		
//		System.out.print("index 1번은 : " + a[1] + "\n");		
//		System.out.print("index 2번은 : " + a[2] + "\n");		
//		System.out.print("index 3번은 : " + a[3] + "\n");		
//		System.out.print("index 4번은 : " + a[4] + "\n");		
//		System.out.print("index 5번은 : " + a[5] + "\n");		
//		System.out.print("index 6번은 : " + a[6] + "\n");		
//		System.out.print("index 7번은 : " + a[7] + "\n");		
//		System.out.print("index 8번은 : " + a[8] + "\n");		
//		System.out.print("index 9번은 : " + a[9] + "\n");		

//		int[] array = new int[10];// 0~9
		// new => 메모리 생성하는 키워드
		// new 옆에 적는거? => 메모리형태
		// 메모리 생성하면 주소 부여!
		// 주소를 저장해놔야 나중에 찾아갈 수 있음..!
		// 저장할 떄 쓰는거 => 변수
		// 변수긴 변수인데 주소를 저장? 레퍼런스 변수
		// 레퍼런스 변수의 타입은 메모리의 형태와 동일하게!

		// 배열 생성 후 값을 초기화ㅎ지 않으면 int => 0, String => null
//		int[] array2;
//		array2[2] = 5; 에러남 아직 new로 레퍼런스 변수가 생성되지 않음
		
		//por-each문 (확장 for문) 배열이랑 같이쓴다
//		for(int temp : a) { tem : 배열 이름 배열 개수만큼 반복 한다
//			System.out.println(temp);
//		}

		int sum = 0;

		System.out.print("a에 들어있는 홀수는 ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.print(a[i] + " ");
				sum++;
			}
		}
		System.out.print("이며");
		System.out.println("총 " + sum + "개 입니다.");
	}
	
	
	

}
