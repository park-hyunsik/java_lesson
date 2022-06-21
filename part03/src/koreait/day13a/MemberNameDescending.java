package koreait.day13a;

import koreait.day12.Member;
import java.util.Comparator;
//Member 객체의 sort : 비교 가능한 값으로 필드 중 하나를 선택해서 비교자(Comparator) 구현체 만듭니다.
public class MemberNameDescending implements Comparator<Member>{
	
	
	@Override
	public int compare(Member o1, Member o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name2.compareTo(name1);	//내림차순 :
	}
	/*
	 * 리턴식은 음수값이 나오는 경우를 씁니다.	교환하지 않는 경우를 -1(음수)로 리턴하게 합니다.
	 * 각각 교환하지 않는 경우는
	 * 오름차순 : o1 < o2		//내림차순 : o1 > o2
	 */
	
	
}
