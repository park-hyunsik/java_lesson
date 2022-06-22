package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {
public static void main(String[] args) {
	
	int n10 = 123;
	int n16 = 0xa41c;
	int n2 =0b101001000011100;
	
	System.out.println("1. ������ �״�� ���");
	System.out.println("10���� ���ͷ� 123 : " + n10);
	System.out.println("16���� ���ͷ� 0xa41c :" + n16);
	System.out.println("2���� ���ͷ� 0��1010010000011100 :" + n2);
	
	System.out.println("2. format �����Ͽ� 16���� ���");
	System.out.println(String.format("16���� ���ͷ� 0xa41c : %x", n16));
	System.out.println(String.format("2���� ���ͷ� 0��1010010000011100 : %x", n2));
	System.out.println(String.format("10���� ���ͷ� 123 : %x", n10));
	//��� : 10���� 42012 , n16�� n2 �������� �޸𸮿� ����ɶ��� ��� ������ 0,1 ǥ�����Դϴ�.
	System.out.println("3. -1�� 2����, 16���� ǥ��Ȯ��.");
	n16=0xffffffff;//int�� 4����Ʈ
	System.out.println("16���� 0xfffffff :" + n16);
	System.out.printf("-1�� 16���� %x\n",-1);
	System.out.println("-1�� 2���� : "+ Integer.toBinaryString(-1));
	
	System.out.printf("%x\n",-1);
	System.out.println("2���� : " + Integer.toBinaryString(-1));
	
	System.out.println("3. �Է��� 2���� �Ǵ� 16�������� 2,16������ �ٲپ� �帳�ϴ�.");
	Scanner sc = new Scanner(System.in);
	System.out.println("2���� �� �Է�>>>");
	String t2 = sc.nextLine();
	System.out.println("16���� �� �Է�>>>");
	String t16 = sc.nextLine();
	
	System.out.println(String.format("2���� %s �� 10���� %d �Դϴ�.", 
			t2,Integer.parseInt(t2,2)));	//t2�� 2���� ->�޼ҵ� ��� ������
	System.out.println(String.format("16���� %s �� 10���� %d �Դϴ�.",
			t16,Integer.parseInt(t16,16)));	//t16�� 16���� -> �޼ҵ��� ������


}

}
