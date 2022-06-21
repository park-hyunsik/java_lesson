package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
		
		String message ="hello~";	//java.lang.String (�⺻��Ű�� Ŭ����)

		int len = message.length();
		char temp = message.charAt(3);
		boolean isState = message.equals("hello~");
		
		System.out.println("length() = " + len);
		System.out.println("charAt(3) = " + temp);
		System.out.println("equals(\"hello\") = " + isState);
		
		System.out.println("message.indexOf('e')" + message.indexOf('e')); //1����ġ
		System.out.println("message.indexOf(\"lo\")" + message.indexOf("lo"));//3����ġ
		
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") = "+test.indexOf("lo") );
		System.out.println("test.lastIndexOf(\"lo\") = "+test.lastIndexOf("lo"));
		
		
		System.out.println("message.substring(2);" + message.substring(2)); //�κ����� : llo~
		System.out.println("message.substring(2, 4)" + message.substring(2, 4));//ll, 2������ 2��(4-2)
		System.out.println("startsWith(\"H\") =" +message.startsWith("H"));//
		System.out.println("endWith(\"~\")= "+message.endsWith("~"));
		
	}

}

//String Ŭ������ �޼ҵ�� �����ϴ�. �� �ܿ�� ����ϴ� ���� �ƴϰ� �޼ҵ��� �̸�,����,���������� �����ؼ� ����մϴ�. 
//���ϰ� ������?		
/*
message.length();		//public int length() : ����
message.charAt(0);		//public char charAt(int index)

message.equals("Hello~");   //public boolean equals(Object anObject) , Object�� ��� Ÿ��
							//message �� String Ÿ���̹Ƿ� Object �� String���� �ؼ��մϴ�.
message.indexOf('e');		//int
message.indexOf("lo");		
message.substring(2);		//String
message.substring(2, 4);
message.replace("ll", "*@");   //String
*/		
//�޼ҵ� �����ε�(overloading) : 
