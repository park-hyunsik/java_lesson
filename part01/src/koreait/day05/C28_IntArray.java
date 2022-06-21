package koreait.day05;

import java.lang.reflect.Array;
import java.util.Scanner;

// ������
public class C28_IntArray {
	
	/*
	 * 1. int �迭ũ�� 5�� �����ϼ���. �̸��� nums
	 * 2. �迭 ����ǰ��� ����� �Է����� �����մϴ�.
	 * 3. �Էµ� ���� �հ�, ����� ���մϴ�. ->�հ�� 2������ �Է¹޴� for�� �ȿ��� �����ۼ��ϼ���.
	 * 4. �Էµ� ���� �ִ밪, �ּҰ��� ���ϴ� �޼ҵ带 ����ϴ�.
	 * 			��maxOfArray , minOfArray : ���ڴ� int �迭 , ��ȯ������ int
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int[] nums = new int[5];
		
		for(int i=0; i<nums.length; i++) {
			System.out.println("5���� ���� �Է��ϼ���.");
			nums[i]=sc.nextInt();
			sum=sum+nums[i];
		}
		System.out.println("�հ� :" + (sum));
		System.out.println("��� : " + (sum/nums.length));
		
		int max = maxOfArray(nums);
		
		for(int i=1; i<nums.length; i++) {
			if(max < nums[i]) max = nums[i]; 
		}
		System.out.println("�ִ� : " + max);
		
		// �ּڰ� ���ϱ�
		int min = nums[0];
		for(int i=1; i<nums.length; i++) { 
			if(min > nums[i]) min = nums[i]; 
		}
		System.out.println("�ּڰ� : " + min);
		
		System.out.println("���� max : " + maxOfArray(nums));
		System.out.println("���� min : " + maxOfArray(nums));
		
		
	}
	//1.max,min ������ �迭�� 0�� ��Ұ����� �ʱ�ȭ �մϴ�.
	//2. �迭��� 1������ ��������ұ��� max,min�� ������� ���ؼ� 
	//3. max�� �װ����� ������(min�� �װ����� ũ��) max(min)���� �迭��Ұ����� �����մϴ�.
	//4. -> �񱳰� ������ ���� max,min ����
	
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
