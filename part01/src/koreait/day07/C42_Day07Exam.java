package koreait.day07;

import java.util.Random;
import java.util.Scanner;
// 작성자 : 박현식
public class C42_Day07Exam {
	public static void main(String[] args) {
		//출력
		System.out.println("----------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기  ");
		System.out.println("----------------------");
		System.out.println("시작합니다.");
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] n1 = new int[3];
		int[] n2 = new int[3];
		int[] iSum = new int[3]; 
		int[] rSum = new int[3]; 
		int cnt = 0;
		int i;
		
		for(i = 0; i < 3; i++) { //두 a, b 값을 난수로 받는다.//조건이 참일 경우 for문 내부 실행
			n1[i] = r.nextInt(100); //100까지 랜덤범위 지정
			n2[i] = r.nextInt(100);
		}
		
		for(i = 0; i < 3; i++) { //두 a, b의 실제 합을 저장.
			rSum[i] = n1[i] + n2[i];
		}
		
		for(i = 0; i < 3; i++) { //두 a, b의 합을 입력받는다.
			System.out.printf("문제%d.  %d + %d = ", i + 1, n1[i], n2[i]);
			System.out.println();
			iSum[i] = sc.nextInt();
		}
		
		for(i = 0; i<3 ;i++) { 
			if(rSum[i] == iSum[i]) {//rSu
				cnt++;
			}
		}
		System.out.printf("채점합니다. 맞은 개수 %d ( %d점 )\n", cnt, cnt * 10);//정답,10*점수
		System.out.println("-----틀린문제 정답보기------");
		
		for(i = 0; i < 3; i++) {
			if(rSum[i] != iSum[i]) {
				System.out.printf("문제%d. %d + %d = %d\n", i + 1, n1[i], n2[i], rSum[i]);
			}
		sc.close();
			}
		}
	}