package koreait.day13a;

import koreait.day12.Member;
import java.util.Comparator;
//Member ��ü�� sort : �� ������ ������ �ʵ� �� �ϳ��� �����ؼ� ����(Comparator) ����ü ����ϴ�.
public class MemberAgeDescending implements Comparator<Member>{
	
	
	@Override
	public int compare(Member o1, Member o2) {
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
		return age2.compareTo(age1);	//�������� :
	}
	
	
	
}
