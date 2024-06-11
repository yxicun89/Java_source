import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("PCとジャンケンを行います。");
		System.out.println("0:グー, 1:パー, 2;チョキ");
		int n = stdIn.nextInt();
		int PChand = rand.nextInt(3);
		
		while(n==PChand){
			System.out.println("PCも"+PChand+"だったのでドローです。");
			System.out.println("もう一度ジャンケンを行います");
			System.out.println("0:グー, 1:パー, 2;チョキ");
			n = stdIn.nextInt();
			PChand = rand.nextInt(3);
		}
		
		if(n==2){
			if(PChand==1){
				System.out.println("PCは"+PChand+"だったのであなたの勝ちです。");
			}else{
				System.out.println("PCは"+PChand+"だったのであなたの負けです。");
			}
		}else if(n==0){
			if(PChand==2){
				System.out.println("PCは"+PChand+"だったのであなたの勝ちです。");
			}else{
				System.out.println("PCは"+PChand+"だったのであなたの負けです。");
			}
		}else if(PChand==n+1){
			System.out.println("PCは"+PChand+"だったので、あなたの負けです。");
		}else if(PChand==n-1){
			System.out.println("PCは"+PChand+"だったのであなたの勝ちです。");
		}else{
			System.out.println("ジャンケンが成立しません。");
		}
	}
}