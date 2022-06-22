package koreait.ext;

public class BinaryOP {

	public static void main(String[] args) {

		//2������ ��Ʈ ���� : & , |, ^ , ~ , >> , << ��� ������ �׽�Ʈ
		int data = 0b0101110100100110;

		System.out.println("\n1. ~ (��Ʈ ����) ������");	//���� : !������ true�� false�� �ݴ�� boolean����
		 System.out.println(String.format("%32s", Integer.toBinaryString(data)));
		 System.out.println(String.format("%32s", Integer.toBinaryString(~data)));
		
		 System.out.println("\n2.>>�� ������ ����Ʈ ����");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1),data>>1));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2),data>>2));
		 // >>1�� ������2�� ��� ��.
		 
		 System.out.println("\n3.<<�� ���� ����Ʈ ����");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<1),data<<1));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<2),data<<2));
		 // <<1�� ���ϱ�2�� �����.
		 
		 data = -2345;
		 System.out.println("\n4. ������ >>");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1),data>>1));
		 System.out.println("-----------------------------------------------------");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2),data>>2));
		 // ���� 32��Ʈ�� �ǿ��� ��Ʈ�� ��ȣ�� ǥ���մϴ�. ������ ����Ʈ ���꿡�� ���� �߰��Ǵ� ��Ʈ��
		 // ���� : ������ ����Ʈ �Ҷ� ��ȣ�� ������� ���ʿ� �߰��Ǵ� ��Ʈ�� 0���� �ؾߵɶ����� >>> �������� �մϴ�.
		 
		 System.out.println("\n5. ������ >>");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>>2),data>>>2));
		 
		 int n = (byte)0xffffffff;
		 data = 100;
		 //���� ������ and �� �� and ���϶��� ����� ��, ������ or�� ���� or �����϶��� ����� ����
		 // ��Ʈ���� and�� 1&1�϶��� ����� 1, ��Ʈ���� or �� 0 or 0 �϶��� ����� 0
		 System.out.println("\n6. &�� bit and ����");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(n),n));
		 System.out.println("-----------------------------------------------------");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data & n),data&n));
		 
		 System.out.println("\n7. |�� bit or ����");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(n),n));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data | n),data|n));
		 
		 
	}

}
