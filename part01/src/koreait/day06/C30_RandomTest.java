package koreait.day06;

import java.util.Random;

public class C30_RandomTest {

	public static void main(String[] args) {
		Random r = new Random();	//Random 클래스의 객체 생성(new 연산)
		
		System.out.println("1. 정수형 랜덤값 10개 출력");
		for(int i=0;i<10;i++) {
			int inum =r.nextInt();	//int 범위내에서 랜덤값(난수) 만듭니다.
			System.out.println(inum);
		}
		
		System.out.println("2. 정수형 랜던값 10개 출력 - bound(경계값) 있음.");
		for(int i=0;i<10;i++) {
			int inum =r.nextInt(100);	// 0<=난수 < 100 범위의 랜덤앖을 만듭니
			System.out.println(inum);
		}//경게앖은 양수값만 사용합니다.
		System.out.println("3. 정수형 랜던값 10개 출력 - bound(경계값) 있음.");
		for(int i=0;i<10;i++) {
			int inum =r.nextInt(100)+1;	// 1<=난수 < 101 범위의 랜덤앖을 만듭니
			System.out.println(inum);
		}
		//n보다 크거나 같고 m보다 작은 범위 난수 : r.nextInt(m-n)+n
		
		System.out.println("4. 2~45 범위의 값으로 난수10개");
			for(int i=0;i<10;i++) {
				int inum =r.nextInt(44)+2;	
				System.out.println(inum);
		}
		
	}

}
