package koreait.day07;

public class C36_C35Test {

	public static void main(String[] args) {
//C35 Ŭ������ 1)��ü�� ���� 2)static �� �͵� �׽�Ʈ�մϴ�.
//(����: main�޼ҵ带 ���� Ŭ������ ��ü�� ������ �ʴ°��� �Ϲ����Դϴ�.)
		
		C35_GlobalVar test1 = new C35_GlobalVar(); 	//c35 Ŭ���� Ÿ���� ��ü�� ����
		C35_GlobalVar test2 = new C35_GlobalVar(); 
		
		//C35Ŭ�������� static �� �ƴ� �ν��Ͻ� �������� ��ü���� �ٸ����� ���� ��ü ���� �ٸ� Ư���� ��Ÿ���ϴ�.
		test1.count =10;
		test2.count =20;
		
		test1.message="hi test1";
		test2.message="hello test2";
		
		test1.methodA();	//�ν��Ͻ� �޼ҵ�
		test2.methodA();	//

		test1.methodC(123);	//�ν��Ͻ� �޼ҵ�
		test2.methodC(999);	//
		
		System.out.println("test1.count = " + test1.count);
		System.out.println("test2.count = " + test2.count);
		
		//static ��� �׽�Ʈ : static ���� �Ǵ� �޼ҵ�� Ŭ���� �̸����� ���(��ü�� ��� ���������� ������ 
		
		C35_GlobalVar.num=101;
		System.out.println("static num =" + C35_GlobalVar.num);
		System.out.println("static num =" + test1.num);
		System.out.println("static num =" + test2.num);
		
		//static�� ����Ǵ� �޸� ������ ��ü�� ����Ǵ� �޸� ������ �����Դϴ�
		
		//��� TEST Ȯ��
		System.out.println("TEST =  " + C35_GlobalVar.TEST);
//		C35_GlobalVar.TEST = 9999; 		//���� final���� �������
		
		C35_GlobalVar test3 = new C35_GlobalVar();
			//���� ������ �⺻ �ʱⰪ? - 0,0.0,����Ÿ����null
		//���� : ���������� �⺻ �ʱⰪ? - �迭�϶��� 0 0.0 ����Ÿ���� null, �׸��� �⺻�� ������ Ÿ���� ����
		System.out.println("test3.count = " + test3.count);
		System.out.println("test3.message = " + test3.message);
		System.out.println("C35_GlobalVar.point = " + C35_GlobalVar.point);
		
	}

}
