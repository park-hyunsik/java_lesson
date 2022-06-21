package koreait.day13a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import koreait.day12.Member;

public class C55_ListSortTest {
//sort 와 관련된 인터페이스 사용.
	public static void main(String[] args) {
		//List는 인터페이스, ArrayList는 구현체
		//다형성 : List를 참조타입으로 하여 선언합니다. 앞으로 배울 라이브러리들이 List타입으로 원합니다.
		List<Integer> ilist = new ArrayList<>();
		List<String> slist = new ArrayList<>();
		
		ilist.add(34);		//인덱스 0
		ilist.add(77);		//		1
		ilist.add(19);		//		2
		ilist.add(56);		//sort 등 정렬을 사용하면 인덱스의 요소가 바뀌게 된다.
		ilist.add(45);
		ilist.add(9);
		System.out.println("sort 이전 : " + ilist);
		//정렬 : 오름차순
		ilist.sort(null); 	//인자로 필요한 것은 비교자 Comparator 구현체가 필요합니다.
							//기본형, String은 null 로 할 수 있습니다. (오름차순 기준)
		System.out.println("sort 이후 : " + ilist);
							//
		ilist.sort(Comparator.reverseOrder());		//reverse: 역순(내림차순),
									//Comparator 인터페이스의 static 메소드
		System.out.println("내림차순 정렬 sort : " + ilist);
		
		slist.add("트와이스");
		slist.add("오마이걸");
		slist.add("아이즈원");
		slist.add("비비즈");
		slist.add("소녀시대");
		slist.add("브레이브걸즈");
		System.out.println("sort 이전 : " + slist);
		
		slist.sort(null);
		System.out.println("sort 이후 (ASCending): " + slist);
		
		slist.sort(Comparator.reverseOrder());
		System.out.println("내림차순 정렬 sort(DESCending) : " + slist);
		
		List<Member> mlist = new ArrayList<>();

		mlist.add(new Member("momo",23));
		mlist.add(new Member("nana",27));
		mlist.add(new Member("nayeon",25));
		mlist.add(new Member("dahyeon",29));
		mlist.add(new Member("sooni",26));
		mlist.add(new Member("jenny",27));
			
		System.out.println("member 리스트 상태 : " + mlist);
		//mlist.sort(null);		//오류 : Member 객체는 비교할 수 없는 객체 -> 비교자 인터페이스를 인자로 해야함.
		              //Member 객체의 sort : 비교 가능한 값으로 필드 중 하나를 선택해서 비교자(Comparator) 구현체 만듭니다.
		
		
		mlist.sort(new MemberAgeAscending());
		System.out.println("member sort 확인(ASC) : " + mlist);
		mlist.sort(new MemberAgeDescending());
		System.out.println("member sort 확인(DESC) : " + mlist);
		
		System.out.println("\n2.Comparable 인터페이스 사용하는 sort");
		List<User> ulist = new ArrayList<User>();
		ulist.add(new User("모모",23));
		ulist.add(new User("나나",27));
		ulist.add(new User("나연",25));
		ulist.add(new User("다현",29));
		ulist.add(new User("수니",26));
		ulist.add(new User("제니",27));
		
		System.out.println("user 리스트 상태 : " + ulist);
		//User는 비교할 수 있는 타입 : Comparable 구현체
		ulist.sort(null);
		System.out.println("user sort(ASC) : " + ulist);
		ulist.sort(Comparator.reverseOrder());
		System.out.println("user sort(DESC) : " + ulist);
	
		
		
ulist.sort(new Comparator<User>() {
	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
});	// 메소드 인자로 익명 클래스를 정의해서 객체를 생성.

System.out.println("user sort(name ASC)" + ulist);
	}

}
