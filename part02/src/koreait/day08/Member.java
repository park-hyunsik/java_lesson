package koreait.day08;
//�ۼ��� : ������
public class Member {
	private String name;
	private String email;
	private int age;
	private int level;
	
	//�⺻(default)������  : ��¹� �߰�
	/*
	 * public Member(){ System.out.println("name,email,age,level �ʵ�� �⺻���Դϴ�.");
	 * System.out.println("name =" + this.name);//this �� �޼ҵ带 �����ϴ� ��ü
	 */

	public Member(String name,String email) {	//() �ȿ��� �����Ҷ� ���޹��� ����
		this.name=name;	
		this.email=email;	

	}
	//Ŀ���� ������ : name, email  �ʵ� �ʱ�ȭ
	/*public Member(String name,String email){	//()  �ȿ��� �����Ҷ� ���޹��� ����
		this.name=name;
		this.email=email;
	}
	*/
	//������ �޼ҵ� : Ÿ�԰� ���ڰ����� ������ ������ �Ǿ�� �޼ҵ� �����ε�
	
	/*
	 * 
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setlevel(int level) {
		this.level = level;
	}
	
	public int getlevel() {
		return level;
		}

	}




/*
 * Member Ŭ���� �����ϼ���.
 * �ʵ� : �Ʒ��� ������ Ŭ������ ���м��� �ݿ��� ���� �����ڷ� �մϴ�.
 * name, email , age ,level 
 * ������ : name, email�ʵ� �ʱ�ȭ�ϴ� Ŀ���� ������(public)
 * �⺻�����ڴ� "name,email,age,level �ʵ�� �⺻���Դϴ�."�� ����ϴ� ��ɹ� �߰�
 * �޼ҵ� : getter , setter�޼ҵ�(public)
 * 
 */
