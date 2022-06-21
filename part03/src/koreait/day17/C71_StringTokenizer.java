package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class C71_StringTokenizer {

	public static void main(String[] args) {

		String temp = "��� 90 88 79";
		
		//��ūȭ : StringTokenizer Ŭ������ ��� ���
		//���б�ȣ�� �⺻ ���� : ����, ��, �ٹٲ�
		
		StringTokenizer stk = new StringTokenizer(temp);
		System.out.println("1. nextToken �޼ҵ�");
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println(stk.nextToken());
		System.out.println("hashMoreTokens?" + stk.hasMoreTokens());
		
		System.out.println("2. �ݺ������� hasMoreTokens �޼ҵ�");
		while(stk.hasMoreTokens()) {	//������ �о�� ��ū�� ������
			System.out.println(stk.nextToken());
		}
			
		
		System.out.println("3.�������� ���б�ȣ ���");
		temp = "���,90 88()79";
		stk = new StringTokenizer(temp," ,()");
		while(stk.hasMoreTokens())
			System.out.println(stk.nextToken());
		
		System.out.println("4. ��ūȭ �����ͷ� ��ü �����");
		temp = "��� 90 88 79";
		stk = new StringTokenizer(temp);
		Score score = null;
		while(stk.hasMoreTokens()) {
			score = new Score(stk.nextToken(),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()));
		}
		System.out.println("������ Score ��ü : " + score);
		System.out.println("���� : " + score.sum());
		System.out.println("��� : " + score.average());
		System.out.println("���� : " + score.getGrade());
		
		temp = "��� 90 88 79\n���� 78 83 79\n�ź� 92 73 66";
		stk = new StringTokenizer(temp);
		List<Score> scores = new ArrayList<>();
		while(stk.hasMoreElements()) {
			score = new Score(stk.nextToken(),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()));
			scores.add(score);
		}		
		System.out.println("��ū������ ��� :" + scores);
		
		scores.clear();
		
		String[] result = temp.split("[ \n]");
		System.out.println(Arrays.deepToString(result));
		for(int i=0;i<result.length;i+=4) {
			Score s = new Score(result[i+0],//�̸�
				Integer.parseInt(result[i+1]),//��
				Integer.parseInt(result[i+2]),//��
				Integer.parseInt(result[i+3])//��
			);
			scores.add(s);
		}
		
		
	}

	
}
