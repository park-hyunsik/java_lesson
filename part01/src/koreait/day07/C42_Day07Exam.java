package koreait.day07;

import java.util.Random;
import java.util.Scanner;
// �ۼ��� : ������
public class C42_Day07Exam {
	public static void main(String[] args) {
		//���
		System.out.println("----------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��  ");
		System.out.println("----------------------");
		System.out.println("�����մϴ�.");
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] n1 = new int[3];
		int[] n2 = new int[3];
		int[] iSum = new int[3]; 
		int[] rSum = new int[3]; 
		int cnt = 0;
		int i;
		
		for(i = 0; i < 3; i++) { //�� a, b ���� ������ �޴´�.//������ ���� ��� for�� ���� ����
			n1[i] = r.nextInt(100); //100���� �������� ����
			n2[i] = r.nextInt(100);
		}
		
		for(i = 0; i < 3; i++) { //�� a, b�� ���� ���� ����.
			rSum[i] = n1[i] + n2[i];
		}
		
		for(i = 0; i < 3; i++) { //�� a, b�� ���� �Է¹޴´�.
			System.out.printf("����%d.  %d + %d = ", i + 1, n1[i], n2[i]);
			System.out.println();
			iSum[i] = sc.nextInt();
		}
		
		for(i = 0; i<3 ;i++) { 
			if(rSum[i] == iSum[i]) {//rSu
				cnt++;
			}
		}
		System.out.printf("ä���մϴ�. ���� ���� %d ( %d�� )\n", cnt, cnt * 10);//����,10*����
		System.out.println("-----Ʋ������ ���亸��------");
		
		for(i = 0; i < 3; i++) {
			if(rSum[i] != iSum[i]) {
				System.out.printf("����%d. %d + %d = %d\n", i + 1, n1[i], n2[i], rSum[i]);
			}
		sc.close();
			}
		}
	}