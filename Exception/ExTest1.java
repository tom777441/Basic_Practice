package Exception;

public class ExTest1 {
	public static void main(String[] args) {
		int a=0,b=10;
		try {
			//�i��o�ͨҥ~
			System.out.println(b/a);
		}	//�����o�ͨҥ~
		catch(Exception e) {
			System.err.println("can't computing");
		}	//�T�Otry---catch�{�����槹���
		finally {
			System.out.println("Game Over");
		}
		System.out.println("Game Over 2");
	}
}
