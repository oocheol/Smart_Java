package �ݺ���;

import java.util.Scanner;

public class Ex04while������ {

	public static void main(String[] args) {

		// 1. �Է��ϴ� ���� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		// 1) ���ǽ� : num != -1 (-1�� �ƴϸ� ��� �ݺ�������)
//		int num = 0;
//		int sum = 0;
//		while(num != -1) {
//			System.out.print("���� �Է�: ");
//			num = sc.nextInt();
//			sum += num;
//			System.out.println("�������: "+sum);
//		}
		
		int sum = 0;
		while (true) {
			System.out.print("���� �Է�: ");
			int num = sc.nextInt();
			sum += num;
			System.out.println("�������: "+sum);
			
			if (num == -1) {
				break;
			}
			
		}
		System.out.println("����Ǿ����ϴ�.");
		
		
		
		
		
		
		
		
		
	}

}
