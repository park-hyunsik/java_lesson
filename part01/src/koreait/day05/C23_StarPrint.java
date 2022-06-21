package koreait.day05;

import java.util.Scanner;

public class C23_StarPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[[영화감상 후기]]");
		System.out.printf("평점을 몇 점 주시겠습니까? (1~5) >>> ");
		int count = sc.nextInt();
		
		System.out.println("방법1");
		for(int i=0;i<count; i++) {
		System.out.println("★");
		}
		
		System.out.println("\n\n방법2");	{
		for(int i=0;i<count;i++)
			System.out.println("★");
		for(int i=0;i<5-count;i++)
		System.out.println("☆");		//출력횟수는 5-count
		}
	
		System.out.println("\n\n방법2_");
		
		for(int i=0;i<5;i++)
			if(i<count)
				System.out.print("★");
			else
				System.out.print("☆");
		
		
		System.out.println("\n\n방법2__");
		int k;	//loop counter 변수가 main메소드의 지역변수
		for(k=0;k<count;k++)	//count=3
			System.out.print("★");
		
		System.out.println("k="+k);	//k=3 , 위의 for 문이 종료ㄷ가 되는 k값
		for(;k<5;k++)				//k의 값은 얼마부터 시작한느 걸까요. k는 count 부터
			System.out.print("☆");
		
		
	}

}
