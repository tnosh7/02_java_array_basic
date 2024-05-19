package step2_01.array;
/**
* 24-05-19
* Array 숫자이동[1단계]
* @author 윤성희
*
*/
import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

public class ArrayEx14_풀이3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int player = 0;
		
		for (int i=0; i < game.length; i++) {
			if (game[i] == 2) {
				player = i;
			}
		}
		while (true) {
			for (int i = 0; i < game.length; i++) {
				if (game[i] == 2) System.out.print("옷");
				else System.out.print(" _ ");
			}
			System.out.print("\n숫자 입력 왼(1), 오(2) : ");
			int move = scan.nextInt();
			System.out.println();
			if (move == 1) {
				game[player] = 0;
				player -= 1;
				game[player] = 2;
			}
			else if (move == 2) {
				game[player] = 0;
				player += 1;
				game[player] = 2;
			}
			if (player==0 || player== game.length-1) {
				System.out.println("도달");
				break;
			}
			
		}
	}
	
}
