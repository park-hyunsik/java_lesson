package koreait.day13a;

import koreait.day12.Member;
import java.util.Comparator;
//Member ��ü�� sort : �� ������ ������ �ʵ� �� �ϳ��� �����ؼ� ����(Comparator) ����ü ����ϴ�.
public class MemberNameDescending implements Comparator<Member>{
	
	
	@Override
	public int compare(Member o1, Member o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name2.compareTo(name1);	//�������� :
	}
	/*
	 * ���Ͻ��� �������� ������ ��츦 ���ϴ�.	��ȯ���� �ʴ� ��츦 -1(����)�� �����ϰ� �մϴ�.
	 * ���� ��ȯ���� �ʴ� ����
	 * �������� : o1 < o2		//�������� : o1 > o2
	 */
	
	
}
