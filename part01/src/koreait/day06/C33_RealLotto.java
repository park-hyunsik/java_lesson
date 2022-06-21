package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
//작성자 : 박현식
	public static void main(String[] args) {
/*
 * 배열 : 배열전체
 * 배열 요소 : 배열의 각각의 값
 * 
 */
		
		int[] numbers = new int[45];//뽑힐 공에 해당되는 배열
		Random r = new Random();	//랜덤 객체 r 생성
		int[] lotto = new int[6];	//선택된 6개의 값(로또 버놓) 저장하는 배열
		
		//처음 상태 : 값을 인덱스+1 -> 인덱스 난수를 뽑고 해당값을 삭제하면 이 규칙은 적용이 안됩니다.
		for(int i=0;i<45;i++) {	//인덱스 범위 : 0 ~ 44 -> 난수로 뽑히는 값
			numbers[i]=i+1;		//값 범위 : 1~45 -> lotto배열에 저장되는 값
		}

		System.out.println("numbers 배열 초기값 -----------");
		System.out.println(Arrays.toString(numbers));//로또 번호가 될 수 있는 번호 나열
		System.out.println("---------------------------");
		

		int k;	//뽑힐 값의 인덱스 - 난수로 정합니다.
		for(int cnt=0;cnt<6;cnt++) {	//로또 번호 6개를 구하기 위한 for문
			
			k=r.nextInt(45-cnt);
			//cnt=0,1,2,3,4,5 에 대해 난수의 bound 값은 45,44,43,42,41,40 -> 중복방지(확률적인 범위를 줄이기)
			//k의 난수범위? 0~44 , 0~43, 0~42, 0~41 ,  0~40 , 0~39
			
			System.out.println("k="+k +",nuber =" + numbers[k]);	//뽑힌 숫자의 인덱스와 그 숫자의 값
			
			lotto[cnt]=numbers[k];	//numbers배열에서 난수로 뽑힌 인덱스 k의 값이 
			
			//k위치의 값을 제거(삭제) : 인덱스 k+1 부터 마지막요소까지 왼쪽으로 이동
			for(int i=k;i<numbers.length-1;i++) {//선택된 로또 번호를 제외 -> 중복방지
				numbers[i]=numbers[i+1];
			}
			System.out.println(Arrays.toString(numbers));//선택된 로또 번호 외 남은 숫자 알림
		}
		System.out.print("최종 선택 숫자 : ");
		System.out.println(Arrays.toString(lotto));//최종 선택된 숫자 출력
		
		Arrays.sort(lotto);	//lotto 배열값의 크기 순서대로 위치를 변경합니다.
		System.out.println(Arrays.toString(lotto));	//오름차순으로 출력
		
		
		
		
		
		
		
		
		
		
	}

}
