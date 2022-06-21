package koreait.day05;

import java.lang.reflect.Array;
import java.util.Scanner;

// 박현식
public class C28_IntArray {
	
	/*
	 * 1. int 배열크기 5를 선언하세요. 이름은 nums
	 * 2. 배열 요소의값은 사용자 입력으로 저장합니다.
	 * 3. 입력된 값의 합계, 평균을 구합니다. ->합계는 2번에서 입력받는 for문 안에서 수식작성하세요.
	 * 4. 입력된 값의 최대값, 최소값을 구하는 메소드를 만듭니다.
	 * 			ㄴmaxOfArray , minOfArray : 인자는 int 배열 , 반환값형식 int
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int[] nums = new int[5];
		
		for(int i=0; i<nums.length; i++) {
			System.out.println("5개의 값을 입력하세요.");
			nums[i]=sc.nextInt();
			sum=sum+nums[i];
		}
		System.out.println("합계 :" + (sum));
		System.out.println("평균 : " + (sum/nums.length));
		
		int max = maxOfArray(nums);
		
		for(int i=1; i<nums.length; i++) {
			if(max < nums[i]) max = nums[i]; 
		}
		System.out.println("최댓값 : " + max);
		
		// 최솟값 구하기
		int min = nums[0];
		for(int i=1; i<nums.length; i++) { 
			if(min > nums[i]) min = nums[i]; 
		}
		System.out.println("최솟값 : " + min);
		
		System.out.println("최종 max : " + maxOfArray(nums));
		System.out.println("최종 min : " + maxOfArray(nums));
		
		
	}
	//1.max,min 변수를 배열의 0번 요소값으로 초기화 합니다.
	//2. 배열요소 1번부터 마지막요소까지 max,min과 순서대로 비교해서 
	//3. max가 그값보다 작으면(min이 그값보다 크면) max(min)값을 배열요소값으로 변경합니다.
	//4. -> 비교가 끝나면 최종 max,min 결정
	
	public static int maxOfArray(int[] array) {
		int max=array[0];	//1.
		for(int i=1;i<array.length;i++) {	//2.
			if(max < array[i])	//비교값이 max 보다 크다면
				max = array[i];
		}
		//권장: 출력은 main 에서 실행시킬때 원하는 형식으로 하도록 합니다.
		return max;	//4.
	}
	

}
