package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class Ex06Plus���� {

	public static void main(String[] args) {

		// ������ ���� �̾Ƴ��� ���
		// 1. ������ ���� �������ִ� ������������!
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===Plus Game===");
		
		while (true) {
			// 2. ������ �� �����ϱ�
			// 1~9���� ��������
			// 1. �������� ���� 2���� �̾ƿ���
			// 1~9������ ������ ���� �������ֱ�
			int ranNum = ran.nextInt(9) + 1; // 1~9
			int ranNum_2 = ran.nextInt(9) + 1; // 1~9

			// 2. ������ ���
			System.out.print(ranNum + "+" + ranNum_2 + "=");

			// 3. ����ڷκ��� ���� �Է�
			int input_num = sc.nextInt();

			// 4. �Է¹��� ���� ���� ������ ��ġ�ϴ��� ���� �Ǵ�
			int answer = ranNum + ranNum_2;

			if (answer == input_num) {
				// 5. ��ġ�ϸ� ����! ���
				System.out.println("Success");
			} else {
				// 6. ��ġ���� ������ ����! ���
				System.out.println("Fail");
				System.out.print("��� �Ͻðڽ��ϱ�? >> ");
				String input_str = sc.next();
				if (input_str.equals("Y")) {
					// ���ڿ��� ������ ���ϱ� ���ؼ���
					// .equals(���ϰ� ���� ���ڿ�) ���!
					// !str.equals (���������� ���� Ȯ��)
					continue; // �ݺ����� ������ ���� ����ؼ� �����϶�� Ű����!
					// while���� ���������� ���ư��� �ȴ�!
				} else {
					System.out.println("�����մϴ�.");
					break;
				}
				
			}
		}
		
		

	}

}
