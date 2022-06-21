package koreait.day08;

public class MemberTest {

	public static void main(String[] args) {
		//Member momo = new Member();
				
		Member nana = new Member("ÃÖ³ª³ª" , "nana@gmail.com");
		System.out.println("nana name = " + nana.getName());
		nana.setAge(26);
		System.out.println("nana age = " + nana.getAge());
	}

}


