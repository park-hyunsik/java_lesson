package koreait.day08;
//작성자 : 박현식
public class Member {
	private String name;
	private String email;
	private int age;
	private int level;
	
	//기본(default)생성자  : 출력문 추가
	/*
	 * public Member(){ System.out.println("name,email,age,level 필드는 기본값입니다.");
	 * System.out.println("name =" + this.name);//this 는 메소드를 실행하는 객체
	 */

	public Member(String name,String email) {	//() 안에는 실행할때 전달받을 인자
		this.name=name;	
		this.email=email;	

	}
	//커스텀 생성자 : name, email  필드 초기화
	/*public Member(String name,String email){	//()  안에는 실행할때 전달받을 인자
		this.name=name;
		this.email=email;
	}
	*/
	//생성자 메소드 : 타입과 인자갯수를 가지고 구별이 되어야 메소드 오버로딩
	
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
 * Member 클래스 정의하세요.
 * 필드 : 아래와 같으며 클래스의 은닉성을 반영한 접근 한정자로 합니다.
 * name, email , age ,level 
 * 생성자 : name, email필드 초기화하는 커스텀 생성자(public)
 * 기본생성자는 "name,email,age,level 필드는 기본값입니다."를 출력하는 명령문 추가
 * 메소드 : getter , setter메소드(public)
 * 
 */
