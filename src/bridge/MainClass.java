package bridge;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

	static int stage=16;//16�ܰ踦 �����Ѵ�.
	
	public static void main(String[] args) {
		
		//��¡�� ������ �ٸ� �ǳʱ�
		//�ǳʾ� �� �ٸ��� 16���� �ִ�.
		//ù��° �ٸ���Ʈ �����ؼ� ���������� ���� �������� ������ ����
		//�� �߿� ��ȭ ������ �����ϸ� �ι�° �ٸ�
		//��ȭ ������ ������ ���ϸ� ���� -1(������ ������ ����)
		//...������ 16�� �ٸ��� �� �ǳʸ� ���.
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		while(stage>0) {
			
			int yuri =rd.nextInt(2)+1;
			
			System.out.print("[�����ǼҸ�]�������� ���� ���������� ����..? ����(1) ������(2): ");
			int input = sc.nextInt();
			
			if(yuri==input) {
				stage--;
				System.out.println("[������ �Ҹ�] ��.. �����̴�.");
			}else {
				System.out.println("����â");
				System.out.println("������ ����Ǿ����ϴ�.");
				break;
			}	
			
			
		}
		
		System.out.println("���ϵ帳�ϴ�. �������������� �Ѿ�ðڽ��ϴ�.");
	}
}
