package koreait.day16;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;


public class C67_ResourceClose {
// ��ó : https://blog.naver.com/zzang9ha/222064282210
// ���� : https://codechacha.com/ko/java-try-with-resources/
// ���� : https://codevang.tistory.com/142
	
	public static void main(String[] args) {
		
//		String filename = "E:\\day6\\�ڹ��׽�Ʈ.txt";		// �б�: �����ϴ� ����
//		String filename1 = "E:\\day6\\�ڹ��׽�Ʈ2.txt";		// ���� : �������� �ʴ� ����
	
		//���� ��ȭ���� ����ϱ�
		String filename = fileDialogOpen();	//������ ������ �����ϼ���.
		String filename2 = fileDialogSave();
		
		File ifile = new File(filename);
		File ofile = new File(filename2);
		
		try (Scanner sc = new Scanner(ifile);PrintWriter pw = new PrintWriter(ofile)) {
			while(sc.hasNext()) {
				String temp = sc.nextLine();
				System.out.println(temp);
				pw.println(temp);
			}
			System.out.println("���� ���� �Ϸ�");
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("����� ���� �߻�: " + e.getMessage());
			System.out.println("������ ������ �����ϴ�.");
		}catch (Exception e) {	//FileNotFoundExcetion �̿��� ��� �ͼ��� ó��
				System.out.println("�˼����� ���� :" +e.getMessage());
			}
		}


private static String fileDialogOpen() {

//�ܼ� ��������� �����ϴ� ���α׷� : CLI(Command Line Interface)  <-> GUI(Graphic User Interface) 
//�ڹٿ����� GUI �� ����� �ִ� Ŭ�������� �ֽ��ϴ�. �� �� �ϳ��� ���ϴ�ȭ���ڸ� ����մϴ�. ���̺귯���� awt,swing,javaFX ���� �ֽ��ϴ�.
//Windows OS�� ���α׷����� window��� Ʋ �ȿ��� ��������µ� �ڹٿ����� �װ��� �������̶�� �մϴ�.
		
		JFrame f = new JFrame();  //���ϴ�ȭ���ڸ� ������ �����Ӱ�ü ����
		
		FileDialog fdr = new FileDialog(f,"���� ����",FileDialog.LOAD);	//���ϴ�ȭ���� ��ü ����
		fdr.setVisible(true);		//���� ��ȭ���� ���̱�
		
		String filename = fdr.getDirectory() + fdr.getFile(); 	//������ ������ ��ο� ���ϸ� ����
		System.out.println("������ ��ο� ���� : " + filename);
		System.out.println("������ ��� : " + fdr.getDirectory() + ",������ ����:" + fdr.getFile());
		File file = new File(filename);
		System.out.println("������ ���� ũ�� : " + file.length() + " ����Ʈ");
		return filename;
	}
	
	
	public static String fileDialogSave() {
		JFrame f = new JFrame();  //���ϴ�ȭ���ڸ� ������ �����Ӱ�ü ����
		FileDialog fdw = new FileDialog(f, "���� ����",FileDialog.SAVE);
		fdw.setVisible(true);
		String filename = fdw.getDirectory() + fdw.getFile(); 	//������ ������ ��ο� ���ϸ� ����
		System.out.println("������ ��ο� ���� : " + fdw.getDirectory() + fdw.getFile());
		return filename;
		
	}
}

/*
 * AutoCloseable �������̽�.
 * ���� Ŭ������ try-with-resources���� �ڿ��� �����Ǳ� ���Ѵٸ�
 * AutoCloseable�� implements�ؾ� �Ѵ�.
 * Scanner Ŭ������ PrintWriter Ŭ������ AutoCloseable�� ������ Ŭ����.
 * main������ �ش� ��ü�� try-with-resources�� ����ϰ� �ִ�.
 * ���� try���� ����� �� close() ������ ȣ�����ش�.
 */
