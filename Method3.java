import java.util.Scanner;
public class Method3{
	public static int Factorial(int a){
		if(a==0){
			return 1;
		}else{
			return a * Factorial(a-1);
		}
	}
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�D���Ȑ�����1���͂��Ă��������B");
		System.out.print("����a;");
		int i = stdIn.nextInt();
		int j = Factorial(i);
		System.out.println(i+"�̊K���"+j+"�ł��B");
	}
}