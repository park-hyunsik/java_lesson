package koreait.day04;

import java.util.Scanner;

public class C18_RevieEx {
		// ������ ������
	public static void main(String[] args) {
		String best;	//Ư������ ������ ����
		
		Scanner sc = new Scanner(System.in);
		int kor,eng,sci;
		int max;
		
		System.out.println("kor���� �Է��ϼ���. ->");
		kor = sc.nextInt();
		System.out.println("eng���� �Է��ϼ���. ->");
		eng = sc.nextInt();
		System.out.println("sci���� �Է��ϼ���. ->");
		sci = sc.nextInt();

		double avg = (double)(kor+eng+sci)/3;
		
		if(kor > eng) {
			max = kor;
			best = "����";
		}else {
			max = eng;
			best = "����";
		if(max < sci) {
			max = sci;
			best = "����";
			
		}
		}
		System.out.printf("����� : %.2f\n", avg);
		System.out.println("������� " + 3 + "�Դϴ�");
	}

}
