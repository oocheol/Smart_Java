package ���ǹ�;

import java.util.Scanner;

public class Ex02if������ {

	public static void main(String[] args) {

		// 1. �Է��ϴ� ���� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		// 2. ���̸� �Է¹ޱ�
		// Ű����� �Է¹��� ���� age ������ ����
		System.out.print("���̸� �Է����ּ���>> ");
		int age = sc.nextInt(); 
		
		// ���ǹ�
		// ���ǽ� : �����̶��(age 20�̻�)
		// ���๮�� : ������ �����Ѵٸ� "�����Դϴ�." ���ڿ� ���
		if (age >= 20) {
			System.out.println("�����Դϴ�.");
		}
		
		
	}

}
