package ����if��;

import java.util.Scanner;

public class Ex01����if�� {

	public static void main(String[] args) {

		// ������ ���������� �� ����ϴ� ����if��!
		// if, else if Ű���� ����ϱ�!!!
		
		// ����ڷκ��� ���ڸ� �Է¹޾Ƽ� �ش��ϴ� ���ڰ�
		// 0����, Ȧ������, ¦������ �Ǵ��ϴ� ���α׷��� ������!
		
		// 1. �Է¹޴� ���� ��������
		Scanner sc = new Scanner(System.in);
		// 2. ���ڸ� �Է��ϼ��� ����ϱ�
		System.out.print("���ڸ� �Է��ϼ��� >> ");
		// 3. ���ڸ� �Է¹ޱ�
		int num = sc.nextInt();
		// 4. ������ �Ǵ��ؼ� 0����, Ȧ������, ¦������ ���!
		// **** ���ǽ��� ������ �����غ���!!!! *****
		if (num == 0) {
			System.out.println("0�Դϴ�!");
		} else if (num % 2 == 1) {
			System.out.println("Ȧ���Դϴ�!");
		} else{
			// ���� �ִ� ��� ���ǽ��� �����̶�� �����ϴ� ����!
			System.out.println("¦���Դϴ�!");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
