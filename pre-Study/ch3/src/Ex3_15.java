import java.util.Scanner;

public class Ex3_15 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			char ch = ' ';
			
			System.out.printf("���ڳ� ������ �ϳ� �Է��ϼ���.>");
			
			String input = scanner.nextLine();
			ch = input.charAt(0);
			
			if('0' <= ch && ch <= '9') {
				System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.%n");
			} else if ('a' <= ch && ch <= 'z') {
				System.out.printf("�Է��Ͻ� ���ڴ� �ҹ����Դϴ�%n");
			} else if('A' <= ch && ch <= 'Z') {
				System.out.printf("�Է��Ͻ� ���ڴ� �빮���Դϴ�%n");					
			} else //if(!('0' <= ch && ch <= '9') || !('a' <= ch && ch <= 'z') || !('A' <= ch && ch <= 'Z'))
				System.out.printf("�߸� �Է��ϼ̽��ϴ�%n");
			}
		}
