package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;
//박현식
public class parkhyunsik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg;
		int number;
		int[] nums = new int[5];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("요소의 값을 입력하세요. >> ");
			number = sc.nextInt();
			nums[i] = number;
			sum += nums[i];
		}
		avg = (double)sum / nums.length;
		System.out.println(Arrays.toString(nums));
		System.out.println("입력한 요소의 합 : " + sum);
		System.out.println("입력한 요소의 평균 : " + avg);
		System.out.println();

		System.out.println("최종 max : " + maxOfArray(nums));
		System.out.println("최종 min : " + maxOfArray(nums));
		
		sc.close();
	}

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
