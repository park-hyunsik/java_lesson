package koreait.day07;

//39��ȣ ����
public class Student {

		int no;
		String name;
		int grade;
		Score score;		//�ٸ� Ŭ���� ��ü�� �ʵ�(�������)�� ���Ե˴ϴ�.
		
		//���ڷ� ���޹��� ���� ��������(�ʵ�-��ü�� Ư���� ��Ÿ���� �������)�� ����.
		void setData(String name, int grade) {
			this.name=name;
			this.grade=grade;
		}
		
		@Override
		public String toString() {
			return "Student [no=" + no + ", name=" + name + ", grade=" + grade + ", score=" + score + "]";
		}
		
}
