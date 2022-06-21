package koreait.day08;

public class Score {
	private int korean;
	private int english;
	private int science;
	private String grade;	//getter, setter 작성해보기
					// 값 예시: A+,a+b등등
	
	// 기본생성자 숨어있스빈다. 어떤 코드 일까요? 접근한정자는 
	
	public Score() {
		
	}
	
	public void setScience(int science) {
		this.science = science;
	}
	
	public int getScience() {
		return science;
	}
	
	void setKorean(int korean) {
		this.korean=korean;
		//메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장.(대입)
		//this는  setKorean메소드 실행객체
	}
	int getKorean() {
		return korean;
	}
	void setEnglish(int english) {
		this.english=english;{
		}
	}
	int getenglish() {
			return english;
		}
	void setGrade(String grade) {
		this.grade = grade;
	}
	
	String getGrade() {
		return grade;
	}





}

