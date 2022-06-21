package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C66_FileReadTest2 {

	public static void main(String[] args) {

//		String filename = "E:\\day6\\�ڹ��׽�Ʈ.txt";
		String filename = "E:\\day6\\�ڹ��׽�Ʈ.txt";
		
		File file = new File(filename);
		
		//Scanner : �Է� ����� ���� Ŭ����
//Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try ~ catch �ʿ��ϴ�.
		Scanner sc = null;
		try {
			sc = new Scanner(file);	//System.out : ǥ�� ���(�ܼ� ���)
/*			
			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
*/
			while(sc.hasNext()) {	//������ ���͸� �������� ���� �����Ͱ� ������ true
				System.out.println(sc.nextLine());
			}
			System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�.");
			
//		System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");	
		}catch (FileNotFoundException e) {
			//��� ��ɿ��� ������ ������ Exception  �� �߻��մϴ�.
			System.out.println("���� �߻� : " + e.getMessage());
		
		} finally {
			if(sc!=null)sc.close();
		}
	}

}
//try ~ catch �ڿ����� ����� finally �Ⱦ��� java 7 �������� �ٸ� ���� ������ �����մϴ�.
	//	�����õ� �������̽��� ���������� ã�ƺ���
// ���ϰ� ���� �÷����� �յ�� !! ����� ���� �׽�Ʈ �غ�����. ������ 1���� ��� �ϼ���.

