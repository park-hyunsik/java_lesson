package koreait.ext;

public class BinaryTest {

	public static void main(String[] args) {

		System.out.println("10진수\t 2진수 \t 16진수");
		for(int i=0 ; i<100; i++) {
			System.out.println(String.format("%d\t %s\t %s", i,Integer.toBinaryString(i),
					Integer.toHexString(i)));
		}
		
		
		
		
		
	}

}
