package koreait.day14;


public class C57_ArraySortEx {

	//배열에 저장된 값 정렬하기 직접 구현하세요.
	public static void main(String[] args) {

		String[] names = {"제니","다현","나연","신비","은하","모모"};
		
		for(int i = 0; i < names.length-1; i++) {
			for(int k =i +1; k< names.length; k++)
				if(names[i].compareTo(names[k])>0) {
					String temp = names[i];
					names[i] = names[k];
					names[k]	= temp;
				
		}
		
	}
		for(int i = 0; i< names.length; i++) {
			System.out.printf("%s ,",names[i]);
}

	}
}