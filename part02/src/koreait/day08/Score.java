package koreait.day08;

public class Score {
	private int korean;
	private int english;
	private int science;
	private String grade;	//getter, setter �ۼ��غ���
					// �� ����: A+,a+b���
	
	// �⺻������ �����ֽ����. � �ڵ� �ϱ��? ���������ڴ� 
	
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
		//�޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� �������� korean�� ����.(����)
		//this��  setKorean�޼ҵ� ���ఴü
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

