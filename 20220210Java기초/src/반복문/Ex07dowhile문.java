package �ݺ���;

import java.util.Scanner;

public class Ex07dowhile�� {

	public static void main(String[] args) {

		// do-while�� ����
		// do{������ ����}while(�˻�����);
//		do {
//			System.out.println("�ΰ����ɹ� ȭ����~");
//		} while (false);

		// ���̾�Ʈ ���� ���α׷��� ������~
		Scanner sc = new Scanner(System.in);
		
		// 1. ���� ������ �Է�
		System.out.print("��������� : ");
		int current = sc.nextInt();
		// 2. ��ǥ ������ �Է�
		System.out.print("��ǥ������ : ");
		int goal = sc.nextInt();

		// 3. ���� ���������� �Է�
		int week = 1;
		do {
			System.out.print(week+"���� ���� ������ : ");
			week++;
		// 4-1. ��������� = ��������� - ����������
			int down = sc.nextInt();
			current -= down;
		// 4-2. ��������԰� ��ǥ�����Կ� �����ߴ��� ������ �Ǵ�
		}	while(goal <= current); 
		// 5. ��ǥ�����Կ� �����ߴٸ� ���α׷� ����!
		System.out.println(current+"kg �޼�!! �����մϴ�!!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
