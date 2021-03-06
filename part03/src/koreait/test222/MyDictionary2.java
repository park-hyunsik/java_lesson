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
      System.out.println("์ ํ ๊ธฐ๋ฅ ๐   1. ๋จ์ด์ ์ฅ     2. ๋จ์ด๊ฒ์     3. ๋จ์ด์ฅ๋ณด๊ธฐ    4.ํ๋ก๊ทธ๋จ ๋๋ด๊ธฐ");
      boolean run = true;
      while (run) {     
         System.out.print("์ ํ โ->");
         sel = sc.nextLine();
         switch (sel) {
         case "1":      //switch๋ฌธ์์ case "๋ฌธ์์ด" ํ์ ๊ฐ๋ฅ.  if๋ฌธ์์๋ sel.equals("1") ๋ก ํด์ผํฉ๋๋ค.
            System.out.print("English -> ");
            eng = sc.nextLine();    //sc.nextInt();
            System.out.print("ํ๊ธ ๋ป -> ");
            kor = sc.nextLine();
            System.out.println("๋ ๋ฒจ-> ");
            level = Integer.parseInt(sc.nextLine());
            Word2 temp = new Word2(eng,kor);
            temp.setLevel(level);
            mywords.add(temp);
            
            break;
         case "2":
            System.out.print("๊ฒ์ ๋จ์ด English -> ");
            eng = sc.nextLine();
            for(Word2 w : mywords)
            	if(w.getEnglish().equals(eng))
            System.out.println("๋จ์ด์ฅ ๊ฒ์ํ์ต๋๋ค. ๊ฒฐ๊ณผ =>" +w);
            break;
         case "3":
            //System.out.println("๋จ์ด์ฅ ์ ์ฒด๋ณด๊ธฐ :" + mywords);
            all(mywords);     //์ ๋ ฌํ๊ณ  ์ถ๋ ฅํ๊ธฐ
        	 break;
         case "4":
            run=false;   
            break;
         default:
            System.out.println("๐โ๐จ์๋ชป ์๋ ฅ๋ ์ ํ์๋๋ค.1~4 ์๋ ฅ์๋๋ค.");
            break;
         }
      }   //while end
      System.out.println("::::  ๋์ ๋จ์ด์ฅ ์ข๋ฃํฉ๋๋ค. ::::");
      
   }   //์ฐธ๊ณ  : ์ ์ ๋ฐ์ดํฐ ์๋ ฅ์ ๋ฐ์์ผํ๋ค๋ฉด ๋ฌธ์์ด nextLine() ๋ฐ์์ ์ ์๋ก ๋ณํํฉ๋๋ค.  
      //   int score = Integer.parseInt(sc.nextLine());
      //   ์ด์ : nextInt()๋ ์ํฐ๋ฅผ ์ฒ๋ฆฌ ํ์ง ์์์ ๋ค์์ ๋์ค๋ nextLine()์๊ฒ ์ ๋ฌ๋์ด ์๋ ฅ ํ๋ฆ์ ๋ฐฉํด๊ฐ ๋ฉ๋๋ค.
      //    ๊ฒฐ๋ก  : ํ ์์ค ํ์ผ์์ nextInt() ๋ง ์ฌ์ฉ ๋๋ nextLine()๋ง ์ฌ์ฉํ๊ฑฐ๋ ํฉ๋๋ค.   

private static void all(List<Word2> mywords) {	//mywords ์ ์ฐธ์กฐ๊ฐ ์ ๋ฌ๋ฐ์ ๋์ผํ ๊ฐ์ฒด๋ฅผ ๊ฐ๋ฆฌํต๋๋ค.
		
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



