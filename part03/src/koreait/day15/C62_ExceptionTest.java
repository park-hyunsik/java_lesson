package koreait.day15;

import java.util.Scanner;


//Throwable Ŭ������ ����Ŭ����
//: Error -> �ý��ۻ��� ����
//: Exception 					
public class C62_ExceptionTest {

	public static void main(String[] args) {
		String message = null;
		char temp = message.charAt(0);     //message ���ڿ����� ù��°(0) ���� 1�� �����ɴϴ�.
	//Exception ����3 : java.util.InputMismatchException
	Scanner sc = new Scanner(System.in);
	System.out.println("���� �Է� >>> ");
	//int a = sc.nextInt();			//Ű�����Է��� ������ ��ȯ�ؼ� ������ �����մϴ�.	
	
	int a = Integer.parseInt(sc.nextLine());
	//���� �ܿ� �ٸ� ���� �Է��ϸ� Exception �߻�	-> java.lang.NumberFormatException 			
	// �Ǽ��� .�� ���ԵǱ⿡ Exception �߻�
	
	System.out.println("����� �Է��� �� : " + a);
		//Exception ����2 : java.lang.ArrayIndexOutOfBoundsException 
				int[] nums = new int[5];		//�迭���� : ��� 5���Դϴ�.
				nums[5] =100;
				
//Exception ����1 : java.lang.NullPointerException	(��ü ������ null �̸� �޼ҵ� ������մϴ�.)
		
	

		
	

		
	}

}
/*
 * ���� ���� : //int a = 4.1; �� ���� ������ ��ü�� �ȵ˴ϴ�.
Exception ��� : ���������� �ƴմϴ�. �����ϸ鼭 �߻��ϴ� ���� �Դϴ�.(�߻����ɼ��� ����ؼ� ���α׷����ؾ��մϴ�.)
     -> ���ο� ���� �ٸ��̸� XXXXException �� �߻��ϰ� �̵��� Exception Ŭ������ �ڽ� Ŭ�����Դϴ�.(��Ӱ���)
     -> Exception �� ���� �߿� �߻��ϸ� �� ���Ĵ�?..... ���α׷��� �� �������� �ߴܵ˴ϴ�. 
         ����, Exception �� �����ϰ� ���α׷��� �ߴܵ��� �ʵ��� ���α׷� ������ �ؾ��մϴ�.
*/
