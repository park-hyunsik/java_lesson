package koreait.day08;

public class MyClass1Test {

	public static void main(String[] args) {
		//MyClass1 객체생성
		MyClass1 my = new MyClass1();
		
		//Myclass1 클래스의 필드 중 사용할수 있는것은?
		my.name="momo";
		my.point=1.234;
		//my.age=23;	//오류:private 한정자 필드
		my.setAge(23);	//private 필드값 대입 (변경) 하는 메소드 : setter
		//System.out.println("age = " + my.age);	//오류:private 한정자 필드
		System.out.println("age = " + my.getAge());	//private필드값 읽어오는 메소드 : getter
		my.setAge(-100);
		System.out.println("age = " + my.getAge());	
		System.out.println("point = " + my.point);	//public 한정자 필드
		System.out.println("name = " + my.name);	//package 기본 한정자 필드
		
		//Score 클래스 필드,메소드의 한정자가 모두default 입니다.
		
		Score score = new Score();
		
	}
//접근 한정자 테스트는 자바에서 제공되는 클래스들을 이해하고 우리가 만들 클래스에도 사용.
}
