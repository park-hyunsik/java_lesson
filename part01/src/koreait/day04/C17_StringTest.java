package koreait.day04;

public class C17_StringTest {

	public static void main(String[] args) {

		String name ="kim";		//������ ����(Ŭ���� Ÿ��)
		String name2="kim";
		String name3="lee";
		String name4 = new String("kim");
		
		System.out.println("nam == name2 ������ġ? " + (name==name2));
		System.out.println("nam == name4 ������ġ? " + (name==name4));
		System.out.println("nam2 == name4 ������ġ? " + (name2==name4));
		
		name2="son";
		System.out.println("nam == name2 ������ġ? " + (name==name2));
		
		System.out.println("name = " + name);
		System.out.println("name2 = " + name2);
		System.out.printf("name3 = %s\n" , name3);
		System.out.printf("name4 = %s\n" , name4);
		
		
		
		
	}

}

/*
 *			���ڿ� : ��ȣ "" �� ����ϸ� ���ڿ��Դϴ�.
 *					�ڹٿ����� �⺻�� ������ �ƴϰ� String Ŭ���� Ÿ������ ����մϴ�.
 *												���ʵ�,�޼ҵ� �̿��Ͽ� ���ڿ� ��� ��� 
 * 
 * 
 * 
 *
 *
 *
 */

