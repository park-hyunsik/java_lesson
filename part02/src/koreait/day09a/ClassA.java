package koreait.day09a;

/*
 * Ŭ������ ���
 * -> Ŭ���� ���� �θ�(����Ŭ����,super) �ڽ�(����Ŭ����)���谡 ��������ϴ�.
 * -> �θ��� Ŭ���� ������Ҹ� �ڽ��� ����Ҽ� �ֽ��ϴ�.��ӵǴ� ��Ҵ� �ʵ�,�޼ҵ�
 * -> extends Ű���� ����Ͽ� �θ�Ŭ������ �����մϴ�. ����Ŭ������ ���� 1���Դϴ�.
 * -> private ���������ڴ� ��� �ȵ˴ϴ�.
 * -> protected �� �ٸ���Ű���� Ŭ������ ��ӹ��� �� �ֵ��� �մϴ�.
 * -> ���Ǽ��迡�� �ݷ��������� �. ������ ������ ���ؼ� Ŭ���� ����. 
 * ������ ���� ��,�����,�ܽ���,������,�䳢,�����... -> �ϳ��� �׷����� Animal Ŭ���� �����ϰ� �������� ��Ҹ� ����
 *  -> ������ ��Ұ� �ƴѰ��� ��ü���� Ŭ������ ����(��, Cat,Dog,Rabbit,... ) �׸���Animal Ŭ������ ��ӹ޽��ϴ�.
 *  
 */
public class ClassA {
	int ab;
	String name;
	protected String title;	
	//protected�� ����Ʈ �����������̳� �ڽ�Ŭ������ ���ܷ� ���.
	
	 void print() {
		 System.out.println("ab = "+  ab);
		 System.out.println("name = " + name);
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	 
}
