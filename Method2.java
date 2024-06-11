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
		System.out.println("好きな数値(小数点も可)を3つ入力してください。");
		System.out.print("数値a:");
		double a = stdIn.nextDouble();
		System.out.print("数値b:");
		double b = stdIn.nextDouble();
		System.out.print("数値c:");
		double c = stdIn.nextDouble();
		double m = ThreeMax(a,b,c);
		System.out.println("比較すると最大値は"+m+"です");
	}
}