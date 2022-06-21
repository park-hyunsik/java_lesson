package koreait.day13;

//InterfaceB의구현체 (구현클래스,실체)
public class MyClassY implements InterfaceB{

	@Override
	public String name(String name) {
		// TODO Auto-generated method stub
		return "MyClassY :"+name;
	}

	
}

//다중 구현 : InterfaceA,InterfaceB의; 구현체 (구현클래스,실체)
class MyClassZ implements InterfaceA,InterfaceB{
	@Override
	public void methodA() {
		System.out.println("MyClassZ methodA");
			
	}@Override
	public int methodB(int num) {
		System.out.println("MyClassZ methodA");
		return 3333;
	}@Override
	public String name(String name) {
		return "methodZ :"+name;
	}
	
	
}