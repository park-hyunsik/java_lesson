package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {

	public static void main(String[] args) {

		String message = "hi java!";	//message�� ������ ����
		
		String[] engKey = {"continue","break","public","static","dynamic"};
		
		//int,double,char �迭������ ��Ҹ� ��Ÿ���� nums[2], carr1[2], point[2]
											//���⺻�� ������ Ÿ��
		//engkey �Ӹ��ƴ϶� engKey[2] �� String ������ Ÿ��
		
		for(int i=0;i<engKey.length;i++)
			System.out.println(engKey[i]);	//engKey[i]�� String ������
		String[] koreans = new String[5];	//�迭����� ���� �⺻�������� ����X, ������ ����
		for(int i=0;i<koreans.length;i++)
			System.out.println(koreans[i]);
		
		koreans[0]="����ϴ�.";
		koreans[1]="���ߴ�";
		koreans[2]="������";
		
		System.out.println("2.koreans �迭��Ұ��� �����ϴ� ���ڿ��� ����");
		for(int i=0;i<engKey.length;i++)
			System.out.println(engKey[i] + ":" + engKey[i].length());
		
		for(int i=0;i<koreans.length;i++)
			if(koreans[i] !=null)	//***
			System.out.println(koreans[i] + ":" + koreans[i].length());
			//�����ϰ��ִ� ��ü�� ������ �޼ҵ�/�ʵ� �����ϸ� ����:koreans[3],koreans[4]�� null����
		
		Scanner sc = new Scanner(System.in);
			System.out.println("static ��? >>>");
			koreans[3] = sc.nextLine();
			System.out.println("dynamic ��? >>>");
			koreans[4] = sc.nextLine();
	
			System.out.println("3. ����Էµ� koreans �迭 Ȯ��");
			for(int i=0;i<koreans.length;i++)
				System.out.println(koreans[i]);
			
			System.out.println("4.���ڿ� �迭���� ���ϱ�");
			//����ڰ� �Է��� ����ܾ engKey �迭 �ε��� �������?
			System.out.println("ã�� �ܾ�� >>>");
			String find = sc.nextLine();
			int i;
			for(i=0;i<engKey.length;i++) {
				if(find.equals(engKey[i]))
					break;	//i=0 ~engkey.length-1
			}
			//break �� for�� �ߴ����� �ʰ� for�� ��� ������������ ���� ���ڿ��� ���� �� �Դϴ�.
			
			System.out.println("ã�� �ܾ� ��ġ : " + i);
			if(i==engKey.length)//?
				System.out.println("ã�� �ܾ engkey�� �����ϴ�.!");
			else
				System.out.println("�ѱ� �� : " + koreans[i]);
			
			
			
			
			
			
			
			/*
			 * for(int i =0;i<engKey.length;i++) { if(find.equals(engKey[i])) { //��ġ�ϴ� �ܾ�
			 * ã���� for index = i; break; } System.out.println("ã�� �ܾ� ��ġ : "+ index);
			 * if(index==-1) System.out.println("ã�� �ܾ engKey�� �����ϴ�.!"); }
			 */
	}
	
}
