package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest4 {
	//Animal 클래스 isDog,isCrow 테스트 : 메소드 인자 Object (다형성구현)
	public static void main(String[] args) {

		Animal animal =new Dog();
		Dog puddle = new Dog();
		Crow crow = new Crow();
		Animal animal2 = new Crow();
		
		//메소드인자로 Object 타입 객체를 받는 메소드 
		System.out.println(Animal.isCrow(puddle));	//false
		System.out.println(Animal.isDog(puddle));//true
		System.out.println(Animal.isDog("동물"));	//false
		System.out.println(Animal.isDog(1));//false
		System.out.println(Animal.isCrow(animal));
		System.out.println(Animal.isCrow(crow));
		System.out.println(Animal.isCrow(animal2));
		System.out.println(Animal.isCrow("까마귀"));
		
	}

}
