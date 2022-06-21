package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx {

	
	
	
	// 박현식 수강생  //
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        int max;

        System.out.println("정수3개를입력하시오");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        
        if(n1 >= n2 && n1 >= n3) {
        	max = n1;
        } else if (n2 >= n1 && n2 >= n3) {
        	max = n2;
        } else {
        	max = n3;
        }
        System.out.println("가장큰수는" + max + "입니다!");

	}
}
