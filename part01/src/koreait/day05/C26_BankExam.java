package koreait.day05;

import java.util.Scanner;

public class C26_BankExam {
/*
 * GUI : Graphic User Interface (����� ����� ������, �޴� ������� ó��)
 * CLI : Command Line Intercae (����� ����� �ؽ��θ� ó��)
 * 
 * 
 */
	
	
	public static void main(String[] args) {
//�������� : ���������� ����/���/�ܰ���ȸ ����
		Scanner sc = new Scanner(System.in);
		boolean run=true;	//�ݺ��� ������ ����
		int sel; // ���� ���� ����
		int balance=0;	//�ܰ�(�ܾ�)
		
		while(run) {	//�ʱⰪ�� ��
			int money;	//while�� ��������. �Աݾװ� ��ݾ� ����
			System.out.println("-------------");
			System.out.println(" 1:���� | 2:��� | 3:�ܰ� Ȯ�� | 4:����");
			System.out.println("�޴� ���� >>> ");
			System.out.print("�޴� ���� >>> ");
			sel = sc.nextInt();
			
			switch(sel) {
			case 1:	//���� ó��(���ݱݾ��Է�->�ܾ׿� ���ϱ�)
				System.out.println("���ݾ� >");
				money = sc.nextInt();
				balance +=money;
				
				System.out.println("������ �ܾ���" + balance + "���Դϴ�");
				break;
			case 2: //��� ó��(��ݱݾ��Է�-> �ܾ׺��� ���� ���� �� ó��(�ܾ׿��� ����))
				System.out.println("��ݾ� >");
				money = sc.nextInt();
				if(money>balance)
					System.out.println("�ܾ��� �����մϴ�. Ȯ���ϼ���.!");
				else
					balance -= money;
				System.out.println("������ �ܾ���" + balance + "���Դϴ�");
				break;
			case 3:	//�ܰ�(balance) ���
				System.out.print("���� �ܰ� : " + balance);
				System.out.println();	//�ٹٲ�
				break;
			case 4:	//�ݺ�����
				System.out.println("���α׷��� �����մϴ�.");
				
				break;
			default:	//1,2,3,4 �� ������ ���� ��
				System.out.println("�߸��� �����Դϴ�. ���� 1~4�� �Է��ϼ���.");
				
			
			
			}
			//while �ݺ�����κ��� ��
		}	//while end
		
	System.out.println("********out*********");
	}

}
