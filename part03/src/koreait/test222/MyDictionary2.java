package koreait.test222;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class MyDictionary2 {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);  
      List<Word2> mywords = new ArrayList<>();
      
      String sel, eng, kor;
      int level;
      System.out.println("선택 기능 👉   1. 단어저장     2. 단어검색     3. 단어장보기    4.프로그램 끝내기");
      boolean run = true;
      while (run) {     
         System.out.print("선택 ✏->");
         sel = sc.nextLine();
         switch (sel) {
         case "1":      //switch문에서 case "문자열" 형식 가능.  if문에서는 sel.equals("1") 로 해야합니다.
            System.out.print("English -> ");
            eng = sc.nextLine();    //sc.nextInt();
            System.out.print("한글 뜻 -> ");
            kor = sc.nextLine();
            System.out.println("레벨-> ");
            level = Integer.parseInt(sc.nextLine());
            Word2 temp = new Word2(eng,kor);
            temp.setLevel(level);
            mywords.add(temp);
            
            break;
         case "2":
            System.out.print("검색 단어 English -> ");
            eng = sc.nextLine();
            for(Word2 w : mywords)
            	if(w.getEnglish().equals(eng))
            System.out.println("단어장 검색했습니다. 결과 =>" +w);
            break;
         case "3":
            //System.out.println("단어장 전체보기 :" + mywords);
            all(mywords);     //정렬하고 출력하기
        	 break;
         case "4":
            run=false;   
            break;
         default:
            System.out.println("👁‍🗨잘못 입력된 선택입니다.1~4 입력입니다.");
            break;
         }
      }   //while end
      System.out.println("::::  너의 단어장 종료합니다. ::::");
      
   }   //참고 : 정수 데이터 입력을 받아야한다면 문자열 nextLine() 받아서 정수로 변환합니다.  
      //   int score = Integer.parseInt(sc.nextLine());
      //   이유: nextInt()는 엔터를 처리 하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 됩니다.
      //    결론 : 한 소스 파일에서 nextInt() 만 사용 또는 nextLine()만 사용하거나 합니다.   

private static void all(List<Word2> mywords) {	//mywords 의 참조값 전달받아 동일한 객체를 가리킵니다.
		
	mywords.sort(new Comparator<Word2>() {
		@Override
	public int compare(Word2 o1, Word2 o2) {
		// TODO Auto-generated method stub
		return o1.getEnglish().compareTo(o2.getEnglish());
	}
	});

	
	System.out.println(String.format("%-20s %-40s %10s", "English", "Korean","level"));
	System.out.println("--------------------------------------------------------");
	for(Word2 w : mywords) {
		System.out.println(String.format("%-20s %-20s %10d", w.getEnglish(),w.getKorean(),w.getLevel()));
	}
	
	}
   
}



