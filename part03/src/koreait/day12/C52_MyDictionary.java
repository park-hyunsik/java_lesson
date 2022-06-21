package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;

public class C52_MyDictionary {
	public static void main(String[] args) {
	System.out.println("단어장프로그램입니다.");
	String MyDictionary = "1.단어저장, 2.단어검색, 3.단어장보기, 4.프로그램끝내기";
		
	HashMap<String,Integer> map = new HashMap<>();
	
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println(MyDictionary);
		System.out.println("원하는 기능을 선택하세요.종료는 4 입력) ->");
		String choice = sc.nextLine();
		if(choice.equals("4")) break;
		
		if(!map.containsKey(choice)) {
			System.out.println("단어장에 저장합니다.");
			map.put(choice,1);	MyDictionary += "," + choice;
			continue;
		}
		//입력받은 menu 의 value값을 가져오기 -> +1 하기 -> 결과를 저장하기.
		int temp = map.get(choice);
		map.put(MyDictionary, temp);	
		System.out.println(map);
	}
	System.out.println("프로그램을 종료합니다.");
	
	}
}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 */
