package ���ǹ�;

import java.util.Scanner;

public class Ex04if������ {

	public static void main(String[] args) {

		// �Է��� ������ 3�� ����̸鼭 5�� ��� (�� �ΰ����� ������Ű��)
		// "3�� ����̸鼭 5�� ����Դϴ�."
		
		// 1. �Է��ϴ� ���� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		// 2. num�� �Է¹��� ���� ����
		System.out.print("������ �Է��ϼ��� >> ");
		int num = sc.nextInt();
		
		// 3. num�� 3�� ����̷��� , num % 3 == 0
		// num�� 5�� ����̷���, num % 5 == 0
		// AND ������ ----> true && true ===> ture��� �����
		// ���ǽ� : num�� 3�� ����� �ǰ�, 5�� ����� �Ǵ��� �Ǵ�
		// �����ڵ� : "3�� ����̸鼭 5�� ����Դϴ�."
		if (num%3==0 && num%5==0) {
			System.out.println("3�� ����̸鼭 5�� ����Դϴ�.");
		}
		
		
		
	}

}
