package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C42_RedPenExam {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size=5;	//문제의 갯수
		int[] x1 = new int[size];	//모든문제 피연산자1을 저장할 배열
		int[] x2 = new int[size]; 	//모든문제 피연산자2을 저장할 배열
		int[] answer = new int[size];;	//사용자가 입력한 답을 저장할 배열
		int cnt=0;
		System.out.println("------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("------------");
		System.out.println("시작합니다.");
		for(int i=0;i<x1.length;i++) {
			x1[i] = r.nextInt(89)+11;
			x2[i] = r.nextInt(89)+11;
			System.out.print(String.format("문제%2d. %d +%d = 답 입력 -> ",
											i+1, x1[i],x2[i]));
			answer[i] = sc.nextInt();
			if(answer[i] == x1[i]+x2[i]){
				cnt++;	//맞은 갯수 카운트
			}
		}
		System.out.println("---------");
		System.out.println("채점 합니다. 맞은 갯수 "+ cnt + " ( " + cnt*100/size +" 점 )");
		System.out.println("-----틀린문제 정답 보기----");
		for(int i=0;i<x1.length;i++)
			if(answer[i] != x1[i]+x2[i])
				System.out.println(String.format("문제%2d. %d +%d = %3d,", i+1,x1[i],x2[i],x1[i]+x2[i]));
		sc.close();
	}

}
//발전방향 : 클래스 정의해서 활용하기 