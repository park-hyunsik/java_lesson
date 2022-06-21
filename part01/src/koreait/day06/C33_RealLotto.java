package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
//�ۼ��� : ������
	public static void main(String[] args) {
/*
 * �迭 : �迭��ü
 * �迭 ��� : �迭�� ������ ��
 * 
 */
		
		int[] numbers = new int[45];//���� ���� �ش�Ǵ� �迭
		Random r = new Random();	//���� ��ü r ����
		int[] lotto = new int[6];	//���õ� 6���� ��(�ζ� ����) �����ϴ� �迭
		
		//ó�� ���� : ���� �ε���+1 -> �ε��� ������ �̰� �ش簪�� �����ϸ� �� ��Ģ�� ������ �ȵ˴ϴ�.
		for(int i=0;i<45;i++) {	//�ε��� ���� : 0 ~ 44 -> ������ ������ ��
			numbers[i]=i+1;		//�� ���� : 1~45 -> lotto�迭�� ����Ǵ� ��
		}

		System.out.println("numbers �迭 �ʱⰪ -----------");
		System.out.println(Arrays.toString(numbers));//�ζ� ��ȣ�� �� �� �ִ� ��ȣ ����
		System.out.println("---------------------------");
		

		int k;	//���� ���� �ε��� - ������ ���մϴ�.
		for(int cnt=0;cnt<6;cnt++) {	//�ζ� ��ȣ 6���� ���ϱ� ���� for��
			
			k=r.nextInt(45-cnt);
			//cnt=0,1,2,3,4,5 �� ���� ������ bound ���� 45,44,43,42,41,40 -> �ߺ�����(Ȯ������ ������ ���̱�)
			//k�� ��������? 0~44 , 0~43, 0~42, 0~41 ,  0~40 , 0~39
			
			System.out.println("k="+k +",nuber =" + numbers[k]);	//���� ������ �ε����� �� ������ ��
			
			lotto[cnt]=numbers[k];	//numbers�迭���� ������ ���� �ε��� k�� ���� 
			
			//k��ġ�� ���� ����(����) : �ε��� k+1 ���� ��������ұ��� �������� �̵�
			for(int i=k;i<numbers.length-1;i++) {//���õ� �ζ� ��ȣ�� ���� -> �ߺ�����
				numbers[i]=numbers[i+1];
			}
			System.out.println(Arrays.toString(numbers));//���õ� �ζ� ��ȣ �� ���� ���� �˸�
		}
		System.out.print("���� ���� ���� : ");
		System.out.println(Arrays.toString(lotto));//���� ���õ� ���� ���
		
		Arrays.sort(lotto);	//lotto �迭���� ũ�� ������� ��ġ�� �����մϴ�.
		System.out.println(Arrays.toString(lotto));	//������������ ���
		
		
		
		
		
		
		
		
		
		
	}

}
