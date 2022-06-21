package koreait.day06;

import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * �л� ����(����) ������ ������ ����ϴ�.
		 * �л� �ο��� 100�� - ������ ���������� �׽�Ʈ(0<= ���� <=100)
		 * 
		 * 90~100 : 0�� (�Ҽ��� 1�ڸ�%) ī��Ʈ������ 5�� �ʿ��մϴ�.(cntA,cntB)
		 * 80~89 : 0�� (�Ҽ��� 1�ڸ�%)			��counts[5] : counts[0],counts[1]
		 * 70~79 : 0�� (�Ҽ��� 1�ڸ�%)	counts[2]
		 * 60~69 : 0�� (�Ҽ��� 1�ڸ�%)	counts[3]
		 * 60�� �̸� : 0�� (�Ҽ��� 1�ڸ�%)	counts[4]
		 */
		
		int[] koreans = new int[200];
		int[] counts = new int[5];
		Random r = new Random();
		
		for(int i=0;i<koreans.length;i++) {
			koreans[i] = r.nextInt(101);

		}	//�������� ����
		
		//���� ���� counts�ϱ�
		for(int i=0;i<koreans.length;i++) {
			if(koreans[i] >= 90)	counts[0]++;
			else if(koreans[i] >= 80)	counts[1]++;
			else if(koreans[i] >= 70)	counts[2]++;
			else if(koreans[i] >= 60)	counts[3]++;
			else	counts[4]++;
		
		}
		
		//���� ���� ��� ����ϱ�
		System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60�̸�");
		System.out.printf("%8s %8s %8s %8s %8s\n","90~100", "80~89" , "70~79" , "60~69" , "60�̸�");
		System.out.println("------------------------------------------------");
		for(int i=0;i<counts.length;i++) {
			//counts�迭�� ���
			System.out.printf("%8d",counts[i]);
		}
			//counts�迭������ ����� ���ϰ� ����ϱ�
		for(int i=0;i<counts.length;i++)
			System.out.printf("%8.1f%%",(double)counts[i]/koreans.length*100);
		
	}
//�迭���� ����� ���(�����ͻ���,�߰�
	
	
}
