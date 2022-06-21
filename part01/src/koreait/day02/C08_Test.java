package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {

		System.out.println("[[사각형 도형의 넓이를 구하시오]]");
		
	int width = 23 ;
	int height = 19 ;
	int box_area = width*height;
	
	
	System.out.println("가로 : " + width + "cm");
	System.out.println("가로" + height + "cm");
	System.out.println("넓이" + width*height + "㎤");
	
	System.out.println(width*height);
	 
	
	double half = 	23.23 ;				
	double round = 2 * 3.14*half; //둘레
	double circl_area = 3.14 * half * half; //넓이

	/*
	 * System.out.printf("반지름 : %.f cm\n", half);
	 * System.out.printf("둘레를 구했습니다 : %.3f㎝\n", round);
	 * System.out.printf("넓이를 구했습니다 : %.3f㎠\n" , circl_area);
	 */
	//final 테스트
	//  변수선언 앞에(최종의) 키워드를 붙이면 값을 변경하지 못합니다.
	
	final int test = 123;	//값을 변경 하지못합니다.
	
	 
	
	
	
	}
//㎠ ㎝
}


//㎤