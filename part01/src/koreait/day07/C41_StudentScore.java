package koreait.day07;

public class C41_StudentScore {

	public static void main(String[] args) {

		
		Student[] stus = new Student[5];	//�迭��� 5�� Student ��ü(��5�� ����)
		String[] names = {"���ϴ�","����","�ڳ���","ȫ�浿","������"};
		
		stus[0] =new Student();
		stus[0].name = names[0];
		stus[0].no = 1;
		stus[0].grade=3;
		//for������ ������ 4�� ��ü�� �����ؼ� stus �迭��ҿ� ������ŵ�ô�.
		for(int i=1;i<stus.length;i++) {
			stus[i] =new Student();
			stus[i].name = names[i];
			stus[i].no = i+1;
			stus[i].grade=3;
		}
		//Ȯ���� ���� ���
		for(int i=0;i<stus.length;i++)
			System.out.println(stus[i]);
		
		//�� ������ Student ��ü�� Score ��ü�� �ʵ�� ������ �մϴ�.-> Score ��ü 3�� �ʵ尪 �Է� ����
		for(int i=0;i<stus.length;i++) {
			System.out.println(stus[i].name + " ���� �Է��ϼ���. ");
			/*
			 * Score temp = new Score(); temp.input(); stus[i].score = temp;
			 */	//***
			stus[i].score = new Score();
			stus[i].score.input();
			System.out.println(stus[i]);	//Ȯ��
			
		}
		
		System.out.println("[[���� ���]]");
		System.out.printf("%8s %10s %8s %8s\n","��ȣ","�̸�","����","���");
		for(int i=0;i<stus.length;i++)
			System.out.printf("%4d %6s %8d %5.1f\n",stus[i].no,stus[i].name,
					stus[i].score.sum(),stus[i].score.average());
	}
	
}
