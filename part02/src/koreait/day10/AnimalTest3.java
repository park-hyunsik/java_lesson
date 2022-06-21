package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest3 {

	//������ ���� ���� 3
	public static void main(String[] args) {
		// �θ�Ÿ�� Ŭ���� �迭 : �迭���� Animal Ÿ�� �ν��Ͻ� ��ü�� �������� ����.
		 Animal[] animals = new Animal[10];
		 
		 animals[0]	= new Frog();
		 animals[1]	= new Cat();
		 animals[5]	= new Dog();
		 animals[7]	= new Frog();
		 animals[8]	= new Crow();

		for(Animal temp : animals) {
			System.out.println(":::");
			if(temp != null) {
				Cat cat; Dog dog; Frog frog; Crow crow;
			if(temp instanceof Cat) {
				cat = (Cat)temp;	//����:animal ��¥ ��ü�� ���� ���� �Ǵ� ���� ����.
				cat.sound();
			}
			if(temp instanceof Dog) {
				dog = (Dog)temp;
				dog.run();
			}
			if(temp instanceof Frog) {
				frog = (Frog)temp;	
				frog.jump();
			}
			if(temp instanceof Crow) {
				crow = (Crow)temp;	
				crow.fly();
			}

			 temp.act();
			 temp.print();
			 //if end
			}
			else {
				System.out.println("null �����Դϴ�.");
				
			}
		System.out.println(":::");
		 } 
		}
}