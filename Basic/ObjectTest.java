package Basic;

public class ObjectTest {
	public static void main(String[] args){
		Object obj1 = new Object();
		String s1 = new String();
		
		/*	Object��String�����O
			�۰��૬				*/
		Object obj2 = s1;
		
		/*	�j���૬�A�i�ಣ�ͫ��O�ഫ���~
		String s2 = (String)obj1;
		 */
		
		Object obj3 = new String();
		String s3 = (String)obj3;
	}
}
