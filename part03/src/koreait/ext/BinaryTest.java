package koreait.ext;

public class BinaryTest {

	public static void main(String[] args) {

		System.out.println(String.format("%8s\t %8s\t %8s", "10����","2�μ�","16����"));
		for(int i=0 ; i<100; i++) {
			System.out.println(String.format("%8d\t %8s\t %8s", i,Integer.toBinaryString(i),
					Integer.toHexString(i)));
		}
		
		
		/*
		 * 
		 * 10���� �������� �ٸ� ������(����)���� ���ڿ� ��ȯ
		 * 
		 * Integer.toBinaryString(i) 2�����κ�ȯ
		 * Integer.toHexString		8�����κ�ȯ
		 * Integer.toOctalString(i)	16�����κ�ȯ
		 *
		 *
		 *int ������ 4����Ʈ 32��Ʈ 2������ 32�ڸ�. 16�����δ� 8�ڸ�,10�����δ� ������ -22147483648~2147483647
		 *													16�����δ� 00000000 ~ FFFFFFFF
		 *xxxx xxxx xxxx xxxx xxxx xxxx xxxx
		 */
		 
		
		
		
	}

}
