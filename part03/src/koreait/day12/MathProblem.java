package koreait.day12;

import java.util.Random;

public class MathProblem {
	//�ν��Ͻ� �ʵ� : static�� �ƴ� ����. ��ü�� �����ɶ����� �ٸ����� ���´�.
	private int n1;
	private int n2;
	private char op;	//+,-,*,/
	private boolean isCorrect;		//����� �Է��� ���� ��������.... ����. isCorrect�� �����̸� true
	//isCorrect �ʵ� ��ſ� ans �ʵ� �߰��ؼ� ����ڰ� �Է��� �� ������ ���� �ֽ��ϴ�.
	
	//static(����) �ʵ�
	public static final int max_size = 20;		//���� �ִ밹���� 20
	
	public MathProblem(char op) {
		this.op  = op;			//���ڷ� ���޹��� ���� ������.
	}
	
	/*	����
	 * 	static �޼ҵ�� �ν��Ͻ� �ʵ尪�� ����(��ü�� ������ ������ �ƴϴ�.)�ϰ� �����ϴ� �޼ҵ�
	 *  �ν��Ͻ� �޼ҵ�� �ν��Ͻ� �ʵ尪�� ����ִ� �����ϴ� �޼ҵ�
	 */
	
	
	public void makeProb() { // ��Ģ���� �������� ������ ���� �����ϱ�->������ ����� �ݴϴ�.

		Random r = new Random();
		int max1=0,min1=0,max2=0,min2=0;
		switch (op) {
		case '+':		//op�� �� '+' �϶�
			max1=99;max2=99;min1=11;min2=11;	//n1,n2 ��� 11~99
			break;
		case '-':
			max1=99;max2=49;min1=50;min2=11;	//n1�� 50~99 , n2�� 11~49 : n1>n2 �� �ǵ���.
			break;
		case '*':
			max1=77;max2=29;min1=11;min2=11;	//n1�� 11~77 , n2�� 11~29 : n1>n2 ���������� ��� n2�� �۰�
			break;
		case '/':
			max1=99;max2=29;min1=41;min2=11;	//n1�� 41~99 , n2�� 11~29 : n1>n2 ������������ ��� n1�� ���� ũ��
			break;

		}
		n1=r.nextInt(max1-min1+1)+min1;		//�������� min1~max1
		n2=r.nextInt(max2-min2+1)+min2;		//�������� min2~max2
	}
	
	
	public int showAnswer() {		//n1,n2,op �ʵ尪�� �����ͼ� �������Ͽ� ��ȯ�մϴ�.
		int result=0;
	
		switch (op) {
		case '+':
			result=n1+n2;
			break;
		case '-':
			result=n1-n2;
			break;
		case '*':
			result=n1*n2;
			break;
		case '/':
			result=n1/n2;
			break;
		}
		
		return result;
	}
	
	public String problem() {
		return n1 + " " + op + " " + n2 + " = ";
	}
	
	
	//getter, setter(��������)
	
	public int getN1() {
		return n1;
	}
	
	public int getN2() {
		return n2;
	}
	
	public char getOp() {
		return op;
	}
	
	//getter,setter ���
	public boolean isCorrect() {
		return isCorrect;
	}
	
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	
	
}
