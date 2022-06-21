package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class SumProblem {

	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��  ");
		System.out.println("-------------------------");
		System.out.println("�����մϴ�.");
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[10];
		int[] iSum = new int[10]; //input sum
		int[] rSum = new int[10]; //real sum
		int cnt = 0;
		int i;
		
		for(i = 0; i < 10; i++) { //�� a, b ���� ������ �޴´�.
			a[i] = r.nextInt(100);
			b[i] = r.nextInt(100);
		}
		
		for(i = 0; i < 10; i++) { //�� a, b�� ���� ���� �����Ѵ�.
			rSum[i] = a[i] + b[i];
		}
		
		for(i = 0; i < 10; i++) { //�� a, b�� ���� �Է¹޴´�.
			System.out.printf("����%d.  %d + %d = ", i + 1, a[i], b[i]);
			iSum[i] = sc.nextInt();
			System.out.println();
		}
		
		System.out.println("-------------------------");
		
		for(i = 0; i < 10; i++) {
			if(rSum[i] == iSum[i]) {	
				cnt++;
			}
		}
		
		System.out.printf("ä���մϴ�. ���� ���� %d ( %d�� )\n", cnt, cnt * 10);
		System.out.println(":::::::Ʋ������ ���亸��:::::::");
		
		for(i = 0; i < 10; i++) {
			if(rSum[i] != iSum[i]) {
				System.out.printf("����%d.  %d + %d = %d\n", i + 1, a[i], b[i], rSum[i]);
				
			}
		}
		
		sc.close();
		

	}

}
