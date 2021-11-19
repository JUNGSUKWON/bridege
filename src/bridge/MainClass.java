package bridge;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

	static int stage=16;//16단계를 가야한다.
	
	public static void main(String[] args) {
		
		//오징어 게임의 다리 건너기
		//건너야 될 다리가 16개가 있다.
		//첫번째 다리부트 시작해서 오른쪽으로 갈지 왼쪽으로 갈지를 선택
		//둘 중에 강화 유리를 선택하면 두번째 다리
		//강화 유리를 선택을 안하면 생명 -1(생명의 갯수를 설정)
		//...마지막 16개 다리를 다 건너면 산다.
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		while(stage>0) {
			
			int yuri =rd.nextInt(2)+1;
			
			System.out.print("[마음의소리]왼쪽으로 갈까 오른쪽으로 갈까..? 왼쪽(1) 오른쪽(2): ");
			int input = sc.nextInt();
			
			if(yuri==input) {
				stage--;
				System.out.println("[마음의 소리] 휴.. 다행이다.");
			}else {
				System.out.println("와장창");
				System.out.println("게임이 종료되었습니다.");
				break;
			}	
			
			
		}
		
		System.out.println("축하드립니다. 다음스테이지로 넘어가시겠습니다.");
	}
}
