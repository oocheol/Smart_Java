package ���ǹ�����ǽ�;

import java.util.Scanner;

public class Ex01���Ǳ� {

	public static void main(String[] args) {

		// 1. �Է��ϴ� ���� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		// 2. ��¹� �ۼ��ϱ�
		System.out.println("�ݾ��� �Է��ϼ���.");
		
		// 3. charge �Է±ݾ� ������ ���� �����ϱ�
		int charge = sc.nextInt();
		
		// 4. ��¹� �ۼ�
		System.out.println("�޴��� ������.");
		
		// 5. ��¹� �ۼ��ϱ� (�޴���)
		System.out.print("1.�ƿ���(700��) 2.�̱�����(1000��) 3.���׸�(500��) >> ");
		
		// 6. ����ڰ� ������ �޴� �Է¹ޱ� (���� �����ϱ�)
		int menu = sc.nextInt();
		
		// 7. ����ڰ� ������ �޴��� �������� �Ǵ�
		// �Ǵ� -----> ���ǹ�
		// switch ���̳� if - else if
		int price = 0;
		switch (menu) {
		case 1:
			price = 700;
			break;
		case 2 :
			price = 1000;
			break;
		case 3 :
			price = 500;
			break;
			
		}
		System.out.println("�ܵ� : "+ (charge - price) + "��");
		
		
	}

}
