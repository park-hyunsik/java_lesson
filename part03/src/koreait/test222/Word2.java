package koreait.test222;

public class Word2 {
	private String english;
	private String korean;
	private int level;
	
	
	
	public Word2(String eng, String kor) {
	}
	@Override
	public String toString() {
		return english + " " +korean +" "+ level;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getKorean() {
		return korean;
	}
	public void setKorean(String korean) {
		this.korean = korean;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
