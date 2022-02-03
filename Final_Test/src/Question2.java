import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 >> ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 >> ");
		int num2 = scan.nextInt();
		
		System.out.println("더하기 결과 : "+ (num1 + num2));
		System.out.println("빼기 결과 : "+ (num1 - num2));
		System.out.println("곱하기 결과 : "+ (num1 * num2));
		System.out.println("나누기 결과 : "+ (num1 / num2));

	}

}
