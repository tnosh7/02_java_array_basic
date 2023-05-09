package step2_01.array;

import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

public class ArrayEx12_풀이 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}

		System.out.println("인덱스1 입력 : ");
		int num1 = scan.nextInt();

		System.out.println("인덱스2 입력 : ");
		int num2 = scan.nextInt();
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if (i == num1) {
				arr[i] = arr[num1] ; 
			}
			else if (i == num2) {
				arr[i] = arr[num2] ;
			}
			break;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			break; 
		}
		
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//        값2 입력 : 50
		//		  {50, 20, 30, 40, 10}
		
		num1 = 0; 
		num2 = 0; 
		
		System.out.println("값1 입력 : ");
		num1 = scan.nextInt();
		System.out.println("값2 입력 : ");
		num2 = scan.nextInt();
		
		int change1 = 0;
		int change2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num1) {
				change1 = i;
				 
				if (arr[i] == num2) {
				}
			}
		}
		System.out.println(arr[change1]);
		System.out.println(arr[change2]);
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		System.out.println("학번1 입력 = " );
		int hakbun1 = scan.nextInt();

		System.out.println("학번2 입력 = " );
		int hakbun2 = scan.nextInt();
		
		int num = 0; 
		int num10 = 0; 
		
		for (int i = 0; i < hakbuns.length; i++) {
			if (hakbun1 == i) {
				num1 = i;
			}
			else if (hakbun2 == i) {
				num2 = i; 
			}
		}
		for (int i = 0; i < scores.length; i++) {
			if (num1 == i) {
				scores[i] = scores[num1]; 
			}
			else if (num2 == i) {
				scores[i] = scores[num2];
			}
		System.out.println(scores[i]);
		}
		
		
		
		
	}
	
}
