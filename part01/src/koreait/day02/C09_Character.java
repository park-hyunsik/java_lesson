package koreait.day02;

public class C09_Character {

	public static void main(String[] args) {

		char c1 = 'a';
		char c2 = 97;		//문자코드는 정수값.

		
		//둘다 'a' 출력
		System.out.println("c1 =" + c1);
		System.out.println("c2 =" + c2);
		
		//문자코드 정수값 출력은? -> int로 캐스팅 필요 : 둘다 97출력
		System.out.printf("c1= %d\n",(int)c1); //오류 : char 형은 %d로 출력할수없다
		System.out.printf("c2= %d\n",(int)c2);

		c1 = (char)(c1 +1); //던셈 연산 가능. 연산결과 대입할때는 casting 필요.
		System.out.println("c1 =" + c1);
		
		c1++; 		//++ 연산은 c1 = c1+1 , char형에서는 casting 이필요없습니다. 
		System.out.println("c1 =" + c1);
		
		//한글문자테스트 : 한글문자코드는 10진수 값을 44032 ~ 55203 , 16진수 (2진수) ac00~d7a3
		char h1 ='가';
		char h2 = 44032; //
		char h3 ='\uac00';	// \\u는 16진수유니코드, ac00은 16진수값
		
		System.out.println("h1 = " + h1);
		System.out.println("h2 = " + h2);
		System.out.println("h3 = " + h3);
		
		System.out.printf("h1 = %d\n",(int)h1);
		System.out.printf("h2 = %d\n",(int)h2);
		System.out.printf("h3 = %d\n",(int)h3);
		
		h1++;
		System.out.println("h1 = " + h1);
		
		h1++;
		System.out.println("h1 = " + h1);
		
		//한글의 마지막 문자
		char h4 = 55203;  //10진수표현
		char h5 = '\ud7a3';//16진수표현, 힣
		System.out.println("h4 = " + h4);
		System.out.println("h5 = " + h5);
		
		h4++;
		System.out.println("h4="+h4);
		
		h5--;
		System.out.println("h5 = " + h5);
		System.out.println('H'+'e'+'l'+'l'+'o');
		
		//char이 모여서 한줄로 나란히 나열하면 -> 문자열이 됩니다. "Hello" 
		
		
		
	}

}




/*
 *	기본형식 데이터 : 문자형 char 
 * 		문자데이터를 저장하는 2바이트 형식. 정수값 0 ~ 65535 범위 저장도 가능합니다.
 * 		컴퓨터에서 다루는 문자는 문자코드로 처리되는데 코드는 정수값입니다.
 * 		문제데이터는 '' 기호를 사용합니다.(''안에는 문자1개만)
 * 		
 * 		영문자,숫자,특수문자는 ASCII 코드로 표현됩니다.
 * 		영문자,숫자,특수문자 외의 다국어문자를 처리하는 인코딩 방식에 따라
 * 		문자코드값이 다릅니다. 국제화 인코딩으로 utf-8 방식을 많이 사용합니다.
 * 		
 * 
 * 		간 : ㄱ ㄴ ㄴ (초성,중성,종성 각각에 코드값으로 조합하는 조합형)
 * 		한글에서 나올수 있는 모든 초성/중성/종성의 모든 표현을 만들어서 각각 코드값을 부여하는 완성형
 * 
 * 
 *  */
