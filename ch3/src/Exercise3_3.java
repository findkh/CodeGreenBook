import java.util.Scanner;

public class Exercise3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("100���� ���ڸ� �Է��Ͻÿ�");
	
	String input = scanner.nextLine();
	int num = Integer.parseInt(input); //�Է¹��� ���ڿ��� ���ڷ� ��ȯ
	
	System.out.println("100�� �ڸ� ���ϸ� ������" + num/100*100 + "�Դϴ�.");

	}

}
