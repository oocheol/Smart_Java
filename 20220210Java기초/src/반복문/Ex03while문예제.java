package �ݺ���;

import java.util.Scanner;

public class Ex03while������ {

	public static void main(String[] args) {

		// 1. �Է��ϴ� ���� ���������
		Scanner sc = new Scanner(System.in);
		
		// 2. while�� : ���ǽ�, �����ڵ�
		// ���� : ���� �Է��� ���ڰ� 10���� ������
		// 		 �ݺ��� ���ٰſ���
		// �����ڵ� : �����Է� : ________;
		
		// ���ǽ� : ���� �Է��� ������ 10���� �۴ٸ� ����ؼ� �ݺ�
		
		// while���� �ݺ��ϴ� Ƚ���� ���������� ������ ����մϴ�.
//		int num = 0;
//		
//		while(num < 10) {
//			System.out.print("���� �Է� : ");
//			num = sc.nextInt();
//		}
		
		while(true) {
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			// num�� 10���� ū���� �Ǵ� ---> ���ǹ�
			if (num > 10) {
				break;
			}
		}
		
		// 3. �ݺ����� Ż���ϰ���
		// ��¹� �ۼ��ϱ� ( "����Ǿ����ϴ�." )
		System.out.println("����Ǿ����ϴ�.");
		
		
		
		
		
		
		
		
	}

}
