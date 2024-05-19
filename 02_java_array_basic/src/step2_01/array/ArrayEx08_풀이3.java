package step2_01.array;

import java.util.Arrays;
import java.util.Random;

/**
* 24-05-19
* 배열 OMR카드
* @author 윤성희
*
*/
/*
 * # OMR카드
 * 
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 
 * 예)
 * answer  = {1, 3, 4, 2, 5}
 * hgd     = {1, 1, 4, 4, 3}
 * 정오표  = {O, X, O, X, X}
 * 성적    = 40점
 */


public class ArrayEx08_풀이3 {

	public static void main(String[] args) {
		
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		int cnt   = 0;
		Random ran = new Random();
		for (int i = 0; i < hgd.length; i++) {
			hgd[i] = ran.nextInt(5) + 1;
		}
		System.out.println("answer  = " + Arrays.toString(answer));
		System.out.println("hgd     = " + Arrays.toString(hgd));
		
		System.out.print("정오표  = [");
		for (int i = 0; i < hgd.length; i++) {
			if (answer[i] == hgd[i]) {
				System.out.print("O");
				cnt++;
			}
			else System.out.print("X");
			if (i < hgd.length -1) System.out.print(", ");
		}
		System.out.println("]");
		System.out.println("성적\t= " + cnt * 20 + "점");
	}
	
}
