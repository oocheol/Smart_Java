package ���ǹ�;

import java.util.Scanner;

public class Ex03if������ {

	public static void main(String[] args) {

		// ����ó����� ���� 60�� �̻� "�հ��Դϴ�"
		// ������ �Է¹޾Ƽ� 60�� �̻����� �Ǻ�
		
		// 1. �Է��ϴ� ���� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		// 2. score��� ���� ���� �Է��� ���� �����ϱ�
		System.out.print("������ �Է��ϼ��� >> ");
		int score = sc.nextInt();
		
		// 3. ���ǹ�
		// ���ǽ� : score 60�� �̻�
		// �����ڵ� : "�հ��Դϴ�."
		if (score >= 60) {
			System.out.println("�հ��Դϴ�.");
		}
		
		
		
	}

}
