package koreait.day11.test;

public class Crow extends Animal{	//까마귀
	protected int wings;  //디폴트 한정자+다른패키지 자식클래스

	
	public Crow() {
		System.out.println("새로운 동물가족은 crow");
		type= Animal.CROW;
	}
	
	public void fly() {
		setName("까마귀");
		setColor("검정색");
		System.out.println("특징 : 날기");
	}
	
	//추상 메소드 재정의(구현)
	@Override
	public void act() {
		System.out.println("Animal 행동 : 하루종일 날라다니기");
	}
	
	@Override
		public String eat(Object object) {
			return "먹이는" + object + "벌레";
		}
}
