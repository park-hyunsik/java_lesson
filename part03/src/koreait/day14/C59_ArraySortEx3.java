package koreait.day14;

import java.util.Arrays;
import java.util.Random;

import koreait.day12.Member;

public class C59_ArraySortEx3{

	public static void main(String[] args) {
		//Member ��ü�� age�ʵ尪 ������������ �����մϴ�.
		Member[] members = new Member[5];
		
		members[0] = new Member("�糪",23);
		members[1] = new Member("����",15);
		members[2] = new Member("����",29);
		members[3] = new Member("�̳�",23);
		members[4] = new Member("����",12);

		System.out.println("sort �� : " + Arrays.toString(members));
		
		for(int i=0;i<members.length;i++) {
			//i=datas.length-1 �϶� �� ������ �ε��� �϶��� �Ʒ� for���� ���ǽ��� ó������ �����̹Ƿ� ������մϴ�.
			
			for(int k=i+1;k<members.length;k++) {
				if(members[i].getAge()>members[k].getAge()) {  //i�� ���� �ε��� , k�� �� �ε���
					Member temp = members[k];	//Member ��ü�� ������ ��ȯ
					members[k]=members[i];
					members[i]=temp;
				}
			}
			System.out.println("i=" + i + ", �߰���� : " + Arrays.toString(members));
		}
		System.out.println("sort �� : " + Arrays.toString(members));
	}

}