package koreait.day02;

public class C09_Character {

	public static void main(String[] args) {

		char c1 = 'a';
		char c2 = 97;		//�����ڵ�� ������.

		
		//�Ѵ� 'a' ���
		System.out.println("c1 =" + c1);
		System.out.println("c2 =" + c2);
		
		//�����ڵ� ������ �����? -> int�� ĳ���� �ʿ� : �Ѵ� 97���
		System.out.printf("c1= %d\n",(int)c1); //���� : char ���� %d�� ����Ҽ�����
		System.out.printf("c2= %d\n",(int)c2);

		c1 = (char)(c1 +1); //���� ���� ����. ������ �����Ҷ��� casting �ʿ�.
		System.out.println("c1 =" + c1);
		
		c1++; 		//++ ������ c1 = c1+1 , char�������� casting ���ʿ�����ϴ�. 
		System.out.println("c1 =" + c1);
		
		//�ѱ۹����׽�Ʈ : �ѱ۹����ڵ�� 10���� ���� 44032 ~ 55203 , 16���� (2����) ac00~d7a3
		char h1 ='��';
		char h2 = 44032; //
		char h3 ='\uac00';	// \\u�� 16���������ڵ�, ac00�� 16������
		
		System.out.println("h1 = " + h1);
		System.out.println("h2 = " + h2);
		System.out.println("h3 = " + h3);
		
		System.out.printf("h1 = %d\n",(int)h1);
		System.out.printf("h2 = %d\n",(int)h2);
		System.out.printf("h3 = %d\n",(int)h3);
		
		h1++;
		System.out.println("h1 = " + h1);
		
		h1++;
		System.out.println("h1 = " + h1);
		
		//�ѱ��� ������ ����
		char h4 = 55203;  //10����ǥ��
		char h5 = '\ud7a3';//16����ǥ��, �R
		System.out.println("h4 = " + h4);
		System.out.println("h5 = " + h5);
		
		h4++;
		System.out.println("h4="+h4);
		
		h5--;
		System.out.println("h5 = " + h5);
		System.out.println('H'+'e'+'l'+'l'+'o');
		
		//char�� �𿩼� ���ٷ� ������ �����ϸ� -> ���ڿ��� �˴ϴ�. "Hello" 
		
		
		
	}

}




/*
 *	�⺻���� ������ : ������ char 
 * 		���ڵ����͸� �����ϴ� 2����Ʈ ����. ������ 0 ~ 65535 ���� ���嵵 �����մϴ�.
 * 		��ǻ�Ϳ��� �ٷ�� ���ڴ� �����ڵ�� ó���Ǵµ� �ڵ�� �������Դϴ�.
 * 		���������ʹ� '' ��ȣ�� ����մϴ�.(''�ȿ��� ����1����)
 * 		
 * 		������,����,Ư�����ڴ� ASCII �ڵ�� ǥ���˴ϴ�.
 * 		������,����,Ư������ ���� �ٱ���ڸ� ó���ϴ� ���ڵ� ��Ŀ� ����
 * 		�����ڵ尪�� �ٸ��ϴ�. ����ȭ ���ڵ����� utf-8 ����� ���� ����մϴ�.
 * 		
 * 
 * 		�� : �� �� �� (�ʼ�,�߼�,���� ������ �ڵ尪���� �����ϴ� ������)
 * 		�ѱۿ��� ���ü� �ִ� ��� �ʼ�/�߼�/������ ��� ǥ���� ���� ���� �ڵ尪�� �ο��ϴ� �ϼ���
 * 
 * 
 *  */
