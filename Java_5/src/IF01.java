import java.util.Scanner;

public class IF01 {

	public static void main(String[] args) {
		
		// ������ �Է� �޾� 20���� ũ�ų� ������ "�����Դϴ�."���
		// ����ϴ� ���α׷��� ����� ����
		
		System.out.print("���� �Է� : ");
		// 1. �Է¹޴� ����(Scanner)����
		Scanner sc = new Scanner(System.in);
		
		// 2. ������ �Է� �޾� age��� int�� ������ ����
		int age = sc.nextInt();
		
		// 3. ����, age�� 20���� ũ�ų� ������ "�����Դϴ�." ���
		if(age >= 20) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�̼������Դϴ�.");
		}
		
		

	}

}
