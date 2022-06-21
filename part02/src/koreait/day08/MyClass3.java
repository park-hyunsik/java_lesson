package koreait.day08;

//이렇게 객체를 생성하는 클래스도 있습니다.(예시)
public class MyClass3 {
	//필드 타입이 자기자신 클래스
	private static MyClass3 my = new MyClass3();
	private MyClass3() {	//생성자는 private - 다른 클래스에서는 new 동작 X
	}
	
	public static MyClass3 getInstance() {
		return my;
	}
	
	public void test() {
		System.out.println("이렇게 객체를 생성하는 클래스는 객체를 오직 1개만 만듭니다.");
	}
	public static void staticTest() {
		System.out.println("이 메소드는 객체를 만둘지 않고 실행되는 static 입니다.");
	}
	
}
