package ���ǹ�;

import java.util.Scanner;

public class Ex06ifelse���ǽ�_W {

	public static void main(String[] args) {

		System.out.println("====�������忡 ���� �� ȯ���մϴ�!=======");
		int price = 5000;
		
		System.out.println("���̸� �������ּ���");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age<20) {
			price *= 0.5;
		}
		
		System.out.println("�ο����� �������ּ���");
		int num = sc.nextInt();
		
		
		int result = num * price;
		System.out.println("�� "+ result +"�� �Դϴ�.");
		
		
		
		
		
		
		
	}

}
