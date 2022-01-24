import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 >> ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 입력 >> ");
		int num2 = scan.nextInt();
		
		System.out.println("합계 : "+ (num1 + num2));
		System.out.println("평균 : "+ ((num1 + num2)/2));

	}

}
