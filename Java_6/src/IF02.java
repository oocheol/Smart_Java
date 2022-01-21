import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		// 정수를 입력 받아 90보다 크거나 같으면 "A학점입니다."를
		// 90보다 작으면 "B학점입니다."를 출력하는 프로그램을 만들어 보자
		
		// 1. 입력받는 도구(Scanner) 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		// 2. 정수를 입력 받아 score라는 int형 변수에 저장
		int score = sc.nextInt();
		
		// 3. 만약, score가 90보다 크거나 같으면 "A학점입니다."를 출력
		// score가 80보다 크거나 같고 90보다 작다면 "B학점입니다."를 출력
		// score가 70보다 크거나 같고 80보다 작다면 "B학점입니다."를 출력

		if(score >= 90) {
			System.out.println("A학점입니다.");
		} else if(score >= 80) {
			System.out.println("B학점입니다.");
		} else if (score >= 70) {
			System.out.println("C학점입니다.");
		} else{
			System.out.println("F학점입니다.");
		}
		
	}

}
