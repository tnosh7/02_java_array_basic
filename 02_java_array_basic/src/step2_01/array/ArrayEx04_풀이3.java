package step2_01.array;

import java.util.Random;

/**
* 24-05-19
* 배열 학생성적관리 프로그램[1단계]
* @author 윤성희
*
*/
/*
 * # 배열 기본문제
 */
/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */


public class ArrayEx04_풀이3 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Random ran = new Random();
		
		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int total = 0;
		double avg = 0.0;
		
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		avg = total / arr.length;
		System.out.println("총점(" + total + ")\t평균(" + avg + ")");
		
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 60) cnt++;
		}
		System.out.println("합격생 수 : " + cnt + "명");
		

	}
	
}
