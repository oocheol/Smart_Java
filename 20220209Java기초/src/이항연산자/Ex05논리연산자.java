package ���׿�����;

public class Ex05�������� {

	public static void main(String[] args) {
		
		// â�� ������� 
		// window -> show view -> console
		// 1) ���������� ---> !(�ǿ�����)
		boolean result = true;
		System.out.println(!result); //false
		// 2) AND ������ ---> &&
		// �ΰ��� ���� ��� true�϶��� true ������� �����ִ� ������
		
		int num1 = 4;
		int num2 = 5;
		
		boolean result2 = (num1 > num2) && (num1 < num2);
		// num1 > num2 ==> false
		// num1 < num2 ==> true
		// false && true ==> false
		System.out.println(result2);
		
		// 3) OR ������ ---> ||
		// shift + ��ȭǥ�� ===> ||
		// �� ���� �� �߿���  
		// �ϳ��� true��� true������� �����ִ� ������
		// �� ���� ���� ��� false�̸� false�� �����ش�.
		boolean result3 = (num1 > num2) || (num1 < num2);
		// false || true ---> true
		System.out.println(result3);
		
		boolean result4 = (num1 > num2) || (num1 == num2);
		// false || false ---> false
		System.out.println(result4);
		
		
		
		
	}

}
