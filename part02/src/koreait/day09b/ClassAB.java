package koreait.day09b;

import koreait.day09a.ClassA;


public class ClassAB extends ClassA{
	//���� �� Ŭ������ �ʵ�,�޼ҵ� ��� �޾ҳ� Ȯ��. - ClassA�� Private,default ���������� ��Ҵ� ��� ������.

	public void test() {
//		System.out.println("*name" + name);	//name�ʵ� ���������ڴ� ����Ʈ: �ٸ���Ű������ ���
		title="���";
		System.out.println("title =" + title);	//��ӹ��� title�ʵ� : �ٸ���Ű�� ������ protected ���������ڷ� �ڽ�Ŭ������ ���.
		setName("�ź�");
		System.out.println("name = " + getName());
		}
	}
	
