
public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		long d = 1_000_000L;
		
		long c = a * b;
		 System.out.println(c);

		 // ��� �� -1454759936
		 // longŸ��(8byte)�� 1_000_000_000_000�� ���;� ������ int*int�� intŸ���̱� ������ 
		 // ������ longŸ������ ��������� �Ѵ�
		 
		 long e = a * d;
		 System.out.println(e);
		 // ������ ��� ������ long Ÿ������ �������ֵ� ��� ����
         // ����� 1000000000000


	}

}
