package koreait.day12;

import java.util.Random;
import java.util.Scanner;

//C42번을 MathProblem 클래스를 사용하는 것으로 바꾸기 : 연산은 덧셈.
public class C43_RedPenExam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size=5; 	//문제 갯수
//		int max_size = MathProblem.max_size;	//size변수값이 max_size 초과하는지 검사 추가.
		
		MathProblem[] problems = new MathProblem[size];
		//모든 문제 저장하는 배열
		//배열의 타입은 MathProblem 객체참조형 : n1,n2,op,isCorrect
		
		int ans;		
		int cnt=0;
		System.out.println("----------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("----------------------------------------------");
		System.out.println("시작합니다.");
		for(int i=0;i<size;i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();		//n1,n2값이 객체의 필드로 난수생성.
			
//			System.out.print("문제 "+(i+1)+".  " +temp.getN1() +"+ "+ temp.getN2()+" =  답 입력 -> ");
			System.out.print("문제 "+(i+1)+".  " + temp.problem() + " 답 입력 -> ");		
			ans = sc.nextInt();
			
			if(ans == temp.showAnswer() ) {   //정답과 비교. 맞은 갯수 count
				cnt++;		
				temp.setCorrect(true);
			}  
			problems[i]=temp;
		}
		System.out.println("----------------------------------------------");
		System.out.println("채점 합니다. 맞은 갯수  "+ cnt + " ( " + (cnt*100/size) +" 점)"); // 100/size 는 1문제당 점수
		System.out.println("::::: 틀린 문제 정답 보기 :::::");
		//아래코드는 형식일뿐 전체적으로 수정될 내용 많습니다.-> problems 배열을 활용하고 isCorrect 필드를 설정하세요.

		for(int i=0;i<problems.length;i++)
//			if(problems[i].isCorrect()==false) //틀렸을 때 
			if(!problems[i].isCorrect()) //problems[i].isCorrect()이  거짓이면 !연산으로 참으로 바뀝니다.
				System.out.println("문제 "+(i+1)+".  " 
						+ problems[i].problem() + problems[i].showAnswer());	

		//for each로 변경하기 : 문제 "+(i+1)는 출력안합니다.
/*
		for(MathProblem temp : problems)
			if(!temp.isCorrect()) //problems[i].isCorrect()이  거짓이면 !연산으로 참으로 바뀝니다.
				System.out.println(temp.problem() + temp.showAnswer());	
*/		
		
		sc.close();
	}
// 추가 : 사용자 입력한 ans를 저장해서 오답 출력시 같이 보여주고 싶다면?
}
