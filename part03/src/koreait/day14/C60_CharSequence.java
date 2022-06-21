package koreait.day14;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;


public class C60_CharSequence {

	
	//CharSequence 인터페이스 구현체 : String, StringBuffer, StringBuilder...
	public static void main(String[] args) {

		String result = new String();	//resul="result"; result = new String("test"_;
		System.out.println("result :" + result );
		System.out.println("1. String 타입 테스트");
		for(int i=2;i<6;i++) {
			//문자열 내용이 바뀌면 문자열 객체 위치가 달라집니다.
			result += i+"/";
			System.out.println("result :" + result );
		}
		
		StringBuffer sb = new StringBuffer();	//StringBuilder와 함께 ㅁ낳이 사용
		System.out.println("2. StringBuffer 타입 테스트");
		//StringBuffer 객체의 문자열 내용이 바뀌어도 기존 객체에 추가되는 동작을 합니다.
		//반복되는 연결 연산이 많은 경우 String? String Buffer O 효율적입니다.
		for(int i=2;i<6;i++) {
			sb.append(i).append(":");		//문자열 연결 연산 + 와 같으 ㄴ동작
			System.out.println("sb : "+sb);
		}
		//CharSequence 인터페이스 사용 : cotains메소드의 매게변수타입
		// boo
		String sample ="abc2/3/4/5/xyz";
		System.out.println("3. contains메소드 확인");
		System.out.println("contains(result)"+sample.contains(result));	//true
		System.out.println("contains(sb)"+sample.contains(sb));
		
		//메소드의 형식 또는 다른여러 형식들을 확인할때 : 1클래스or인터페이스 2. 인터페이스일때 구현체는 무엇인가?
		//참고 : Arraylist 선언할때 변수 선언 List 인터페이스 타입으로 합시다
		List<String> names = new ArrayList<>();
		names = new Vector<>();
		
		Map<String,Integer> map= new HashMap<String,Integer>();
		map = new TreeMap<String,Integer>();
	}
	
}
