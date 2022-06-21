package koreait.day11;

/*
 * 1 추상클래스 : 객체를 직접생성하지 않는 형태의 클래스 입니다.
   2     추상메소드를 갖고 있습니다. 추상(abstract): 구체화되지 않은 상태.
   3 부모클래스에서 구체화되지 않은 추상메소드를 자식클래스가 재정의(오버라이드)하도록 하는 것입니다
	4. 비유 : '사람'은 추상화 개념. '손흥민' 은 구상화된실체.
		ㄴ 추상클래스 목적은 추상화 된것은 객체를 만들지 마라!!
	5. 추상메소드를 재정의(구형)한 자식클래스를 정의해서 객체를 생성합니다.
 */

public abstract class ClassAbs {
	
	protected String name;	//자식 클래스는 다른 패키지에서도 직접 접근
	
	//추상메소드 : 자식들이 재정의 하도록 형식만 선언합니다. { }(body,몸체) 없습니다.
	public abstract void test();
	
	//인스턴스 메소드
	public void print() {
		System.out.println("name=" + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
		

	
}
