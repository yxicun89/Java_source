import java.util.Random;
public class ArrayExercises2{
	public static int OddScoreCount(int[] score){
		int odd=0;
		for(int i=0;i<score.length;i++){
			if((score[i])%2==0){
				odd = odd;
			}else{
				odd = odd + 1;
			}
		}
		return odd;
	}
	
	public static void main(String[] args){
		Random rand = new Random();
		int[] score = new int[10];
		System.out.println("10人の点数は下記になります。");
		for(int i=0;i<score.length;i++){
			score[i] = 10+rand.nextInt(90);
			System.out.println((i+1)+"人目:"+score[i]);
		}
		int odd = OddScoreCount(score);
		System.out.println("奇数の点数は"+odd+"人です。");
	}
}