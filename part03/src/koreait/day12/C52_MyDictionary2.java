package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary2 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);	//키보드 입력시 넥스트라인,인트 등 같이쓰면 입력이 정상실행안댐
		//HashMap<String, String> mydic = new HashMap<>();	//단어장 저장할 자료 구조
		TreeMap<String, String> mydic = new TreeMap<String, String>();//이진 검색가능한 구조로map을생성:정렬이되는Map
		
		String sel, eng, kor;
		System.out.println("선택기능 1.단어저장 2.단어검색 3.단어장보기 4.프로그램끝내기");
		boolean run = true;
		while (run) {	//whil 반복안에 switch 로 종료조건을 동작시킬때 break 로 못합니다->변수 사용했습니다.
			System.out.println("선택 ->");
			sel = sc.nextLine();
			switch (sel) {
			case "1":	//switch문에서 case "문자열"형식
				System.out.print("English -> ");
				eng = sc.nextLine();
				System.out.print("한글 뜻 -> ");
				kor = sc.nextLine();
				mydic.put(eng, kor);	//저장
				break;
				
			case "2":
				System.out.print("검색 단어 English -> ");
				eng = sc.nextLine();
				System.out.println("단어장 검색했습니다. 결과 =>"+mydic.get(eng));
				break;
				
			case "3":
				System.out.print("단어장 전체보기 :" + mydic);
				break;
				
			case "4":
				run=false;
				break;
				
			default:
				System.out.println("잘못 입력된 선택입니다. 1~4 입력입니다.");
				break;
			}
			System.out.println("단어장종료==========");
		}
		
		//참고 : 정수 데이터 입력을 받아야 한다면 문자열 nexLine() 받아서 정수로 변환합니다.
		//int score = Integer.parseInt(sc.nextLine()0;
		//이유 : nextInt()는 엔터를 처리하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 됩니다.
		//결론 : 한소스파일에서 nextInt() 만 사용 또는 nextLine()만 사용하거나 합니다.
		
		
		
		
	}
	}