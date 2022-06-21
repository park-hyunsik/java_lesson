package koreait.day03;

import java.util.Scanner;

public class C15_CharacterIfTest {

	public static void main(String[] args) {  
		//문자를 분류합니다.(ascii코드 대문자,소문자,숫자,특수기호)

		int ch1;
		Scanner sc = new Scanner(System.in);
		System.out.print("알고싶은 아스키코드 정수값 입력하세요.(32부터 126) -> ");
		
		ch1 = sc.nextInt();
		char ch2 = (char)ch1;		//입력받은 정수값을 char 로 변환.
		
		
		//요구사항 : 정수값에 해당하는 문자와 문자 분류 결과 출력하기.
		if(ch2 >='A' && ch2 <='Z')  //'A' ~ 'Z' 범위 검사
			System.out.println("분류 : 대문자 , 입력한 아스키코드값 문자 : " + ch2);
		else if(ch2 >= 'a' && ch2 <='z')   // 'a' ~ 'z' 범위 검사
			System.out.println("분류 : 소문자 , 입력한 아스키코드값 문자 : " + ch2);
		//분류:특수기호 , 범위를 체크해보세요. (문자 또는 코드값) 코드값 32~47,58~64,91~96,123~126
		else if(ch2 >= '0' && ch2 <='9') //ch2>=32 && ch2 <=48 || ch2>=57 보다 문자로 비교가 가능한 연속된 범위
			System.out.println("분류 : 숫자, 입력한 아스키코드값 문자 : " + ch2);
		else if(ch2>=32 && ch2 <=48 || ch2>=57 && ch2 <=64 || ch2>=91 && ch2 <=96 || ch2>=123 && ch2 <=126)
			System.out.println("분류 : 기호 , 입력한 아스키코드값 문자 : " + ch2);
		else 
			System.out.println("분류 : 없음, 알수 없는 문자 :" + ch2);
		
		

		
		
		
		sc.close();
	}

}



//48~57

