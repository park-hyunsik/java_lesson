package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {

	public static void main(String[] args) {
		boolean result;
		
		result = 10 > 5;
		System.out.println("10>5���"+result);
		System.out.println("9 !=9��� : " + (9!=9));
		System.out.println("9 == 9 : " + (9==9));
		
		int korean, math; //��������, ��������
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �Է� -> ");
		korean = sc.nextInt();
		
		System.out.println("���� ���� �Է� -> ");
		math = sc.nextInt();
		
		
			// ���������� �������� ��� 80�� �̻��ΰ�? -> ����л�
		System.out.println("����л�?"+(korean>=80 && math>=80));
			// �������� �Ǵ� �������� �� 90�� �̻��� �ִ°�? -> Ư���л�
		System.out.println("Ư���л�?"+(korean>=90 || math>=90));
		//���������� 20~80 �� �ƴ� �л�����? -> ǥ�������� ū�л�
		System.out.println("ǥ��������ū�л�"+!(korean>=20 && korean<=80));
				//korean �� 15, 89�� ��� ��
				// �� 56,78�� ��� ����
		//!(korean>=20 && korean<=80)�� ���� ���ǽ��� korean<20||korean>80
		

		

		
		
	}

}


/*
 * �������� �⺻ ���� : boolean �� true �Ǵ� false ���� ���� ����. (Boolean ����Ŭ���� �ֽ��ϴ�.)
 * ���迬�� ==(����,����.) , !=(�����ʴ�.) , > < , >= , <= �� ������ ������� boolean ����
 * ������ &&(�׸���)
 * 
 * 
 */



/*
 * System.out.println("������ ��� Ȯ���ϱ� : and");
 * System.out.println(" true and true = " + (true && true));
 * System.out.println(" true and false = " + (true && false)); //�Ʒ��� 2�� ������
 * ù�������� false �̹Ƿ� �ι�° ���� don't care false
 * System.out.println(" false and true = " + (false && true));
 * System.out.println(" false and false = " + (false && false));
 * 
 * System.out.println("������ ��� Ȯ���ϱ� : or"); //�Ʒ��� 2�� ������ ù�������� false �̹Ƿ� �ι�° ����
 * don't care true System.out.println(" true or true = " + (true || true));
 * 
 * System.out.println(" true or false = " + (true || false));
 * System.out.println(" false or true = " + (false || true));
 * System.out.println(" false or false = " + (false || false));
 * 
 * System.out.println(" true or true = " + !true);
 * System.out.println(" true or false = " + !false);
 */

