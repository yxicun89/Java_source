import java.util.Scanner;
public class Method{
	public static String Syozoku2(int a){
		String department;
		switch(a){
			case 1: 
			  department ="���Ȋw��";
			  break;
			case 2: 
			  department ="�O����w��";
			  break;
			case 3: 
			  department ="���畟���w��";
			  break;
			case 4: 
			  department ="���{�����w��";
			  break;
			case 5: 
			  department ="�Ō�w��";
			  break;
			default: 
			  department ="������";
			  break;
		}
		return department;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���L�̃��X�g���炠�Ȃ��̏�������͂��Ă��������B");
		System.out.println("1:���Ȋw���A2:�O����w���A3:���畟���w��");
		System.out.println("4:���{�����w���A5:�Ō�w���A6:������");
		System.out.print("�����ԍ�");
		int a = stdIn.nextInt();
		
		String dt = Syozoku2(a);
		System.out.println("���Ȃ��̏�����"+dt+"�ł��ˁB");
	}
}