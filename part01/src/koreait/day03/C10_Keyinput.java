package koreait.day03;

import java.util.Scanner;

public class C10_Keyinput {
//sc�� �������Դϴ�. �⺻�� ������ �ƴ� Ŭ���� Ÿ���� �����Դϴ�. _> ������ ����
	//�� new �������� ����� ��ü�� Ŭ���� �̸��� ���� �̸����� ���� ���� �մϴ�.
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//Ű���� �Է��� ���� ���� ����. -ǥ���Է� Scanner ��ü�� ����� ���� sc�� �����մϴ�.
			int data;

			System.out.println("������ �Է��ϼ���. ->");
			
			data = sc.nextInt();
			
			//����ڰ� ���ڸ� �Է����� �ʾ������� ������ ��ȯ���� ���ϰ� ���� �߻���ŵ�ϴ�.
			
			System.out.println("�ԷµȰ���" + data + "�Դϴ�.");
			
		double point;
		System.out.println("�Ǽ������Է��ϼ���.->");
		
		point = sc.nextDouble();
		System.out.println("�Էµ� ���� " + point + "�Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		/*
		 * 	ǥ�� ��� : System.out
		 *  ǥ�� �Է� : System.in     -> Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ���Ѵ� ��� ���.
		 * 						   -> �⺻ ��Ű���� Ŭ������  �ƴϹǷ� import �� �ʿ��մϴ�.	
		 *  
		 */

		
		
		
	}

}
