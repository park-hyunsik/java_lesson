package koreait.day15;

import java.util.Scanner;

public class C64_TryCatchEx1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			
			String message = null;
			int idx = message.length();
					
			
			System.out.println("���� �Է�>>> ");
			//int n = sc.nextInt();	//123�Է� , abc �Է� ��� ��
			int n = Integer.parseInt(sc.nextLine());
			System.out.println("����� �Է��� �� : " + n);
			
//		} catch (Exception e) {//���� ���ο� ���� Exception ������ �˻��մϴ�.
//		} catch (NullPointerException e) {//���� ����ο� ���� Exception ������ �˘��ݵ�.
			//|��ȣ�� bit ���� or ���� : Exception ��Ʈ������ ����
		} catch (NullPointerException | NumberFormatException e) {
			//�߻��� ���� ������ Exception ��ü�� �����ϰ� �̿� ���� ���������� e�Դϴ�.
			System.out.println("���� �߻� : " + e.getMessage() ); 
			System.out.println("����� ��ɿ� ������ �߻��߽��ϴ�.");
		} finally {
			sc.close(); 
		}
		
		System.out.println("���α׷� ��!!");
	}

}
