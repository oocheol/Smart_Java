import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		// ������ �Է� �޾� 90���� ũ�ų� ������ "A�����Դϴ�."��
		// 90���� ������ "B�����Դϴ�."�� ����ϴ� ���α׷��� ����� ����
		
		// 1. �Է¹޴� ����(Scanner) ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		// 2. ������ �Է� �޾� score��� int�� ������ ����
		int score = sc.nextInt();
		
		// 3. ����, score�� 90���� ũ�ų� ������ "A�����Դϴ�."�� ���
		// score�� 80���� ũ�ų� ���� 90���� �۴ٸ� "B�����Դϴ�."�� ���
		// score�� 70���� ũ�ų� ���� 80���� �۴ٸ� "B�����Դϴ�."�� ���

		if(score >= 90) {
			System.out.println("A�����Դϴ�.");
		} else if(score >= 80) {
			System.out.println("B�����Դϴ�.");
		} else if (score >= 70) {
			System.out.println("C�����Դϴ�.");
		} else{
			System.out.println("F�����Դϴ�.");
		}
		
	}

}
