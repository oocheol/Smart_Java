package ���ǹ�;

import java.util.Scanner;

public class Ex06ifelse���ǽ�_T {

	public static void main(String[] args) {
		// 1. �Է¹޴� ���� ������
		Scanner sc = new Scanner(System.in);
		
		// 2. �������忡 ���� �� ȯ���մϴ�! ���
		System.out.println("====�������忡 ���� �� ȯ���մϴ�!=======");

		// 3. ���̸� �������ּ���. ���
		System.out.println("���̸� �������ּ���");

		// 4. ���̸� �Է¹ޱ�
		int age = sc.nextInt();

		// 5. �ο����� �������ּ���. ���
		System.out.println("�ο����� �������ּ���");
		
		// 6. �ο��� �Է¹ޱ�
		int people = sc.nextInt();
		
		// 7. �� ����� ���
		// (���� - �̼������� ��쿡�� 50% ����, �׷��� ������� 5000�� �ްڴ�.)
		
		// �ڡڡڡڡ����������ڡڡڡڡ�
		// {} --> ������ ����(scope)�� �ǹ��Ѵ�!!
		// {} �ȿ��� ó������ ����� ������ {} �ȿ����� ��밡���ϴ�!
		
		int cost = 5000;
		if (age<20) {
			// �̼����� --> �⺻��ݿ��� 50% ����
			cost = (int) (cost * 0.5 * people);
		} else {
			// ���� --> �⺻���
			cost *= people; //���մ��Կ����� --> cost = cost * people
		}
		// 8. ���� ��� ���
		System.out.println("�� "+ cost +"�� �Դϴ�.");
		
		
	

		
		
		
		
		
	}

}
