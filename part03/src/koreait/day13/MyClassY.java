package koreait.day13;

//InterfaceB�Ǳ���ü (����Ŭ����,��ü)
public class MyClassY implements InterfaceB{

	@Override
	public String name(String name) {
		// TODO Auto-generated method stub
		return "MyClassY :"+name;
	}

	
}

//���� ���� : InterfaceA,InterfaceB��; ����ü (����Ŭ����,��ü)
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