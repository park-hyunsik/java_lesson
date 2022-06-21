package koreait.day11.test;

//추상 클래스

public abstract class Animal {
	
	// 미리 약속된 상수값으로 type을 정하는 예시
	static final int CAT = 1;
	static final int DOG = 2;
	static final int CROW = 3;
	static final int FROG = 4;
	static final int SNAKE = 5;
	
	private String name;
	private String color;
	protected int type;
		

	public Animal() {
		System.out.println("새로운 Animal 가족이 생겼습니다.");
	}
	
	//추상메소드로 변경
		
	public abstract void act();
		
	
	
	//또 다른 추상메소드도 만들어보세요.
	public abstract String eat(Object object);
	
	//Object 설명하고 작성한 메소드 입니다.
	public void print() {
		System.out.println("name :" + name +"color:" + color);
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + "]";
	}

	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

	}
