package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class pt1 {

	public static void main(String[] args) {

		int lottoNum[] = new int[6];	//���� ���ڵ��� ���� �迭
		Random r = new Random();		//���� ��ü r ����
		
		
		//�迭�� �߰� �� �ߺ� ����
		for(int i=0;i<6;i++) {
			//r.nextInt(45) : 45�� upperBound�� �� ���� ���� ���� + 1 : 1 ~ 45
			lottoNum[i] = r.nextInt(45) + 1;
		
			//�ߺ����� : ���� index (i) �� (0 ~ i-1) ���Ͽ� �ߺ��� ���ڰ� �����ϸ� i--
			for(int j=0;j<i;j++) {			
				if(lottoNum[i] == lottoNum[j])
					i--;				
			}
		}
			
		//����
		Arrays.sort(lottoNum);
		
		//�迭 ���� ���� ��ȣ ���
		for(int i=0;i<6;i++)
			System.out.print(lottoNum[i] + " ");
	}
}