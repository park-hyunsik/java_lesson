package koreait.day12;

import java.util.HashMap;
import java.util.Scanner;

public class C52_MyDictionary {
	public static void main(String[] args) {
	System.out.println("�ܾ������α׷��Դϴ�.");
	String MyDictionary = "1.�ܾ�����, 2.�ܾ�˻�, 3.�ܾ��庸��, 4.���α׷�������";
		
	HashMap<String,Integer> map = new HashMap<>();
	
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println(MyDictionary);
		System.out.println("���ϴ� ����� �����ϼ���.����� 4 �Է�) ->");
		String choice = sc.nextLine();
		if(choice.equals("4")) break;
		
		if(!map.containsKey(choice)) {
			System.out.println("�ܾ��忡 �����մϴ�.");
			map.put(choice,1);	MyDictionary += "," + choice;
			continue;
		}
		//�Է¹��� menu �� value���� �������� -> +1 �ϱ� -> ����� �����ϱ�.
		int temp = map.get(choice);
		map.put(MyDictionary, temp);	
		System.out.println(map);
	}
	System.out.println("���α׷��� �����մϴ�.");
	
	}
}

/*
 * 
 * 
 * 
 * 
 * 
 * 
 */
