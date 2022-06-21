package koreait.day14;

import java.util.Arrays;
import java.util.Random;

import koreait.day12.Member;

public class C59_ArraySortEx3{

	public static void main(String[] args) {
		//Member 객체를 age필드값 오름차순으로 정렬합니다.
		Member[] members = new Member[5];
		
		members[0] = new Member("사나",23);
		members[1] = new Member("가나",15);
		members[2] = new Member("나나",29);
		members[3] = new Member("미나",23);
		members[4] = new Member("쯔위",12);

		System.out.println("sort 전 : " + Arrays.toString(members));
		
		for(int i=0;i<members.length;i++) {
			//i=datas.length-1 일때 즉 마지막 인덱스 일때는 아래 for문은 조건식이 처음부터 거짓이므로 실행안합니다.
			
			for(int k=i+1;k<members.length;k++) {
				if(members[i].getAge()>members[k].getAge()) {  //i가 기준 인덱스 , k는 비교 인덱스
					Member temp = members[k];	//Member 객체의 참조값 교환
					members[k]=members[i];
					members[i]=temp;
				}
			}
			System.out.println("i=" + i + ", 중간결과 : " + Arrays.toString(members));
		}
		System.out.println("sort 후 : " + Arrays.toString(members));
	}

}