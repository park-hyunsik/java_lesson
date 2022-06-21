package koreait.day16;

import java.util.Scanner;

public class C69_MyExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է�>>>");
		try {
			int age = Integer.parseInt(sc.nextLine());
			if(age< 0 || age >100) 
				throw new AgeException("�����ǹ�����0~100�Դϴ�");
			//throw �� Ư�� Exception �� �߻���ŵ�ϴ�.
			
			if ( age==0) throw new NullPointerException();
			
			System.out.println("����� ���̴� " + age +"�� �½��ϱ�?");
		}	catch(NumberFormatException e) {
			System.out.println("���� �Է��� ���ڷθ�");
		}	catch(Exception e) {
			System.out.println("����� ���� ���� :" + e.getMessage());
		}
		
		
	}

}
	
	//����� Exception�� ����ϴ�.�ͼ��� ���
class AgeException extends Exception{

		/**
		 * Serializable �������̽��� ���õȰ�
		 */
		private static final long serialVersionUID = 1L;
	
		//����ڰ� ���Ƿ� �޼����� ����� �ֽ��ϴ�.
		public AgeException(String message) {
			super(message);	//Exception�� message�ʵ带 ����
		}
}
	
