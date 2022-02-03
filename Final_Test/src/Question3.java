
public class Question3 {

	public static void main(String[] args) {
		int per_mandarin = 52;
		int total = 3729;
		int box = 0;
		
		box = (total % per_mandarin) == 0? total/per_mandarin : total/per_mandarin+1;  
		
		System.out.println("필요한 귤 박스의 수는 " + box + "개 이다.");
		
	}

}
