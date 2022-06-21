package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class C70_StringSplit {

	public static void main(String[] args) {

		
		String temp = "모모 90 88 79";
		String result[] = temp.split(" ");
		System.out.println("1. 반복문 없이 출력");
		System.out.println("index 0 : " + result[0]);
		System.out.println("index 1 : " + result[1]);
		System.out.println("index 2 : " + result[2]);
		System.out.println("index 3 : " + result[3]);
		System.out.println("result length : " + result.length);
		
		//for문으로
		System.out.println("2. 일반적인 for 출력");
		for(int i=0;i<result.length;i++) {
			System.out.println(String.format("result[%d] : %s", i,result[i]));
		}
		
		//향상된for
		System.out.println("3. 향상된 for 출력");
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		String temp2 = "모모, 90 88 79";
		result = temp2.split(",");
		System.out.println("4. split 구분 기호");
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		temp2 = "모모,,90,,88,,79";
		result = temp2.split(",");
		System.out.println("5. split 구분 기호");
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		//result[1],result[3],result[5] 3개의 빈 문자열 입니다.

		result = temp2.split(",,");
		System.out.println("6. split 구분 기호");
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		temp2 = "모모,90 88()79";
		result = temp2.split("[ , ()]");
		System.out.println("7. split 인자가 정규식");
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		temp2 = "모모,90,88,79";
		//result = temp2.split(",",2);
		result = temp2.split(",",6);
		System.out.println("8. split 두번째 인자 limit 확인");
		System.out.println("result length : " + result.length);
		for(String t : result)
			System.out.println("result 요소 : " + t);
		
		System.out.println("9. split 두번째 인자 limit 확인");
		List<String> rlist = Arrays.asList(result);
		System.out.println(rlist);
		System.out.println("rlist size :" +rlist.size());
		for(String t : rlist)
			System.out.println("rlist 요소 : " + t);
		
		//위의 rlist는 배열의 크기만큼 List 의 크기를 정적으로 생성합니다.
		//rlist.add("test");
		
		List<String> rlist2 = new ArrayList<String>(rlist);
		rlist2.add("test");
		rlist2.remove(2);
		rlist2.add(2,"100");
		System.out.println(rlist2);
		
		//Arrsatys.asList 는 테스트용으로 또는 간단한 고정 리스트 사용으로 만들떄 유용합니ㅏㄷ.
		List<Integer> ilist = Arrays.asList(1,2,6,9,100);
		System.out.println("11. Arrays.asList 활용");
		System.out.println(ilist);
	
		
		
		
		
	}

}
