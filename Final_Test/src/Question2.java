import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���� >> ");
		int num1 = scan.nextInt();
		System.out.print("�ι�° ���� >> ");
		int num2 = scan.nextInt();
		
		System.out.println("���ϱ� ��� : "+ (num1 + num2));
		System.out.println("���� ��� : "+ (num1 - num2));
		System.out.println("���ϱ� ��� : "+ (num1 * num2));
		System.out.println("������ ��� : "+ (num1 / num2));

	}

}
