package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
		
		String message ="hello~";	//java.lang.String (기본패키지 클래스)

		int len = message.length();
		char temp = message.charAt(3);
		boolean isState = message.equals("hello~");
		
		System.out.println("length() = " + len);
		System.out.println("charAt(3) = " + temp);
		System.out.println("equals(\"hello\") = " + isState);
		
		System.out.println("message.indexOf('e')" + message.indexOf('e')); //1번위치
		System.out.println("message.indexOf(\"lo\")" + message.indexOf("lo"));//3번위치
		
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") = "+test.indexOf("lo") );
		System.out.println("test.lastIndexOf(\"lo\") = "+test.lastIndexOf("lo"));
		
		
		System.out.println("message.substring(2);" + message.substring(2)); //부분추출 : llo~
		System.out.println("message.substring(2, 4)" + message.substring(2, 4));//ll, 2번부터 2개(4-2)
		System.out.println("startsWith(\"H\") =" +message.startsWith("H"));//
		System.out.println("endWith(\"~\")= "+message.endsWith("~"));
		
	}

}

//String 클래스의 메소드는 많습니다. 다 외우고 사용하는 것이 아니고 메소드의 이름,인자,리턴형식을 참조해서 사용합니다. 
//리턴값 형식은?		
/*
message.length();		//public int length() : 길이
message.charAt(0);		//public char charAt(int index)

message.equals("Hello~");   //public boolean equals(Object anObject) , Object는 모든 타입
							//message 가 String 타입이므로 Object 는 String으로 해석합니다.
message.indexOf('e');		//int
message.indexOf("lo");		
message.substring(2);		//String
message.substring(2, 4);
message.replace("ll", "*@");   //String
*/		
//메소드 오버로딩(overloading) : 
