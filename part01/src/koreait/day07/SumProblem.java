package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class SumProblem {

	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기  ");
		System.out.println("-------------------------");
		System.out.println("시작합니다.");
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[10];
		int[] iSum = new int[10]; //input sum
		int[] rSum = new int[10]; //real sum
		int cnt = 0;
		int i;
		
		for(i = 0; i < 10; i++) { //두 a, b 값을 난수로 받는다.
			a[i] = r.nextInt(100);
			b[i] = r.nextInt(100);
		}
		
		for(i = 0; i < 10; i++) { //두 a, b의 실제 합을 저장한다.
			rSum[i] = a[i] + b[i];
		}
		
		for(i = 0; i < 10; i++) { //두 a, b의 합을 입력받는다.
			System.out.printf("문제%d.  %d + %d = ", i + 1, a[i], b[i]);
			iSum[i] = sc.nextInt();
			System.out.println();
		}
		
		System.out.println("-------------------------");
		
		for(i = 0; i < 10; i++) {
			if(rSum[i] == iSum[i]) {	
				cnt++;
			}
		}
		
		System.out.printf("채점합니다. 맞은 개수 %d ( %d점 )\n", cnt, cnt * 10);
		System.out.println(":::::::틀린문제 정답보기:::::::");
		
		for(i = 0; i < 10; i++) {
			if(rSum[i] != iSum[i]) {
				System.out.printf("문제%d.  %d + %d = %d\n", i + 1, a[i], b[i], rSum[i]);
				
			}
		}
		
		sc.close();
		

	}

}
