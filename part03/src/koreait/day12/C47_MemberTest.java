package koreait.day12;

import java.util.ArrayList;

public class C47_MemberTest {

	public static void main(String[] args) {
		//Member[] members = new Member[10];
		ArrayList<Member> list = new ArrayList<>();	//����Ʈ�� ����Ǵ� ���� ��ü�� ������.
		
		list.add(new Member("���", 27)); //���ο� ��ü �����ϰ� �������� ����Ʈ�� �߰�
		Member member = new Member("����", 26);
		list.add(member);
		list.add(new Member("����",20));
		list.add(new Member("�ź�",22));
		System.out.println("���� list�� ��� ���� : " + list.size());
		System.out.println("1. ��ü ����Ʈ ���");
		System.out.println(list);
		//list.get(i) -> Member ��ü�� ������
		System.out.println("2.list�� ��� �� ���� ��ü age �� �ʵ� ���� 25���� �ΰ͸� ����غ���.");	//for
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAge() <=25)
				System.out.println("i=" + i + "," + list.get(i));
		}
		
		System.out.println("3. '����'�� ��� �ε������� �����ϰ� �ִ� ��ü�ΰ�?");
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getName().equals("����"))
				System.out.println("i=" + i + "," + list.get(i));
			}
		//����Ʈ ��Ұ� �������� �ʵ带 ���� ��ü�̸� �ʵ尪 ���ϴ� equals �����Դϴ�.
			
		System.out.println("4. ����");
		//	indexOf �޼ҵ�� ���ʸ� Ÿ���� String, �⺻ ����Ŭ������ �߰����� ��� �������� ����մϴ�.
		System.out.println("Member ��ü�� indexOf ���� : " + list.indexOf(new Member("����",20)));
		//-1, ������(����: �������� ���� ���� ã�°��ε� �̰��� �ʵ尪 ���ؼ� ã���� �ٲپ� �ִ� ��� ������ �ʿ��մϴ�.)
		System.out.println("Member ��ü�� indexOf ���� : " + list.indexOf(member));	//1
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals("����")&&list.get(i).getAge()==20)
			System.out.println("i=" + i + "," + list.get(i));
		}
	}

}
