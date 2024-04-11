package EX00;

import java.util.Scanner;

public class EX20 {

	public static void main(String[] args) {
		int input; //입력받은 문자열을 저장하기 위한 변수
		int result = 0;//최종 결과값을 저장하기 위한 변수, 0으로 초기화
		int tmp;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요(숫자만) : ");
		input = sc.nextInt();
		
		tmp = input;
		
		while (tmp != 0) {
			result += (tmp%10);//총합을 저장하는 result에 나머지값을 더합
			tmp -= (tmp%10);//나머지값을 뺴준다
			tmp /= 10;//10으로 나눠준다
		}
		System.out.println(input + "의 각자리의 합 : " + result); //결과값 출력
	}

}
