package koreait.day09a;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.act();
		animal.print();
		System.out.println("----------------------");
		
		Dog dog = new Dog();
		dog.run();
		dog.print();//��� �޼ҵ�
		System.out.println("----------------------");
		Crow crow = new Crow();
		crow.fly();
		crow.print();
		
		System.out.println(":::::::::::::::::::::::::::::::::::");
		Animal temp = dog;		//�ڽİ�ü�� �θ�Ŭ���� Ÿ������ �����Ҽ� �ֽ��ϴ�.
		temp.print();
		//temp.run();				//����: �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� ���մϴ�.
		temp=crow;				//�ڽİ�ü�� �θ�Ŭ���� Ÿ������ �����Ҽ� �ֽ��ϴ�.
		temp.print();
		//temp.fly();				//����: �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� ���մϴ�.
		System.out.println("-----------------------");
		Animal puppy = new Dog();	//�ڽİ�ü�� �θ�Ŭ���� Ÿ������ �����Ҽ� �ֽ��ϴ�.
		puppy.print();
		//puppy.run();				//���� : �θ�Ÿ�� �����δ� �ڽ� �޼ҵ� ���� ���մϴ�
		
		Dog puddle = (Dog)puppy;		// Animal Ÿ���� Dog Ÿ������ casting.
		puddle.run();					// puppy ������ �����ϴ� ��ü�� Dog Ÿ���ϋ��� ����.
		puddle.print();
	
	}
	

}
