package koreait.day13a;

import koreait.day12.Member;
import java.util.Comparator;
//Member 객체의 sort : 비교 가능한 값으로 필드 중 하나를 선택해서 비교자(Comparator) 구현체 만듭니다.
public class MemberAgeDescending implements Comparator<Member>{
	
	
	@Override
	public int compare(Member o1, Member o2) {
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
		return age2.compareTo(age1);	//내림차순 :
	}
	
	
	
}
