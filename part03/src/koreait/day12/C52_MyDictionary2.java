package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary2 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);	//Ű���� �Է½� �ؽ�Ʈ����,��Ʈ �� ���̾��� �Է��� �������ȴ�
		//HashMap<String, String> mydic = new HashMap<>();	//�ܾ��� ������ �ڷ� ����
		TreeMap<String, String> mydic = new TreeMap<String, String>();//���� �˻������� ������map������:�����̵Ǵ�Map
		
		String sel, eng, kor;
		System.out.println("���ñ�� 1.�ܾ����� 2.�ܾ�˻� 3.�ܾ��庸�� 4.���α׷�������");
		boolean run = true;
		while (run) {	//whil �ݺ��ȿ� switch �� ���������� ���۽�ų�� break �� ���մϴ�->���� ����߽��ϴ�.
			System.out.println("���� ->");
			sel = sc.nextLine();
			switch (sel) {
			case "1":	//switch������ case "���ڿ�"����
				System.out.print("English -> ");
				eng = sc.nextLine();
				System.out.print("�ѱ� �� -> ");
				kor = sc.nextLine();
				mydic.put(eng, kor);	//����
				break;
				
			case "2":
				System.out.print("�˻� �ܾ� English -> ");
				eng = sc.nextLine();
				System.out.println("�ܾ��� �˻��߽��ϴ�. ��� =>"+mydic.get(eng));
				break;
				
			case "3":
				System.out.print("�ܾ��� ��ü���� :" + mydic);
				break;
				
			case "4":
				run=false;
				break;
				
			default:
				System.out.println("�߸� �Էµ� �����Դϴ�. 1~4 �Է��Դϴ�.");
				break;
			}
			System.out.println("�ܾ�������==========");
		}
		
		//���� : ���� ������ �Է��� �޾ƾ� �Ѵٸ� ���ڿ� nexLine() �޾Ƽ� ������ ��ȯ�մϴ�.
		//int score = Integer.parseInt(sc.nextLine()0;
		//���� : nextInt()�� ���͸� ó������ �ʾƼ� ������ ������ nextLine()���� ���޵Ǿ� �Է� �帧�� ���ذ� �˴ϴ�.
		//��� : �Ѽҽ����Ͽ��� nextInt() �� ��� �Ǵ� nextLine()�� ����ϰų� �մϴ�.
		
		
		
		
	}
	}