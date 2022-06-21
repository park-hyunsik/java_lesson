package koreait.day12;

import java.util.Random;
import java.util.Scanner;

//C42���� MathProblem Ŭ������ ����ϴ� ������ �ٲٱ� : ������ ����.
public class C43_RedPenExam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size=5; 	//���� ����
//		int max_size = MathProblem.max_size;	//size�������� max_size �ʰ��ϴ��� �˻� �߰�.
		
		MathProblem[] problems = new MathProblem[size];
		//��� ���� �����ϴ� �迭
		//�迭�� Ÿ���� MathProblem ��ü������ : n1,n2,op,isCorrect
		
		int ans;		
		int cnt=0;
		System.out.println("----------------------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("----------------------------------------------");
		System.out.println("�����մϴ�.");
		for(int i=0;i<size;i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();		//n1,n2���� ��ü�� �ʵ�� ��������.
			
//			System.out.print("���� "+(i+1)+".  " +temp.getN1() +"+ "+ temp.getN2()+" =  �� �Է� -> ");
			System.out.print("���� "+(i+1)+".  " + temp.problem() + " �� �Է� -> ");		
			ans = sc.nextInt();
			
			if(ans == temp.showAnswer() ) {   //����� ��. ���� ���� count
				cnt++;		
				temp.setCorrect(true);
			}  
			problems[i]=temp;
		}
		System.out.println("----------------------------------------------");
		System.out.println("ä�� �մϴ�. ���� ����  "+ cnt + " ( " + (cnt*100/size) +" ��)"); // 100/size �� 1������ ����
		System.out.println("::::: Ʋ�� ���� ���� ���� :::::");
		//�Ʒ��ڵ�� �����ϻ� ��ü������ ������ ���� �����ϴ�.-> problems �迭�� Ȱ���ϰ� isCorrect �ʵ带 �����ϼ���.

		for(int i=0;i<problems.length;i++)
//			if(problems[i].isCorrect()==false) //Ʋ���� �� 
			if(!problems[i].isCorrect()) //problems[i].isCorrect()��  �����̸� !�������� ������ �ٲ�ϴ�.
				System.out.println("���� "+(i+1)+".  " 
						+ problems[i].problem() + problems[i].showAnswer());	

		//for each�� �����ϱ� : ���� "+(i+1)�� ��¾��մϴ�.
/*
		for(MathProblem temp : problems)
			if(!temp.isCorrect()) //problems[i].isCorrect()��  �����̸� !�������� ������ �ٲ�ϴ�.
				System.out.println(temp.problem() + temp.showAnswer());	
*/		
		
		sc.close();
	}
// �߰� : ����� �Է��� ans�� �����ؼ� ���� ��½� ���� �����ְ� �ʹٸ�?
}
