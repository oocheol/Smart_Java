import java.util.Scanner;

public class WHILE02 {

	public static void main(String[] args) {
		
		// while���� ����Ͽ� Ű����κ��� �Է� ���� ����
		// 10���� �۰ų� ���� ����
		// ��� ������ �Է¹�������.
		
		// while(���ǽ�){
		// ���๮��;
		// }
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(num <= 10) {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
		}
		System.out.print("����Ǿ����ϴ�.");
	}

}
