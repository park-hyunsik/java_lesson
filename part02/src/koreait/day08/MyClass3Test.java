package koreait.day08;

import java.util.Calendar;

public class MyClass3Test {

	public static void main(String[] args) {

//		MyClass3 my3 = new MyClass3();	//���� : �����ڰ� private ������
		MyClass3 my3 = MyClass3.getInstance();
		my3.test();
		MyClass3.staticTest();
		
		//�̸� ���� ��ü�� �������ִ� Canlendar Ŭ����
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
	}

}
