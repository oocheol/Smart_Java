
public class Question3 {

	public static void main(String[] args) {
		int per_mandarin = 52;
		int total = 3729;
		int box = 0;
		
		box = (total % per_mandarin) == 0? total/per_mandarin : total/per_mandarin+1;  
		
		System.out.println("�ʿ��� �� �ڽ��� ���� " + box + "�� �̴�.");
		
	}

}
