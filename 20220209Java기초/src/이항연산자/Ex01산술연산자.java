package ���׿�����;

import java.util.Scanner;

public class Ex01��������� {

	public static void main(String[] args) {
		
		// �Էµ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
		// import ����Ű -> ctrl + shift + o
		// �Է��ϴ� ��ɾ� �ۼ��ϱ�!
		System.out.print("���ڸ� �Է��ϼ��� >> "); 
		// ���� ���ֱ� println -> print ('ln' ����)
		int num1 = sc.nextInt();
		// num1�� ���������Ͱ� �ߵ����� Ȯ���� �غ���.
		System.out.println(num1);
		
		// num2 ������ ���ڸ� �Է¹��� �� �ֵ��� �����ô�.
		// ������ �ߺ�x
		// ��¹����� "���ڸ� �Է��ϼ���>> "
		System.out.print("���ڸ� �Է��ϼ���>> ");
		int num2 = sc.nextInt();
		
		// ���ڿ� ���ϱ� -> ���������� �ڵ�����ȯ
		// ���� + ���� = ����
		// 
		System.out.println("���ϱ� ��� >> " + (num1+num2));
		
		
		// ����, ���ϱ�, ��, ������ ��� ���ϱ�
		System.out.println("���� ��� >> " + (num1 - num2));
		System.out.println("���ϱ� ��� >> " + (num1 * num2));
		System.out.println("�� ��� >> " + (num1 / num2));
		System.out.println("������ ��� >> " + (num1 % num2));
		
		// �� �����ڸ� ����ؼ� (�����⿬����) �Ҽ������� �������غ��ô�!
		// num1 / num2 ������ �������� ��, ����� ������
		// num1 / num2 ������ �Ǽ��� �����ް� ������
		// ������ -> �Ǽ��� �ٲ����� : ��, ����ȯ
		
		double result = (double) num1 / num2;
		// num1 = 5, num2 = 3, num1/num2 = 1 -> 1.0
		// (double) num1 / num2 = 1.6666
		System.out.println("������ ��� >> " + result);
		 
	}

}
