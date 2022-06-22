package koreait.ext;

public class BinaryOP {

	public static void main(String[] args) {

		//2진수의 비트 연산 : & , |, ^ , ~ , >> , << 등등 간단히 테스트
		int data = 0b0101110100100110;

		System.out.println("\n1. ~ (비트 반전) 연산결과");	//참고 : !연산은 true와 false를 반대로 boolean연산
		 System.out.println(String.format("%32s", Integer.toBinaryString(data)));
		 System.out.println(String.format("%32s", Integer.toBinaryString(~data)));
		
		 System.out.println("\n2.>>은 오른쪽 쉬프트 연산");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1),data>>1));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2),data>>2));
		 // >>1은 나누기2한 결과 값.
		 
		 System.out.println("\n3.<<은 왼쪽 쉬프트 연산");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<1),data<<1));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<2),data<<2));
		 // <<1은 곱하기2한 결과값.
		 
		 data = -2345;
		 System.out.println("\n4. 음스값 >>");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1),data>>1));
		 System.out.println("-----------------------------------------------------");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2),data>>2));
		 // 정수 32비트의 맨왼쪽 비트는 부호를 표시합니다. 오른쪽 쉬프트 연산에서 왼쪽 추가되는 비트는
		 // 참고 : 오른쪽 쉬프트 할때 부호와 상관없이 왼쪽에 추가되는 비트를 0으로 해야될때에는 >>> 연산으로 합니다.
		 
		 System.out.println("\n5. 음스값 >>");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>>2),data>>>2));
		 
		 int n = (byte)0xffffffff;
		 data = 100;
		 //참고 논리연산 and 는 참 and 참일때만 결과가 참, 논리연산 or는 거짓 or 거짓일때만 결과가 거짓
		 // 비트연산 and는 1&1일때만 결과가 1, 비트연산 or 는 0 or 0 일때만 결과가 0
		 System.out.println("\n6. &는 bit and 연산");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(n),n));
		 System.out.println("-----------------------------------------------------");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data & n),data&n));
		 
		 System.out.println("\n7. |는 bit or 연산");
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(n),n));
		 System.out.println(String.format("%32s %d", Integer.toBinaryString(data | n),data|n));
		 
		 
	}

}
