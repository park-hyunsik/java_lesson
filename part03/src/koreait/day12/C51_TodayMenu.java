package koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class C51_TodayMenu {

	public static void main(String[] args) {

		System.out.println("������ ����޴� ��ǥ�մϴ�.!!!");
		String foods = "ġ��, ������, ��â, �Ұ��, �ܹ���, ��¡�ȸ";
		System.out.println(foods);
		
		//key: �޴��̸�, value : ��ǥ��
		
		//�ʱ�ȭ
		HashMap<String,Integer> map = new HashMap<>();
		map.put("ġ��",0);
		map.put("������",0);
		map.put("��â",0);
		map.put("�Ұ��",0);
		map.put("�ܹ���",0);
		map.put("��¡�ȸ",0);
		
		Scanner sc = new Scanner(System.in);
		//�޴� ���� *(�ݺ�)
		while(true) {
			System.out.println(foods);
			System.out.println("���� �޴� ���ĸ� �Է��ϼ���.(����� end �Է�) ->");
			String menu = sc.nextLine();
			if(menu.equals("end")) break;
			
			if(!map.containsKey(menu)) {	//map�� key ���� menu �Է¹��ڿ��� �ִ��� ������
				//System.out.println("���� �޴� �Դϴ�.�ٸ����� ��ǥ���ּ���.");
				System.out.println("���� �޴� �Դϴ�.�޴��� �߰��մϴ�~.");
				map.put(menu,1);	foods += "," + menu;
				continue;
			}
			//�Է¹��� menu �� value���� �������� -> +1 �ϱ� -> ����� �����ϱ�.
			int temp = map.get(menu);
			//++temp;
			//map.put(menu, temp);
			map.put(menu, ++temp);	//���� =>put
			//map.put(menu, temp++); //put => ����
			System.out.println(map);
		}
		

		System.out.println("��ǥ �����մϴ�.");
		System.out.println(map);
		System.out.println("�ִ� ��ǥ�� : " + Collections.max(map.values()));	//����ū���
		System.out.println("�ִ� ��ǥ�� key : " + Collections.max(map.keySet()));//����ūŰ
		
		}

}


