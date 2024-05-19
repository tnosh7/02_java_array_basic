package step2_01.array;

import java.util.Scanner;

/**
* 24-05-19
* 배열 학생성적관리 프로그램[3단계]
* @author 윤성희
*
*/
/*
 * # 학생성적관리 프로그램[3단계] : 예외처리
 */



public class ArrayEx06_풀이3 {

	public static void main(String[] args) {
		
		int[] studentNums = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 입력 : ");
		int studentNum = scan.nextInt();
		int index= -1;
		for (int i = 0; i < scores.length; i++) {
			if (studentNum == studentNums[i]) index = i;
		}
		if (index != -1) System.out.println("성적 : " + scores[index] + "점");
		else System.out.println("해당학번은 존재하지 않습니다.");
	}
	
}
