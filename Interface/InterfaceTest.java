package Interface;

public class InterfaceTest {
	
	public static void main(String[]args) {
		
	}
	
}
//interface��public ���s���v���A�Ҧ���k�Ҭ�public ���X�ӻݭn�ŧipublic
interface JavaProgramer{
	void OCJP();
}
interface LinuxLPIC{
	void LPIC101();
	void LPIC102();
}
//implement interface
class SuperProgramer implements JavaProgramer, LinuxLPIC{
 public	void OCJP() {};
 public	void LPIC101() {};
 public	void LPIC102() {};
}