package koreait.day08;

public class MyClass1 {

	private int age;	//�ڹ��� Ư�� : ���м�(��м�)�� Ŭ������ �ʵ尪�� �ٸ� Ŭ������ ���� �������� ���ϵ��� �մϴ�.(ĸ��ȭ)
	String name;
	public double point;
	
	//private �ʵ�� setter,getter �� �֤���� �ٸ�Ŭ�������� �� ����/�б� �Ҽ� ����.

	void setAge(int age) {
		if(age>1 && age<=150)
			this.age=age;	//age�ʵ�� ���� Ŭ���������� ����.
		else
			System.out.println("�߸��� ���Դϴ�.");
	
	}
	
	int getAge() {//get Age �� pakage ������
		return age;
	}
}
/*
 *  private int age;			//private  : �ٸ� Ŭ�������� ��� ���մϴ�. ������. ��(���� Ŭ����)�� ����Ѵ�.
	String name;				//default(package)  : �ٸ� ��Ű������ ��� ���մϴ�. �̿��̸� ���̾���.
	public int score;			//public   : ��𼭳� ����մϴ�.������,������... �ٰ��� ����.

 *  private , default, protected, public�� 
 *  ����(�ʵ�),�޼ҵ�,������, Ŭ���� � ���Ǵ� ���������� �Դϴ�.(Ŭ������ ���������� default,public �� ����մϴ�.)
 */
