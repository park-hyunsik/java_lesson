package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;
//������
public class parkhyunsik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg;
		int number;
		int[] nums = new int[5];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("����� ���� �Է��ϼ���. >> ");
			number = sc.nextInt();
			nums[i] = number;
			sum += nums[i];
		}
		avg = (double)sum / nums.length;
		System.out.println(Arrays.toString(nums));
		System.out.println("�Է��� ����� �� : " + sum);
		System.out.println("�Է��� ����� ��� : " + avg);
		System.out.println();

		System.out.println("���� max : " + maxOfArray(nums));
		System.out.println("���� min : " + maxOfArray(nums));
		
		sc.close();
	}

public static int maxOfArray(int[] array) {
	int max=array[0];	//1.
	for(int i=1;i<array.length;i++) {	//2.
		if(max < array[i])	//�񱳰��� max ���� ũ�ٸ�
			max = array[i];
	}
	//����: ����� main ���� �����ų�� ���ϴ� �������� �ϵ��� �մϴ�.
	return max;	//4.
}


}
