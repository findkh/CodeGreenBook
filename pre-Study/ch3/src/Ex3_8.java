
public class Ex3_8 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);
		System.out.println(c);
		//��� ���� 44
		// 10*30�� 300������ 300�� byte�� ������ �Ѿ  byte������ ��ȯ�ϸ� 8bit���� ǥ���ϴϱ�
		// 300 �������� ��ȯ�ϸ� 1_0010_1100
		// 0010_1100�� 10������ ����ϸ� 44�� ����
		// �̰� ������ �ս���
	}

}
