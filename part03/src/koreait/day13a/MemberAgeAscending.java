package koreait.day13a;

import koreait.day12.Member;
import java.util.Comparator;
//Member ��ü�� sort : �� ������ ������ �ʵ� �� �ϳ��� �����ؼ� ����(Comparator) ����ü ����ϴ�.
public class MemberAgeAscending implements Comparator<Member>{
	
	
	@Override
	public int compare(Member o1, Member o2) {
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
		
		//age �ʵ�(1�� ����)���� ���� �� name �ʵ�(2�� ����) ������������ ����.
		if(age1==age2)
			return o1.getName().compareTo(o2.getName());
		else	
			return age1.compareTo(age2);		//�������� : age1<age2 �� �� -1�� ����
	}
	
	
	
}
