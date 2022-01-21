
public class ex05 {

	public static void main(String[] args) {

		System.out.println((1<3) && (4<5)); // true && true (true) 둘 다 true면 true
		System.out.println((2<1) && (4<5)); // false && true (false) 둘 중 하나라도 false면 false
		System.out.println((1<3) || (4<2)); // true && false (true) 둘 중 하나라도 true면 true 
		System.out.println((2<1) || (4<2)); // false && false (false) 둘 다 false면 false
		
	}

}
