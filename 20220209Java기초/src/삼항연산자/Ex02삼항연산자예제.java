package ���׿�����;

import java.util.Scanner;

public class Ex02���׿����ڿ��� {

	public static void main(String[] args) {
		
		// Q. 
		// num1 = 2, num2 = 5 -> num1 - num2 = -3
		// ������ ������ ���� (�������� �����) == 3
		// num2 - num1 = 3
		
		// 1. �Էµ��� ��������
		Scanner sc = new Scanner(System.in);
		
		// 2. ��¹�
		System.out.print("ù ��° ���� �Է� >> ");
		
		// 3. �Է�
		int num1 = sc.nextInt();
		
		// 4. ��¹�
		System.out.print("�� ��° ���� �Է� >> ");
		
		// 5. �Է�
		int num2 = sc.nextInt();
		
		// 6. �� ū���� �Ǻ� ����� �����ϱ�
		int result = (num1 > num2)? num1 - num2 : num2 - num1; 
		// 7. ���
		System.out.println("���Ȯ�� >> " + result);
		
		
	}

}
