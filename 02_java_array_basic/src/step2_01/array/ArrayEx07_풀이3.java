package step2_01.array;
/**
* 24-05-19
* 배열 학생성적관리 프로그램[4단계]
* @author 윤성희
*
*/
/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */


public class ArrayEx07_풀이3 {

	public static void main(String[] args) {
		
		int[] stduentNums = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		int maxNum = 0;
		int maxIndex = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (maxNum  < scores[i]) {
				maxIndex = i;
				maxNum = scores[i];
			}
		}
		System.out.println(stduentNums[maxIndex] + "번(" + scores[maxIndex] + "점)");
		
	}
	
}
