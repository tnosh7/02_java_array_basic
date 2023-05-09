package step2_01.array;

import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 최종
 * 
 *  19번 20번 21번의 문제를 한 코드로 병합하여 보세요.
 * 
 * 1) 추가
 * 2) 삽입
 * 3) 삭제
 * 
 *  정답 없음
 */


public class ArrayEx22_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10 , 20 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		while (true) {
			
			System.out.println("\n1추가");
			System.out.println("2삽입");
			System.out.println("3삭제");
			System.out.println("4종료\n");
			System.out.print("입력 : ");
			selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				System.out.println("추가할 값을 입력 = ");
				int num = scan.nextInt();
				
				if (elementCnt == arr.length) {
					System.out.println("더이상 추가할 수 없습니다.");
					continue;
				}
			
				arr[elementCnt] = num;
				elementCnt++;
			}
			else if (selectMenu == 2) {
				System.out.println("삽입할 위치를 입력 = ");
				int input = scan.nextInt();
					if (input < 0 || input > arr.length) {
						System.out.println("다시 입력해주세요.");
						continue;
					}
					System.out.println("삽입할 값을 입력 = ");
					int inputNum = scan.nextInt();
					
					for (int j = elementCnt; j > input ; j--) {
						arr[j] = arr[j-1];
						elementCnt++;
					}
			}
			else if (selectMenu == 3) {
				System.out.println("삭제할 위치를 입력 = ");
				int del = scan.nextInt();
					if (del < 0 || del > arr.length ) {
						System.out.println("다시 입력해주세요.");
						continue;
					}
					System.out.println("삭제할 값을 입력 = ");
					int delNum = scan.nextInt();
					
					for (int i = elementCnt; i < arr.length; i++) {
						arr[i] = arr[i+1] ;
						elementCnt++;
					}
			}
			
		}
		
	}
	
}
