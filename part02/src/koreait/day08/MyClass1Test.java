package koreait.day08;

public class MyClass1Test {

	public static void main(String[] args) {
		//MyClass1 ��ü����
		MyClass1 my = new MyClass1();
		
		//Myclass1 Ŭ������ �ʵ� �� ����Ҽ� �ִ°���?
		my.name="momo";
		my.point=1.234;
		//my.age=23;	//����:private ������ �ʵ�
		my.setAge(23);	//private �ʵ尪 ���� (����) �ϴ� �޼ҵ� : setter
		//System.out.println("age = " + my.age);	//����:private ������ �ʵ�
		System.out.println("age = " + my.getAge());	//private�ʵ尪 �о���� �޼ҵ� : getter
		my.setAge(-100);
		System.out.println("age = " + my.getAge());	
		System.out.println("point = " + my.point);	//public ������ �ʵ�
		System.out.println("name = " + my.name);	//package �⺻ ������ �ʵ�
		
		//Score Ŭ���� �ʵ�,�޼ҵ��� �����ڰ� ���default �Դϴ�.
		
		Score score = new Score();
		
	}
//���� ������ �׽�Ʈ�� �ڹٿ��� �����Ǵ� Ŭ�������� �����ϰ� �츮�� ���� Ŭ�������� ���.
}
