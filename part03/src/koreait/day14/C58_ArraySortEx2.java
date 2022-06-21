package koreait.day14;


public class C58_ArraySortEx2 {

	//배열에 저장된 값 정렬하기 직접 구현하세요.
	public static void main(String[] args) {

		int[] array = {34,77,19,56,45,9};
		
		for(int i = 0; i < array.length-1; i++) {
			for(int k =i+1; k< array.length; k++)
				if(array[i] > array[k])
				//int temp = array[i];
				array[i] = array[k];
				//array[k]	= temp;
						
			System.out.printf("%d\n",array[i]);
		}
		
	}

}
