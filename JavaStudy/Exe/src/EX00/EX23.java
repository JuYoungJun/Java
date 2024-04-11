package EX00;

import java.util.*;

public class EX23 {

	public static void main(String[] args) {
		
		//String 3칸 배열생성!
		String[] names = new String[3];//[]배열형이다
		//names배열의 0번칸에 person1이라는 이름을 저장해라
		names[0] = "person1";
		names[1] = "person2";
		names[2] = "person3";
		
		//names에 저장된 값 출력해라 // 값저장 vs 주소저장
//		for(int i = 0; i < names.length; i++){
//			System.out.println(names[i]);
//        }
//		
		for(int i = 2; i >= 0; i--){
			System.out.println(names[i]);
        }
		
	}

}
