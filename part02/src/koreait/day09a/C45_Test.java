package koreait.day09a;

import koreait.day09b.ClassAB;

public class C45_Test {

	//파일이 별도로 만들어서 테스트할수도 있습니다.
		public static void main(String[] args) {
			ClassAA test1 = new ClassAA();
			test1.ab = 123;	// test1이 참조하는 객체가 상속받은 필드
			test1.name="hong";
			
			//상속받은 메소드
			test1.print();
			//ClassAA에서 정의된 메소드
			test1.test();
			
			ClassAB test2 =new ClassAB();
			test2.test();
		}

		
}
