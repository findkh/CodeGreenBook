
public class Ex3_17 {

	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x; // �����̸� ����� �����.
		absY = y >= 0 ? y : -y; // ������ ������ ����� �Ǳ� ������ �� ����....(Ȯ��ġ ����)
		absZ = z >= 0 ? z : -z;
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');
		
		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("Y=%c%d%n", signY, absY);
		System.out.printf("Z=%c%d%n", signZ, absZ);
		//%c�� ���� �������� ��µȴٴ� ��
		//X=�������� �������� ���� 
		//X= signX�� 10�� 0���� ũ�� ������ + �� ��Ÿ���� absX�� ������ 0�� ��Ÿ��
		//Y= signY�� 0���� ������ ���� ������ ���� y�� 0�� �ƴϴ� - , absY 0���� ������ ���� - + - =  +
		//Z = signZ�� 0�� ������ ���� absZ�� 0�� ������ �� 
		//��� �� x=+10 Y=-5 Z= 0


	}

}
