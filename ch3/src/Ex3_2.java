
public class Ex3_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5, j =0;
		
		j = i++;
		System.out.println("j=i++ �����ϸ�"+ "i=" + i + "j=" + j);
	// �ᱣ�� j=i++ �����ϸ�i=6j=5
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j=++i �����ϸ�"+ "i=" + i + "j=" + j);
    // �ᱣ�� j=++i �����ϸ�i=6j=6
	}
}
