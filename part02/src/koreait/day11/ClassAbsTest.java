package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {

	public static void main(String[] args) {
		Person momo = new Person();	//�Ϲ�Ŭ����
		//ClassAbs abs = new ClassAbs();	//���� : ClassAbs�� �߻�Ŭ����. new ���մϴ�.
		ClassAbs abs = new ClassX();	//���� : ClassAbs�� �߻�Ŭ����. new ���մϴ�.
		ClassX cls = new ClassX();
		System.out.println("�׽�Ʈ ù��° : test �޼ҵ�");
		abs.test();
		cls.test();
		abs.name="�����";
		cls.name="���";
		abs.print();
		cls.print();
		System.out.println("�׽�Ʈ �ι�° : �ڽ��ʵ� num");
		cls.setNum(23);
		cls.test();
		ClassX x = (ClassX)abs;
		x.setNum(100);
		abs.test();
		
		
	}

}
