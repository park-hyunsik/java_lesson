package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {

	public static void main(String[] args) {
		Person momo = new Person();	//일반클래스
		//ClassAbs abs = new ClassAbs();	//오류 : ClassAbs는 추상클래스. new 못합니다.
		ClassAbs abs = new ClassX();	//오류 : ClassAbs는 추상클래스. new 못합니다.
		ClassX cls = new ClassX();
		System.out.println("테스트 첫번째 : test 메소드");
		abs.test();
		cls.test();
		abs.name="손흥민";
		cls.name="모모";
		abs.print();
		cls.print();
		System.out.println("테스트 두번째 : 자식필드 num");
		cls.setNum(23);
		cls.test();
		ClassX x = (ClassX)abs;
		x.setNum(100);
		abs.test();
		
		
	}

}
