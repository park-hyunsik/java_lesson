package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� �̸��� �Է��ϼ���. >>>");
		
		String email;
		boolean isValid=true;
		email = sc.nextLine();	//Ű���� �Է��� ���ڿ��� ó���մϴ�.

		//�Է��� ó������ 1,2,4,5,�� �ش����� ������ �޽��� ����ϰ� isValid ������ false �� �մϴ�.->isValid ���

		if(email.indexOf("@") == -1)
		{
		System.out.println("�̸��� ������ �ƴմϴ�");
		}
		else
		      System.out.println("�̸��� ������ �½��ϴ�");
		
		if(email.substring(email.indexOf("@")+1).equals("gmail.com"))
		{
		System.out.println("2������ ���");
		}
		else
		{
		System.out.println("������ �̸��� Ʋ���ϴ�.");
		}
		
	}

}


/*  ���� �̸��� ������ üũ�ϴ� ��� ���� 
 *  1. @ ��ȣ�� 1�� ���ԵǾ�� �մϴ�.	(�޽��� : �̸��� ������ �ƴմϴ�.)
 *  		�� indexof �� -1�� �ƴϰ� indexof �� lastindexof �� ���� ���ΰ�?
 *  
 *  2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�. (�޽��� : ������ �̸��� Ʋ���ϴ�.)
 *  		�� '@' �� indexof �� ���ؼ� �� �ں��� ��(length()-1)���� substring ������ ���ڿ��� equals ��
 *  
 *  3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
 *  		�� '@' �� indexof �� ���ؼ� ó�� ���� '@' ���� ������ ���ڿ� substring ����
 *  
 *  4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�.
 *  		�� 3���� ���ڿ��� length() �� 6���� ��
 *  
 *  5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�. 
 *   		�� indexof('$') , indexof('%') �� ��� -1�� �ƴϸ� �����ϴ� ��ȣ ����
 */