
public class Exercise3_4 {

	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int NumOfbucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1: 0);
		System.out.println("�ʿ��� �ٱ����� �� : " + NumOfbucket);
	}

}