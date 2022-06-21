package koreait.day08;

public class MyClass2 {
	private int age;
	private String name;
	
	//커스텀 생성자 정의 연습	: 생성자 메소드 이름은 반드시 1)클래스이름과 동일하게 2)리턴타입은 없는 형식
	//						3)접근 한정자는 4가지 모두 가능 
	//					목적: 필드초기화이고 연산식 또는 다른 명령문도 포함 가능.
	
	
	MyClass2(String name){
		this.name=name;	//setter메소드 처럼 전역변수(필드)값을 초기화.
	}
	
	//기본 생성자를 직접 정의해보기
	MyClass2(){
		
	}
		//참고: 커스텀생성자를 정의하고 기본생성자 허용하지 않는 경우 많습니다.

	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {	//setter는 생성자로 대신하고 getter만 있는 예시
								// -> 생성자에서 초기화한 값을 변경할 수 없다.
		
		return name;
	}
	
}
/*
 * 생성자 메소드 연습합니다.(리턴값은 없고 , 인자는 있을수도 있는 메소드 )- constructor
-> 생성자 메소드 실행으로 객체가 만들어집니다. 	Random r = new Random();  에서 Random() 이 생성자메소드이고
객체를 만들기 위해 실행되는 메소드입니다.
-> 기본생성자 : 인자가 없는 형식의 생성자
-> 커스텀생성자 : 필드값 초기화를 위해서 인자가 있는 형식의 생성자
 */

