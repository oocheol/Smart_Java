package switch��;

import java.util.Scanner;

public class Ex02switch�ǽ�2_T {

	public static void main(String[] args) {
		// 1. ���� ��������
		Scanner sc = new Scanner(System.in);
		// 2. �����Է� ����ϱ�
		System.out.print("���� �Է� : ");
		// 3. �����Է¹ޱ�
		int totalScore = sc.nextInt();

		// 4. ��������ϱ�
		// ���� - 90�� �̻� A
		// 80�� �̻� 90�� �̸� B
		// 70�� �̻� 80�� �̸� C
		// 70�� �̸� D
		char grade = 'A';
		switch (totalScore / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break; // ���� �����ִ� ����Ű --> ctrl + shift + f
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'D';

		}

		// alt �����鼭 ȭ��ǥ �̵��ϸ� �ڵ� �̵� ����~
		// ctrl + alt �����鼭 ȭ��ǥ �̵��ϸ� �ڵ� ���� ����~
		System.out.println(grade + "�����Դϴ�!");
		
	}

}
