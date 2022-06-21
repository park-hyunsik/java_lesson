package koreait.day17;

public class Score {
	private String name;
	private int korean;
	private int english;
	private int science;
	private String grade;	//getter, setter �ۼ��غ���
					//�� ����: A+,A,B+,B....
	
	//�⺻������ ���� �ֽ��ϴ�.� �ڵ� �ϱ��? ���������ڴ� public
	public Score()  {
	}
	
	
	public Score(String name, int korean, int english,int science) {
		this.name=name;
		this.korean=korean;
		this.english=english;
		this.science=science;
		
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", korean=" + korean + ", english=" + english + ", science=" + science
				+ ", grade=" + grade + "]";
	}
	
	//�ν��Ͻ� �޼ҵ� 
	public int sum() {
		int result = this.korean+this.english+this.science;
		return result;
		
	}
	public double average() {
		return (double)sum()/3;
	}
	//setter �� �����ϱ� : ���೻��� ���������� �ʿ信���󼭴� ���������ڸ� private ���ε� �Ҽ��ֽ��ϴ�.
	public void setGrade() {
		if(average() >=90)this.grade="A+";
		else if(average() >=80)this.grade="B";
		else if(average() >=70)this.grade="C";
		else if(average() >=60)this.grade="D";
		else this.grade="F";
	}
	String getGrade() {
		setGrade();
		return grade;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	void setScience(int science) {
		this.science = science;
	}
	
	int getScience() {
		return science;
	}
	
	void setKorean(int korean) {
		this.korean=korean;
		//�޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� �������� korean�� ����(����)
		//this�� setKorean�޼ҵ� ���ఴü
	}
	
	int getKorean() {
		return korean;
	}
	
	
	void setEnglish(int english) {
		this.english = english;
	}
	
	int getEnglish() {
		return english;
	}
	

	

	
}
