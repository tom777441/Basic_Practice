package String_application;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		
		String s1 = "This is a book. I am Tom";
		StringTokenizer st = new StringTokenizer(s1);
		//�ťհ����Ϥ��A������/t �B /n/ 
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
		System.out.println();
		String s2 = "1:Tom:0912-12345";
		st = new StringTokenizer(s2);
		System.out.println(st.nextToken(":"));
		System.out.println(st.nextToken(":"));
		System.out.println(st.nextToken("-"));
		

	}
}
