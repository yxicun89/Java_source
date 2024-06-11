import java.util.Random;
public class ArrayExercises3{
	public static int[] ArrayReversal(int[] score){
		Random rand=new Random();
		int[] score2=new int[10];
		for(int i=0;i<score.length;i++){
			score2[i]=score[(score.length)-i-1];
		}
		return score2;
	}
	
	public static void main(String[] args){
		Random rand = new Random();
		int[] score = new int[10];
		System.out.println("10人の点数は下記になります。");
		for(int i=0;i<score.length;i++){
			score[i] = 10+rand.nextInt(90);
			System.out.println((i+1)+"人目:"+score[i]);
		}
		System.out.println("点数の順番を逆順に並び変えました。");
		score = ArrayReversal(score);
		
		for(int i=0;i<score.length;i++){
			System.out.println((i+1)+"人目:"+score[i]);
		}
	}
}