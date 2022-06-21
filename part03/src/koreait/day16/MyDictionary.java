package koreait.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
// �ۼ��� : ������
public class MyDictionary {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();	// ***mydic�� mywords�� �ٲ㼭 �����غ���***
		System.out.println("1.�ܾ�����    2. �ܾ�˻�    3. ��ü����    4. �����ΰ˻�  5.����");
		String select;
		String eng,kor;
		int level;
		
		boolean run = true;
		
		
		while(run) {
			System.out.print("���� -> ");
			select = sc.nextLine();
			switch (select) {
				case "1":
					System.out.print("English -> ");
					eng = sc.nextLine();
					System.out.print("Korean -> ");
					kor = sc.nextLine();
					System.out.print("���� -> ");
					Word temp = new Word(eng, kor);
					level = Integer.parseInt(sc.nextLine());
					temp.setLevel(level);
					mywords.add(temp);
					continue;
				case "2":
					System.out.print("�˻� �ܾ� English -> ");
					eng = sc.nextLine();
					for(Word w : mywords)
						if(w.getEnglish().equals(eng))
							System.out.println("�ܾ��� �˻��߽��ϴ�. ��� => " + w);
					break;
				case "3":
//					System.out.println("�ܾ��� ��ü���� : " + mywords);
					all(mywords);
					continue;
				case "4":
					System.out.print("�˻��� ���� �Է�(1~3) -> ");
					int no = Integer.parseInt(sc.nextLine());
					level(mywords,no);
					break;
					
				case "5":
					run = false;
					break;
				default:
					System.out.println("���ڸ� �߸� �Է��߽��ϴ�. 1~4�� �ٽ� ����");
					continue;
			}
		}
		System.out.println("�ܾ����� �����մϴ�.");
		
	}

	private static void level(List<Word> mywords, int no) {
			for(Word w : mywords)
				if(w.getLevel()==no)
					System.out.println(w);
		
	}

	private static void all(List<Word> mywords) {	// mywords�� ������ ���޹޾� ������ ��ü�� ����ŵ�ϴ�.
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
