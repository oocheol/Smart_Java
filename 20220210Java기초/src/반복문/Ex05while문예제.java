package �ݺ���;

import java.util.Scanner;

public class Ex05while������ {

	public static void main(String[] args) {
		
		// �Է¹��� ���� Ȧ����� Ȧ��+1
		// �Է¹��� ���� ¦����� ¦��+1
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int even = 0; // ¦��
		int odd = 0; // Ȧ��
				
		while(true) {
			System.out.print("�����Է�: ");
			num = sc.nextInt();
			if (num == -1) {
				break;
			}
			switch (num % 2) {
			case 0 :
				even ++;
				break;
			case 1 :
				odd ++;
				break;
			}
			
			System.out.println("¦������: " + even);
			System.out.println("Ȧ������: " + odd);
			
		}
		System.out.println("����Ǿ����ϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
