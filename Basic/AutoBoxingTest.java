package Basic;

public class AutoBoxingTest {
	public static void main(String[] args) {
		int a=100;
		
		Integer b = new Integer(101);
		
		Integer c=a; //Integer c = new Integer(a);
		System.out.println(c.doubleValue());
		
		int d=b;
		System.out.println(d);
		
		/*
		byte e =12;
		int f = e;     �۰��૬
		Integer g = e; �u��b�����ۦP���]�q���O���i��A�G���B�|����error
		*/
	}
}
