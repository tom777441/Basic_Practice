package Basic;

public class GCTest {
	public static void main(String[] args) {
		GCTest1 obj = new GCTest1();
		//�Y���]NULL, obj�������VGC�L�k����
		obj = null;
		//�i��GC����A�Y��GC�h�~����� �å浹JVM
		System.gc();
	}
}
class GCTest1{
	int a;
	void m1() {};
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Game Over1");
		super.finalize();
		System.out.println("Game Over2");
	}
}
