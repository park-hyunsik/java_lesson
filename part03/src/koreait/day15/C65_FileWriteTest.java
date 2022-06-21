package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C65_FileWriteTest {

	public static void main(String[] args) {

		String filename = "E:\\day6\\�ڹ��׽�Ʈ.txt";
		
		File file = new File(filename);
		
		//PrintWriter : ��� ����� ���� Ŭ����
//Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try ~ catch �ʿ��ϴ�.
		PrintWriter pw = null;
		try {
		pw = new PrintWriter(file); //file �� ������ ��ġ�� ����� ���� ��ü
		//System.out.println(); ���� System.out ��ſ� ������� ���� pw
		pw.println("��� 90 89 82");
		pw.println("���� 89 90 82");
		pw.println("���� 82 89 90");
		System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");	//System.out : ǥ�� ���(�ܼ� ���)
		}catch (FileNotFoundException e) {
			//��� ��ɿ��� ������ ������ �ڵ����� ������ ��������ϴ�.
			System.out.println("���� �߻� : " + e.getMessage());
		
		} finally {
			pw.close();
		}
	}

}
