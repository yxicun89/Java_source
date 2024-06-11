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
		System.out.println("好きな数値(小数点も可)を3つ入力してください。");
		System.out.print("数値a:");
		double a = stdIn.nextDouble();
		System.out.print("数値b:");
		double b = stdIn.nextDouble();
		System.out.print("数値c:");
		double c = stdIn.nextDouble();
		double m = Med(a,b,c);
		System.out.println("比較すると中央値は"+m+"です");
	}
}