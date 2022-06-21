package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//C43번 예제 리스트로 변경하기	//작성자 : 박현식
public class C48_MathList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		ArrayList<MathProblem> problems = new ArrayList<>();
		int size=5;	//문제 갯수(반복횟수)
		int ans=0;	
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
			//problems[i]=temp;
			problems.add(temp);
			}
		System.out.println("----------------------------------------------");
		System.out.println("채점 합니다. 맞은 갯수  "+ cnt + " ( " + (cnt*100/size) +" 점)"); // 100/size 는 1문제당 점수
		System.out.println("::::: 틀린 문제 정답 보기 :::::");

		for(int i=0;i<problems.size();i++) {
			if(!problems.get(i).isCorrect()) {
				System.out.println("문제 "+(i+1)+".  " + problems.get(i).problem() + problems.get(i).showAnswer());	
			}
		}
		
		sc.close();
	}
}


