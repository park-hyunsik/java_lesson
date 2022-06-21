package koreait.day09a;

/*
 * 클래스의 상속
 * -> 클래스 간의 부모(상위클래스,super) 자식(하위클래스)관계가 만들어집니다.
 * -> 부모의 클래스 구성요소를 자식이 사용할수 있습니다.상속되는 요소는 필드,메소드
 * -> extends 키워드 사용하여 부모클래스를 지정합니다. 슈퍼클래스는 오직 1개입니다.
 * -> private 접근한정자는 상속 안됩니다.
 * -> protected 는 다른패키지의 클래스가 상속받을 수 있도록 합니다.
 * -> 현실세계에서 반려동물샵을 운영. 데이터 저장을 위해서 클래스 정의. 
 * 동물의 종류 개,고양이,햄스터,도마뱀,토끼,열대어... -> 하나의 그룹으로 Animal 클래스 정의하고 공통적인 요소를 정의
 *  -> 공통적 요소가 아닌것은 구체적인 클래스로 정의(예, Cat,Dog,Rabbit,... ) 그리고Animal 클래스를 상속받습니다.
 *  
 */
public class ClassA {
	int ab;
	String name;
	protected String title;	
	//protected는 디폴트 접근한정자이나 자식클래스만 예외로 허용.
	
	 void print() {
		 System.out.println("ab = "+  ab);
		 System.out.println("name = " + name);
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 
}
