package koreait.day15;

import java.util.Scanner;


//Throwable 클래스의 하위클래스
//: Error -> 시스템상의 오류
//: Exception 					
public class C62_ExceptionTest {

	public static void main(String[] args) {
		String message = null;
		char temp = message.charAt(0);     //message 문자열에서 첫번째(0) 글자 1개 가져옵니다.
	//Exception 예시3 : java.util.InputMismatchException
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 입력 >>> ");
	//int a = sc.nextInt();			//키보드입력을 정수로 변환해서 변수에 저장합니다.	
	
	int a = Integer.parseInt(sc.nextLine());
	//숫자 외에 다른 문자 입력하면 Exception 발생	-> java.lang.NumberFormatException 			
	// 실수도 .이 포함되기에 Exception 발생
	
	System.out.println("당신이 입력한 값 : " + a);
		//Exception 예시2 : java.lang.ArrayIndexOutOfBoundsException 
				int[] nums = new int[5];		//배열선언 : 요소 5개입니다.
				nums[5] =100;
				
//Exception 예시1 : java.lang.NullPointerException	(객체 참조가 null 이면 메소드 실행못합니다.)
		
	

		
	

		
	}

}
/*
 * 문법 오류 : //int a = 4.1; 와 같이 컴파일 자체가 안됩니다.
Exception 요약 : 문법오류가 아닙니다. 실행하면서 발생하는 오류 입니다.(발생가능성을 고려해서 프로그래밍해야합니다.)
     -> 원인에 따라 다른이름 XXXXException 이 발생하고 이들은 Exception 클래스의 자식 클래스입니다.(상속관계)
     -> Exception 이 실행 중에 발생하면 그 이후는?..... 프로그램이 그 시점부터 중단됩니다. 
         따라서, Exception 을 예상하고 프로그램이 중단되지 않도록 프로그램 구현을 해야합니다.
*/
