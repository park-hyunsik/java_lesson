package koreait.day09a;

public class Crow extends Animal {//까마귀
	
	protected int wings;	//디폴트 한정자+다른패키지 자식클래스
	
	public Crow() {
		System.out.println("새로운 동물가족은 crow");
	}
	public void fly() {
		setName("까마귀");
		setColor("검정색");
		System.out.println("특징 : 날기");
	}

}
