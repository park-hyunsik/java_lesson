package koreait.day05;

import java.util.Scanner;

public class C23_StarPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[[��ȭ���� �ı�]]");
		System.out.printf("������ �� �� �ֽðڽ��ϱ�? (1~5) >>> ");
		int count = sc.nextInt();
		
		System.out.println("���1");
		for(int i=0;i<count; i++) {
		System.out.println("��");
		}
		
		System.out.println("\n\n���2");	{
		for(int i=0;i<count;i++)
			System.out.println("��");
		for(int i=0;i<5-count;i++)
		System.out.println("��");		//���Ƚ���� 5-count
		}
	
		System.out.println("\n\n���2_");
		
		for(int i=0;i<5;i++)
			if(i<count)
				System.out.print("��");
			else
				System.out.print("��");
		
		
		System.out.println("\n\n���2__");
		int k;	//loop counter ������ main�޼ҵ��� ��������
		for(k=0;k<count;k++)	//count=3
			System.out.print("��");
		
		System.out.println("k="+k);	//k=3 , ���� for ���� ���ᤧ�� �Ǵ� k��
		for(;k<5;k++)				//k�� ���� �󸶺��� �����Ѵ� �ɱ��. k�� count ����
			System.out.print("��");
		
		
	}

}
