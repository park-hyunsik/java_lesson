package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {


		
		int k=0, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n입력한정수를 모두 더하는 계산기 입니다.(종료:-1)");
		while(k!=-1) {
			System.out.print("정수입력>>>");
			k=sc.nextInt();
			if(k!=-1)
			sum +=k;
			
		}
		System.out.println("sum =" + sum);
		sum=0;
		k=0;
		System.out.println("\n\n입력한정수를 모두 더하는 계산기 입니다.[ver2.0](종료:-1)");
		do {
			sum+=k;
			System.out.print("정수입력>>>");
			k=sc.nextInt();
			
		}while(k!=-1);
		System.out.println("sum =" + sum);

		
		sum=0;
		System.out.println("\n\n입력한 정수를 모두 더하는계산기 입니다.[ver2.2](종료:-1)");
		
		while(true)	{
			System.out.print("정수입력>>>");
			k=sc.nextInt();
			
			if(k==-1)	break;	//항상 참일때, 탈출(종료) 조건과 break문 사용합니다.
			sum+=k;
			
			
		}
		System.out.println("sum =" + sum);

		sum=0;
		System.out.println("\n\n입력한 정수를 모두 더하는계산기 입니다.[ver2.3](종료:-1)");
		boolean isState =true;
		while(isState) {
			System.out.print("정수입력>>>");
			k=sc.nextInt();
			
			if(k==-1)	isState=false;
			else sum+=k;
			
		}
		System.out.println("sum =" + sum);
		//continueㅇ 연습 : 입력된 값이 10의 배수이면 sum 에 더하지 않는다.

		sum=0;
		System.out.println("\n\n입력한 정수를 모두 더하는계산기 입니다.[ver2.3](종료:-1)");
		while(true) {
			System.out.println("정수입력>>>");
			k=sc.nextInt();
			if(k==-1) break;
			if(k%10==0) continue;	//아래 명령어 실행하지 않고 다시 반복 처음으로
			sum+=k;
			
		}
		
		
		System.out.println("sum =" + sum);
		sc.close();
	}
	
	
	
	
	
	
	
	
	
}


/*	for(int i=0;i<5;i++)
System.out.println("hello!("+(i+1)+")");

//while문 형식
//loop counter 변수 선언
int j=0;
while(j<5)	{
System.out.println("hello!("+(j+1)+")");
j++;

}
*/