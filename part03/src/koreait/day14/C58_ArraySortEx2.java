package koreait.day14;


public class C58_ArraySortEx2 {

	//�迭�� ����� �� �����ϱ� ���� �����ϼ���.
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
