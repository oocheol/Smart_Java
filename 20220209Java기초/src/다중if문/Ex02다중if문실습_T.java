package ����if��;

import java.util.Scanner;

public class Ex02����if���ǽ�_T {

	public static void main(String[] args) {
		
		// 1. �Է¹޴� ���� ��������
		Scanner sc = new Scanner(System.in);
		// 2. ���� �Է� : ���
		System.out.print("���� �Է� : ");
		// 3. ���ڵ����� �Է�
		int totalScore = sc.nextInt();
		// 4. ���� ���
		char grade = 'A';
		// ���� - 90�� �̻� : A
		if (totalScore >= 90) {
			grade = 'A';
		} else if (totalScore >= 80) {
			// 80�� �̻� 90�� �̸� : B
			grade = 'B';
		} else if (totalScore >= 70) {
			// 70�� �̻� 80�� �̸� : C
			grade = 'C';
		} else {
			// 70�� �̸� : D
			grade = 'D';
		}
		System.out.println(grade + "�����Դϴ�!");
		
		
		
		
		
		
		
		
	}

}
