package koreait.day11.test;

//�߻� Ŭ����

public abstract class Animal {
	
	// �̸� ��ӵ� ��������� type�� ���ϴ� ����
	static final int CAT = 1;
	static final int DOG = 2;
	static final int CROW = 3;
	static final int FROG = 4;
	static final int SNAKE = 5;
	
	private String name;
	private String color;
	protected int type;
		

	public Animal() {
		System.out.println("���ο� Animal ������ ������ϴ�.");
	}
	
	//�߻�޼ҵ�� ����
		
	public abstract void act();
		
	
	
	//�� �ٸ� �߻�޼ҵ嵵 ��������.
	public abstract String eat(Object object);
	
	//Object �����ϰ� �ۼ��� �޼ҵ� �Դϴ�.
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
