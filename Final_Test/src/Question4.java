import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���� >> ");
		int num1 = scan.nextInt();
		System.out.print("�ι�° ���� >> ");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		
		if (sum >= 10){
			System.out.println("�� ���� ���� 10�̻��Դϴ�.");
		} else {
			System.out.println("�� ���� ���� 10�̸��Դϴ�.");
		}
	}
}
