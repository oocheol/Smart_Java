
public class FOR02 {

	public static void main(String[] args) {

		// 1. for���� ����Ͽ� 21���� 57���� ����Ͻÿ�.
			
		for(int i = 21; i <= 57; i++) {
			System.out.println(i);
		}
		
		// 2. for���� ����Ͽ� 96���� 53���� ����Ͻÿ�.
		
		for(int i = 96; i >= 53; i--) {
			System.out.println(i);
		}
		
		// 3-1. for���� ����Ͽ� 21���� 57���� �� �� Ȧ���� ����Ͻÿ� ����Ͻÿ�.
			
		for(int i = 21; i <= 57; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		// 3-2. for���� ����Ͽ� 21���� 57���� �� �� Ȧ���� ����Ͻÿ� ����Ͻÿ�.
		for(int i = 21; i <= 57; i=i+2) {
				System.out.println(i);
			
		}
	

		
	}

}
