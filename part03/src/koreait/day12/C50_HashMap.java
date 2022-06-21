package koreait.day12;

import java.util.HashMap;

public class C50_HashMap {

	public static void main(String[] args) {

		//�Ĵ��� �޴���(�޴��̸�, ����) �����͸� �����Ϸ��� �մϴ�.
		String[] title = {"���İ�Ƽ","������ũ","������"};
		int[] price = {12000,22000,7000};

		//key�� �޴��̸�, value �� �������� �ϴ� Hashmap ����.
		//key�� �ߺ��� ������ ��� ���մϴ�.(�����Ѱ�)
		HashMap<String,Integer> menus = new HashMap<>();
	
		//������ ���� : put() �޼ҵ�
		menus.put("���İ�Ƽ",12000);
		menus.put("������ũ",22000);
		menus.put("������",7000);
		
		System.out.println("1.����� ������ ���");
		System.out.println(menus);
		
		//������ ����(�б�) : get()  �޼ҵ�
		System.out.println("2.Ư���� key�� value ���");
		System.out.println("'���İ�Ƽ�� ����?'" + menus.get("���İ�Ƽ"));
		System.out.println("'������ũ�� ����?'" + menus.get("������ũ"));
		System.out.println("'�������� ����?'" + menus.get("������"));
	
		//key �� �ߺ��Ǹ�?
		menus.put("������",8200);		//������? �����(value�� ����)
		System.out.println(menus);
	
		//�����ͻ��� : remove() �޼ҵ�
		System.out.println("3.Ư����� ����");
		menus.remove("������ũ");	//���ڰ�key
		System.out.println("������� Ȯ�� : " + menus);
		menus.remove("������",8200);	//���ڰ� key,value : key�� value �� ��� ��ġ�ؾ� ����.
		System.out.println("������� Ȯ�� : " + menus);
	}
		
	}


/*	ArrayList : ������(�ε����� ����) ���� �����͸� �����ϴ� �ڷᱸ���Դϴ�.�迭�� ������ �����Դϴ�.
	HashMap : �������� ������ �ƴմϴ�. �ε����� ������� �װ� Key ���� �̿��Ͽ� �����������Ͽ� ����/�б� �մϴ�.
			*�˻�*�� ���� �˰��� �����մϴ�. 
  		���ʸ� Ÿ���� K:Key , V:Value �ѽ��Դϴ�.
  		key�� value �� ��� Ÿ���� �����մϴ�. ( hashmap ������ key,value �ѽ����� ��Ұ� �˴ϴ�. value�� �˻��ϱ� ���ؼ� key�� ����մϴ�.)
 	HashMap�� ArrayList �� ���������� int,long,double �⺻�� Ÿ�� ��ſ� ����(wrapper)Ŭ������ ǥ���մϴ�.
*/
