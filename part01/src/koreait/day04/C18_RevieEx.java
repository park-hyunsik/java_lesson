package koreait.day04;

import java.util.Scanner;

public class C18_RevieEx {
		// 박현식 수강생
	public static void main(String[] args) {
		String best;	//특기과목명 참조할 변수
		
		Scanner sc = new Scanner(System.in);
		int kor,eng,sci;
		int max;
		
		System.out.println("kor값을 입력하세요. ->");
		kor = sc.nextInt();
		System.out.println("eng값을 입력하세요. ->");
		eng = sc.nextInt();
		System.out.println("sci값을 입력하세요. ->");
		sci = sc.nextInt();

		double avg = (double)(kor+eng+sci)/3;
		
		if(kor > eng) {
			max = kor;
			best = "국어";
		}else {
			max = eng;
			best = "영어";
		if(max < sci) {
			max = sci;
			best = "과학";
			
		}
		}
		System.out.printf("평균은 : %.2f\n", avg);
		System.out.println("과목수는 " + 3 + "입니다");
	}

}
