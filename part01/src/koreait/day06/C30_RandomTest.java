package koreait.day06;

import java.util.Random;

public class C30_RandomTest {

	public static void main(String[] args) {
		Random r = new Random();	//Random Ŭ������ ��ü ����(new ����)
		
		System.out.println("1. ������ ������ 10�� ���");
		for(int i=0;i<10;i++) {
			int inum =r.nextInt();	//int ���������� ������(����) ����ϴ�.
			System.out.println(inum);
		}
		
		System.out.println("2. ������ ������ 10�� ��� - bound(��谪) ����.");
		for(int i=0;i<10;i++) {
			int inum =r.nextInt(100);	// 0<=���� < 100 ������ �������� �����
			System.out.println(inum);
		}//��ԝ��� ������� ����մϴ�.
		System.out.println("3. ������ ������ 10�� ��� - bound(��谪) ����.");
		for(int i=0;i<10;i++) {
			int inum =r.nextInt(100)+1;	// 1<=���� < 101 ������ �������� �����
			System.out.println(inum);
		}
		//n���� ũ�ų� ���� m���� ���� ���� ���� : r.nextInt(m-n)+n
		
		System.out.println("4. 2~45 ������ ������ ����10��");
			for(int i=0;i<10;i++) {
				int inum =r.nextInt(44)+2;	
				System.out.println(inum);
		}
		
	}

}
