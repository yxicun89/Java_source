import java.util.Scanner;
public class Method2{
	public static double ThreeMax(double a, double b, double c){
		double max;
		if((b<=c && c<=a)||(c<=b && b<=a)){
			max=a;
		}else if((a<=c && c<=b)||(c<=a && a<=b)){
			max=b;
		}else{
			max=c;
		}
		return max;
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
		double m = ThreeMax(a,b,c);
		System.out.println("��r����ƍő�l��"+m+"�ł�");
	}
}