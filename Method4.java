import java.util.Scanner;
public class Method4{
	public static double Med(double a, double b, double c){
		double med;
		if((b<=a && a<=c)||(c<=a && a<=b)){
			med=a;
		}else if((c<=b && b<=a)||(a<=b && b<=c)){
			med=b;
		}else{
			med=c;
		}
		return med;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�D���Ȑ��l(�����_����)��3���͂��Ă��������B");
		System.out.print("���la:");
		double a = stdIn.nextDouble();
		System.out.print("���lb:");
		double b = stdIn.nextDouble();
		System.out.print("���lc:");
		double c = stdIn.nextDouble();
		double m = Med(a,b,c);
		System.out.println("��r����ƒ����l��"+m+"�ł�");
	}
}