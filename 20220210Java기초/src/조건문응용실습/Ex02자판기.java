package ���ǹ�����ǽ�;

import java.util.Scanner;

public class Ex02���Ǳ� {

	public static void main(String[] args) {

		// 1. �Է��ϴ� ���� �ҷ�����
		Scanner sc = new Scanner(System.in);
		// 2. ��¹� (�ݾ��� �Է��ϼ���.)
		System.out.println("�ݾ��� �Է��ϼ���.");
		// 3. �ݾ� �Է¹޾Ƽ� �����ϱ�
		int charge = sc.nextInt();
		// 4. ��¹� (�޴��� ������.)
		System.out.println("�޴��� ������.");
		// 5. ��¹� (�޴���)
		System.out.print("1.�ƿ���(700��) 2.�̱�����(1000��) 3.���׸�(500��) >> ");

		// 6. ������ �޴� �Է¹޾Ƽ� �����ϱ�
		int menu = sc.nextInt();

		// 7. ����ڰ� ��� �޴��� �����ߴ��� �Ǵ� ---> ���ǹ�
		// �޴��� �ݾ׺��� ������ �ݾ��� �۴ٸ� ���� �����ؿ�
		// ���� ������ ���� �ݾ��� ����ϴٸ� �ܵ��� ������ �� �ֵ��� ����.
		// ex) charge = 500��
		// ���࿡ select == 2
		// ����ڰ� �ݾ��� �޴��� �ݾ׺��� ������ ? ������ ? �Ǵ�
		// �޴� �ݾ׺��� ũ�ٸ� �ܵ��� �����ָ� �˴ϴ�.
		// �޴� �ݾ׺��� �۴ٸ� ���� �����ؿ� �Ф� ��� �Ŀ� ���� �Է��� �ݾ� ���θ� �����ش�!!
		
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
		int result = charge - price;
		
		if (result < 0) {
			result = charge;
			System.out.println("���� �����ؿ�Ф�");
			
		}
		System.out.println("�ܵ� : "+ (result) + "��");
		
		int ex_1000 = result / 1000;
		result %= 1000;
		int ex_500 = result / 500;
		result %= 500;
		int ex_100 = result / 100;
		
		System.out.print("õ�� : " + ex_1000 +"��, ");
		System.out.print("����� : " + ex_500 +"��, ");
		System.out.println("��� : " + ex_100 +"��");
		
		
		
		
		
		
		
	}

}
