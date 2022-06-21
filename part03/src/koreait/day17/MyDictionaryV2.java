package koreait.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import koreait.day16.Word;

public class MyDictionaryV2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); Scanner ssc = new Scanner(System.in); 
		List<Word> mywords = new ArrayList<>();	
//		read(mywords,"D:\\KSB\\�굹�쓽�쁺�븳�궗�쟾.txt");			//�뙆�씪�뿉�꽌 湲곗〈 �궡�슜 �씫�뼱�삤怨� 洹� �궡�슜�쓣 mywords 由ъ뒪�듃�뿉 ���옣
		try {
			System.out.println("�뙆�씪�쓣 �씫�뼱�삱源뚯슂 ? (y or n) >>> ");
			if(ssc.nextLine().equals("y"))
				//�뙆�씪�뿉�꽌 湲곗〈 �궡�슜 �씫�뼱�삤怨� 洹� �궡�슜�쓣 mywords 由ъ뒪�듃�뿉 ���옣
			read(mywords,"D:\\KSB\\�굹�쓽�쁺�븳�궗�쟾.txt");
			else
				System.out.println("�뙆�씪�쓣 �깉濡� 留뚮벊�땲�떎.");
		} catch (FileNotFoundException e1) {
			System.out.println("�뙆�씪 ���옣 以묒뿉 �삤瑜섍� �깮寃쇱뒿�땲�떎.-" + e1.getMessage());
		}
		
		String sel, eng, kor;
		int level;
		System.out.println("�꽑�깮 湲곕뒫 �윉�   1. �떒�뼱���옣     2. �떒�뼱寃��깋     3. �쟾泥대낫湲�   4.�젅踰⑤줈 寃��깋  5.�봽濡쒓렇�옩 �걹�궡湲�");
		boolean run = true;
		while (run) {		
			System.out.print("�꽑�깮 �쐪->");
			sel = sc.nextLine();
			switch (sel) {
			case "1":		
				System.out.print("English -> ");
				eng = sc.nextLine();  
				System.out.print("�븳湲� �쑜 -> ");
				kor = sc.nextLine();
				System.out.print("�젅踰� -> ");
				level = Integer.parseInt(sc.nextLine());
				Word temp = new Word(eng,kor);
				temp.setLevel(level);
				mywords.add(temp);		//���옣
				break;
			case "2":
				System.out.print("寃��깋 �떒�뼱 English -> ");
				eng = sc.nextLine();
				for(Word w : mywords)
					if(w.getEnglish().equals(eng))
						System.out.println("�떒�뼱�옣 寃��깋�뻽�뒿�땲�떎. 寃곌낵 =>" + w);
				break;
			case "3":
//				System.out.println("�떒�뼱�옣 �쟾泥대낫湲� :" + mywords);
				all(mywords);		//�젙�젹�븯怨� 異쒕젰�븯湲�
				break;
			case "4":
				System.out.print("寃��깋�븷 �젅踰� �엯�젰(1~3) -> ");
				int no = Integer.parseInt(sc.nextLine());
				level(mywords,no);
				break;
			case "5":
				run=false;	
				break;
			default:
				System.out.println("�윉곣�랅윐⑥옒紐� �엯�젰�맂 �꽑�깮�엯�땲�떎.1~4 �엯�젰�엯�땲�떎.");
				break;
			}
		}	//while end
		
		try {
			
			System.out.println("�뙆�씪�뿉 ���옣�븷源뚯슂 ? (y or n) >>> ");
			if(ssc.nextLine().equals("y"))
			
					//mywords 由ъ뒪�듃�쓽 �궡�슜�쓣 �뙆�씪�뿉 ���옣�븯湲�
			save(mywords,"D:\\KSB\\�굹�쓽�쁺�븳�궗�쟾.txt");
			else
				System.out.println("�뙆�씪�씠 ���옣�릺吏� �븡�븯�뒿�땲�떎.");
		} catch (FileNotFoundException e) {
			System.out.println("�뙆�씪 ���옣 以묒뿉 �삤瑜섍� �깮寃쇱뒿�땲�떎.-" + e.getMessage());
		}
		
		System.out.println("::::  �꼫�쓽 �떒�뼱�옣 醫낅즺�빀�땲�떎. ::::");
		
	}

	private static void save(List<Word> mywords, String filename) throws FileNotFoundException{
		//�뙆�씪�뿉 異쒕젰�븯湲�
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for(Word w : mywords)
			pw.println(w);
		
		pw.close();
		System.out.println("�뙆�씪 ���옣�씠 �셿猷뚮릺�뿀�뒿�땲�떎.");
	}

	private static void read(List<Word> mywords,String filename) throws FileNotFoundException{
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		StringTokenizer stk =null;
		while(sc.hasNext()) {
			String temp = sc.nextLine();
			System.out.println(temp.substring(0, temp.indexOf("(")));	//媛앹껜 留뚮뱾 �븣 �븘�슂�븳 媛믩쭔 媛��졇�삤湲� �뀒�뒪�듃
			//�쐞�쓽 寃곌낵瑜� 李멸퀬濡� StringTokenizer 濡� Word 媛앹껜 留뚮뱾怨� mywords 由ъ뒪�듃�뿉 異붽��븯湲�
				//?? 肄붾뵫 �셿�꽦�릺硫� 3踰� �쟾泥대낫湲곕줈 �떎�뻾�빐蹂댁꽭�슂.
			stk = new StringTokenizer(temp.substring(0, temp.indexOf("(")));
			while(stk.hasMoreTokens()) {
			//	mywords.add(new Word(stk.nextToken()),
			//						 stk.nextToken()),
				//		Integer.parseInt(stk.nextToken());	
			}
			
		
		
		}
		sc.close();
			System.out.println("�뙆�씪 �씫�뼱�삤湲� �셿猷뚮릺�뿀�뒿�땲�떎.");
	}
	
	

	private static void level(List<Word> mywords, int no) {
		for(Word w : mywords)
			if(w.getLevel()==no)
				System.out.println(w);
		
	}

	private static void all(List<Word> mywords) {   //mywords �쓽 李몄“媛� �쟾�떖諛쏆븘 �룞�씪�븳 媛앹껜瑜� 媛�由ы궢�땲�떎.
		mywords.sort(new Comparator<Word>() {
			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		
		System.out.println(String.format("%-20s %-20s\t %-10s", "English","Korean","Level"));
		System.out.println("----------------------------------------------------------------");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s\t %10d", w.getEnglish(),w.getKorean(),w.getLevel()));
		}
	}   
	
}

//�떆�뿕臾몄젣 16�씪李④퉴吏�
