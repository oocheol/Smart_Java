package ���ǹ�;

import java.util.Scanner;

public class Ex05ifelse�� {

	public static void main(String[] args) {
		
		// 1. �Է¹޴� ���� ��������
		Scanner sc = new Scanner(System.in);
		// java���� �ڵ��ϼ� ����Ű ctrl + space
		
		System.out.print("������ �Է��ϼ��� >> ");
		
		// 2. ������ �����͸� ���� grade�� �Է¹ޱ�
		int grade = sc.nextInt();
		
		// 3. grade�� 60�� �̻��̶��(���� �Ǵ�)
		if (grade >= 60) {
			// 4. �հ��Դϴ�. ���
			// ���ǽ��� true���� �� ����Ǵ� ����
			System.out.println("�հ��Դϴ�");
		}
		else {
			// 5. �׷��� ���� ���(���������� ��Ȳ)
			// ���հ��Դϴ�. ���
			// ���ǽ��� false���� �� ����Ǵ� ����
			System.out.println("���հ��Դϴ�.");
		}
		
	}

}
