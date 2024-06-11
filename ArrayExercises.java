import java.util.Random;
public class ArrayExercises{
	public static int MinScore(int[] score){
		int min = 100;
		for(int i=0;i<score.length;i++){
			if(min>score[i]){
				min=score[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args){
		Random rand=new Random();
		int[] score=new int[10];
		System.out.println("10人の点数は下記になります。");
		for(int i=0;i<score.length;i++){
			score[i] = 10+rand.nextInt(90);
			System.out.println((i+1)+"人目:"+score[i]);
		}
		
		int min = MinScore(score);
		System.out.println("最小点:"+min);
	}
}