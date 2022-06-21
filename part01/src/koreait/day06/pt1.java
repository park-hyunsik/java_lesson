package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class pt1 {

	public static void main(String[] args) {

		int lottoNum[] = new int[6];	//랜덤 숫자들을 담을 배열
		Random r = new Random();		//랜덤 객체 r 생성
		
		
		//배열에 추가 및 중복 제거
		for(int i=0;i<6;i++) {
			//r.nextInt(45) : 45를 upperBound로 한 랜덤 정수 추출 + 1 : 1 ~ 45
			lottoNum[i] = r.nextInt(45) + 1;
		
			//중복제거 : 현제 index (i) 와 (0 ~ i-1) 비교하여 중복된 숫자가 존재하면 i--
			for(int j=0;j<i;j++) {			
				if(lottoNum[i] == lottoNum[j])
					i--;				
			}
		}
			
		//정렬
		Arrays.sort(lottoNum);
		
		//배열 내의 랜덤 번호 출력
		for(int i=0;i<6;i++)
			System.out.print(lottoNum[i] + " ");
	}
}