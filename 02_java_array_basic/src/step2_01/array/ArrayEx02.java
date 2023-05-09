package step2_01.array;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		
		// 배열 사용 예시 1
		String[] test1 	= new String[3]; 
		double[] test2 	= new double[5];
		char[] test3 	= new char[1];
		boolean[] test4 = new boolean[10];
		int[] test5 	= new int[7];
		
		// 배열 사용 예시 2 : 축약형 ( 배열을 처음 생성할 때만 적용 가능)
		int [] arr1 = {10,20,30,40,50,60,70}; 
		String[] arr2 = {"한놈", "두시기", "석삼", "너구리"};
		char[] arr3 = {'o' , 'x', 'o', 'x', 'o'};
		boolean[] arr4 = {true, false, true};
		
		// arr1 = {100, 200, 300};
		// arr2 = {"일" , "이", "삼"} ;
		
		// 배열 사용예시 3 : 반복문과의 조합
		int[] arr5 = new int[100]; 
		
		for (int i = 0; i < arr5.length; i++) {
			arr5[i] = i + 1; 
		}
		
		// 데이터 출력 
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		// (참고) 배열이 익숙해진 후에 사용 
		// Arranys.toString(배열명) : 배열의 전체 요소 출력 
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		
		
		
	}
}
