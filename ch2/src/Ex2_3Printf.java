
public class Ex2_3Printf {

	public static void main(String[] args) {
		String url = "blog.naver.com/watermoon14";
		//String url = "www.codechobo.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;

		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
//	 	�Ǽ��� ���� ���Ǵ� ������ %f �Ҽ��� �Ʒ� 6�ڸ����� ���
//	 	%e ��������, %g ���� �����ϰ� ǥ��
		
		System.out.printf("d=%f%n", d);
//	 	%f �Ҽ��� 6�ڸ����� ��µǴϱ� �ݿø��ؼ� 7�� 8�� ��
		
		System.out.printf("d=%14.10f%n", d);
//		 �� 14�ڸ����� �Ҽ��� ������ 10�ڸ��� ����,  �Ҽ���(.)�� ���ڸ��� �Ҽ������� 4�ڸ�
//		 ������ 0���� ä��
		System.out.printf("[%s]%n", url); //34��
		System.out.printf("[%30s]%n", url); //���� ����
		System.out.printf("[%-30s]%n", url); //���� ����
		System.out.printf("[%.10s]%n", url); // ���ʿ��� 10���� ��� 

	}

}
