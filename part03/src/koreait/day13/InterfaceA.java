package koreait.day13;

public interface InterfaceA {

//오늘의 주제 : 인터페이스 (참고 : 클래스의 상속, 추상클래스의 추상메소드가 관련성 있는 내용입니다.)	
/*   자바인터페이스의 특징
 *   1. 객체를 생성하지 않습니다.
 *   2. 필드는 상수만 있습니다.		public static final 생략합니다.
 *   3. 추상메소드를 갖고 있습니다.    public abstract  생략합니다. 
 *   4. static 메소드와 인스턴스메소드(반드시 키워드 default 사용) 도 사용할 수 있습니다. 접근한정자 public입니다.
 *   
 *   자바 객체지향프로그래밍 특징 : 다형성. 인터페이스는 다형성 구현을 위한 대표적인 방법입니다.
 *   						인터페이스는 다중구현(implement). 일반 상속은 단일 상속(extends)
 *   자바 라이브러리의 많은 클래스들이 인터페이스를 통해 구현되어 있습니다. 자바클래스들을 사용하기 위해 인터페이스의 특징을 이해합니다.
     인터페이스는 기능 즉 메소드를 중심으로 참조 타입을 설정합니다.같은 기능을 구현한 클래스이면 같은 인터페이스 타입으로 참조합니다.
 */
	
		//2.상수필드
		int SIZE=10;
		
		//3.추상메소드 선언
		void methodA();
		int methodB(int num);
		
		
		
		//4. 접근한정자: public 만.
		static void methodC() {	//정적메소드
			System.out.println("나는 static 메소드 입니다.");
		}
		//인터페이스를 사용하는 기존 애플리케이션과 호환을 위해서
		//추가적인 기능은 디폴트 메소드로 정의해서 사용합니다
		default void methodD(String message) {//디폴트(인스턴스와 유사) : 재정의를 위해서 만듭니다.
			System.out.println("수신된 메시지는 " + message +" 입니다.");
		}
	
}
