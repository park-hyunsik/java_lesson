package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {

	public static void main(String[] args) {
		boolean result;
		
		result = 10 > 5;
		System.out.println("10>5결과"+result);
		System.out.println("9 !=9결과 : " + (9!=9));
		System.out.println("9 == 9 : " + (9==9));
		
		int korean, math; //국어점수, 수학점수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 -> ");
		korean = sc.nextInt();
		
		System.out.println("수학 점수 입력 -> ");
		math = sc.nextInt();
		
		
			// 국어점수와 수학점수 모두 80점 이상인가? -> 모범학생
		System.out.println("모범학생?"+(korean>=80 && math>=80));
			// 국어점수 또는 수학점수 중 90점 이상이 있는가? -> 특기학생
		System.out.println("특기학생?"+(korean>=90 || math>=90));
		//국어점수가 20~80 이 아닌 학생들은? -> 표준편차가 큰학생
		System.out.println("표준편차가큰학생"+!(korean>=20 && korean<=80));
				//korean 값 15, 89은 결과 참
				// 값 56,78은 결과 거짓
		//!(korean>=20 && korean<=80)과 같은 조건식은 korean<20||korean>80
		

		

		
		
	}

}


/*
 * 데이터의 기본 형식 : boolean 은 true 또는 false 값을 갖는 형식. (Boolean 래퍼클래스 있습니다.)
 * 관계연산 ==(동등,같다.) , !=(같지않다.) , > < , >= , <= 이 연산의 결과값은 boolean 형식
 * 논리연산 &&(그리고)
 * 
 * 
 */



/*
 * System.out.println("논리연산 결과 확인하기 : and");
 * System.out.println(" true and true = " + (true && true));
 * System.out.println(" true and false = " + (true && false)); //아래의 2개 논리식은
 * 첫번쨰값이 false 이므로 두번째 값은 don't care false
 * System.out.println(" false and true = " + (false && true));
 * System.out.println(" false and false = " + (false && false));
 * 
 * System.out.println("논리연산 결과 확인하기 : or"); //아래의 2개 논리식은 첫번쨰값이 false 이므로 두번째 값은
 * don't care true System.out.println(" true or true = " + (true || true));
 * 
 * System.out.println(" true or false = " + (true || false));
 * System.out.println(" false or true = " + (false || true));
 * System.out.println(" false or false = " + (false || false));
 * 
 * System.out.println(" true or true = " + !true);
 * System.out.println(" true or false = " + !false);
 */

