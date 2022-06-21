package koreait.day13a;

public class User implements Comparable<User>{
	private String name;
	private int age;
	
	public User(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int compareTo(User o) {	//���� ��ü�� age�� ���ڰ� age��
		Integer o1 = this.age;
		Integer o2 = o.getAge();
		return o1.compareTo(o2);//��������
	}


	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}	
}