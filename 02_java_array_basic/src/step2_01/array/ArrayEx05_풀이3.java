package step2_01.array;

import java.util.Scanner;

/**
* 24-05-19
* 배열 학생성적관리 프로그램[2단계]
* @author 윤성희
*
*/
/*
 * # 배열 기본문제
 */
/*
 * # 학생성적관리 프로그램[2단계] : 학생검색
 */

public class ArrayEx05_풀이3 {

	public static void main(String[] args) {
	
		// 인덱스    0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};
		
		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1	성적 : 11점
		Scanner scan = new Scanner(System.in);
		System.out.print("인덱스 입력 :");
		int index = scan.nextInt();
		
		System.out.print("성적 : " + arr[index]);
		
		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적 입력 : 11		인덱스 : 1
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		System.out.print("\n성적 입력 : ");
		int score = scan.nextInt();
		index = 0;
		for (int i = 0; i < scores.length; i++) {
			if (score == scores[i]) {
				index = i;
				System.out.print("인덱스 : " + index);
			}
		}
		
		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003	성적 : 45점
		System.out.print("\n학번 입력 : ");
		int hakbun = scan.nextInt();
		
		for (int i = 0; i < hakbuns.length; i++) {
			if (hakbun == hakbuns[i]) index = i;
		}
		System.out.print("성적 : " + scores[index] + "점");
	}
	
}
