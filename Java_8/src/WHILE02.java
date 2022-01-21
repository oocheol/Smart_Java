import java.util.Scanner;

public class WHILE02 {

	public static void main(String[] args) {
		
		// while문을 사용하여 키보드로부터 입력 받은 수가
		// 10보다 작거나 같을 때만
		// 계속 정수를 입력받으세요.
		
		// while(조건식){
		// 실행문장;
		// }
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(num <= 10) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		}
		System.out.print("종료되었습니다.");
	}

}
