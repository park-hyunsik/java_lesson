package koreait.day14;

@FunctionalInterface
public interface FunctionA {
	int methodA(int a, int b);
}

//함수형 인터페이스 :
//인터페이스 중에 *추상메소드가 1개인 것*은 다른 프로그래밍 언어에서 사용되는 함수 형식으로 표현할 수 있습니다.
//다른프로그래밍언어와 자바에서 -> 기호로 줄여서 씁니다 람다식. 가독성, 간결성을 위해서 사용합니다.

//추상메소드 이름은 중요하지 않습니다.
//형식 : 리턴값, 인자*매게변수
//자바에는 형식에 따라 사용할 수 있는 여러가지 함수형 인터페이스가 있습니다. Consumer,Producer , Predicate....