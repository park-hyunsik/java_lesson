package koreait.day03;

import java.util.Scanner;

public class C08_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int width ; // ����ڰ� �Է��� ��
	int height; // ����ڰ� �Է��� ��
	int box_area;
	double half;
	final double PI = 3.14;
	//?
	System.out.println("[[�簢�� ������ ���̸� ���Ͻÿ�]]");
	System.out.println("�簢�� �ʺ� �Է� ->");
	width = sc.nextInt();
	System.out.println("�簢�� ���� �Է�->");
	height = sc.nextInt();
	
	box_area = width*height;
		
	System.out.println("ó������Դϴ�");
	System.out.println("����:"+width+"��");
	System.out.println("����:"+height+"��");
	System.out.println("���̸� ���߽��ϴ�:"+box_area+"��");
		


	sc.close();	

	
	

	
	

	}

}


//�� ��