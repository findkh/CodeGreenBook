
public class Ex3_11 {

	public static void main(String[] args) {
double pi = 3.141592;
		
		System.out.println(Math.round(pi));
		// Math.round �Ҽ��� ù°�ڸ����� �ݿø��ϴ� ��
        // �ᱣ�� : 3
		
		System.out.println(pi*1000);
        // �ᱣ�� : 3141.592
		System.out.println(Math.round(pi*1000)/1000d);
		// 5��° �ڸ����� �ݿø� �ϰ� ������ �̷��� ��
        // �ᱣ�� : 3.142

		// 3.141�� ��������?
		System.out.println(pi*1000);
		System.out.println((int)(pi*1000));
		System.out.println((int)(pi*1000)/1000.0);
   	}

}
