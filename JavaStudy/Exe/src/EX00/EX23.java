package EX00;

import java.util.*;

public class EX23 {

	public static void main(String[] args) {
		
		//String 3ĭ �迭����!
		String[] names = new String[3];//[]�迭���̴�
		//names�迭�� 0��ĭ�� person1�̶�� �̸��� �����ض�
		names[0] = "person1";
		names[1] = "person2";
		names[2] = "person3";
		
		//names�� ����� �� ����ض� // ������ vs �ּ�����
//		for(int i = 0; i < names.length; i++){
//			System.out.println(names[i]);
//        }
//		
		for(int i = 2; i >= 0; i--){
			System.out.println(names[i]);
        }
		
	}

}
