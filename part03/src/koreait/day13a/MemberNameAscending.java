package koreait.day13a;

import koreait.day12.Member;
import java.util.Comparator;
//Member ��ü�� sort : �� ������ ������ �ʵ� �� �ϳ��� �����ؼ� ����(Comparator) ����ü ����ϴ�.
public class MemberNameAscending implements Comparator<Member>{
	
	
	@Override
	public int compare(Member o1, Member o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name1.compareTo(name2);		//�������� : age1<age2 �� �� -1�� ����
	}
	
	
	
}
