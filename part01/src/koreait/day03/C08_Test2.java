package koreait.day03;

import java.util.Scanner;

public class C08_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int width ; // 사용자가 입력할 값
	int height; // 사용자가 입력할 값
	int box_area;
	double half;
	final double PI = 3.14;
	//?
	System.out.println("[[사각형 도형의 넓이를 구하시오]]");
	System.out.println("사각형 너비 입력 ->");
	width = sc.nextInt();
	System.out.println("사각형 높이 입력->");
	height = sc.nextInt();
	
	box_area = width*height;
		
	System.out.println("처리결과입니다");
	System.out.println("가로:"+width+"㎝");
	System.out.println("세로:"+height+"㎝");
	System.out.println("넓이를 구했습니다:"+box_area+"㎠");
		


	sc.close();	

	
	

	
	

	}

}


//㎠ ㎝