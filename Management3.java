import java.util.Scanner;
public class Management3{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.println("季節を求めています。それは何月ですか？");
		int n = stdIn.nextInt();
		
		if(n==1||n==2||n==12){
			System.out.println("それは冬です。");
		}else if(n==3||n==4||n==5){
			System.out.println("それは春です。");
		}else if(n==6||n==7||n==8){
			System.out.println("それは夏です。");
		}else if(n==9||n==10||n==11){
			System.out.println("それは秋です。");
		}else{
			System.out.println("判定できません。");
		}
	}
}
	