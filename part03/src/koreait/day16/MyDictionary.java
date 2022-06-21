package koreait.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
// 작성자 : 박현식
public class MyDictionary {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();	// ***mydic을 mywords로 바꿔서 구현해보기***
		System.out.println("1.단어저장    2. 단어검색    3. 전체보기    4. 레벨로검색  5.종료");
		String select;
		String eng,kor;
		int level;
		
		boolean run = true;
		
		
		while(run) {
			System.out.print("선택 -> ");
			select = sc.nextLine();
			switch (select) {
				case "1":
					System.out.print("English -> ");
					eng = sc.nextLine();
					System.out.print("Korean -> ");
					kor = sc.nextLine();
					System.out.print("레벨 -> ");
					Word temp = new Word(eng, kor);
					level = Integer.parseInt(sc.nextLine());
					temp.setLevel(level);
					mywords.add(temp);
					continue;
				case "2":
					System.out.print("검색 단어 English -> ");
					eng = sc.nextLine();
					for(Word w : mywords)
						if(w.getEnglish().equals(eng))
							System.out.println("단어장 검색했습니다. 결과 => " + w);
					break;
				case "3":
//					System.out.println("단어장 전체보기 : " + mywords);
					all(mywords);
					continue;
				case "4":
					System.out.print("검색할 레벨 입력(1~3) -> ");
					int no = Integer.parseInt(sc.nextLine());
					level(mywords,no);
					break;
					
				case "5":
					run = false;
					break;
				default:
					System.out.println("숫자를 잘못 입력했습니다. 1~4중 다시 선택");
					continue;
			}
		}
		System.out.println("단어장을 종료합니다.");
		
	}

	private static void level(List<Word> mywords, int no) {
			for(Word w : mywords)
				if(w.getLevel()==no)
					System.out.println(w);
		
	}

	private static void all(List<Word> mywords) {	// mywords의 참조값 전달받아 동일한 객체를 가리킵니다.
		mywords.sort(new Comparator<Word>() {
			
			@Override
			public int compare(Word o1, Word o2) {
				// TODO Auto-generated method stub
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		
		System.out.println(String.format("%-20s %-20s %10s", "English", "Korean", "Level"));
		System.out.println("------------------------------------");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s %10s", w.getEnglish(), w.getKorean(), w.getLevel()));
		}
	}
}
