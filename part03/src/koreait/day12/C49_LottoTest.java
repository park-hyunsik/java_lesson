package koreait.day12;

import java.util.ArrayList;
import java.util.Random;

public class C49_LottoTest {

	public static void main(String[] args) {

		ArrayList<Integer> numbers =
				new ArrayList<>();
		
		for(int i=0;i<45;i++) {	//�ε��� ���� : 0 ~ 44 -> ������ ������ ��
			numbers.add(i+1);		//�� ���� : 1~45 -> lotto�迭�� ����Ǵ� ��
			
		}
		System.out.println("numbers");
		System.out.println(numbers);	//toString�� ������
		
		Random r = new Random();
		
		ArrayList<Integer> lotto =
				new ArrayList<>();
		
		int k;//������ ���� �� �ε��� ���մϴ�.
		
		for(int cnt=0;cnt<6;cnt++) {
			k=r.nextInt(45-cnt);
			System.out.println("k="+k + ",number =" + numbers.get(k));
			lotto.add(numbers.get(k));
			numbers.remove(k);
			System.out.println("���� ��");
			System.out.println(numbers);
		}
		
		
		System.out.println("���� ���� ���� 6��");
		System.out.println(lotto);
	}
//�迭�� ����� ���� ��ġ����(����/����) �޼ҵ尡 �����ϴ�. �迭�� ũ��� �����Դϴ�.
// -> �̷� �κ��� ArrayList�� �ذ��ϰ� �����α׷����Ҷ� ArrayList�� �ʼ��Դϴ�.
}
