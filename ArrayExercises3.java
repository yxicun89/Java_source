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
		System.out.println("10�l�̓_���͉��L�ɂȂ�܂��B");
		for(int i=0;i<score.length;i++){
			score[i] = 10+rand.nextInt(90);
			System.out.println((i+1)+"�l��:"+score[i]);
		}
		System.out.println("�_���̏��Ԃ��t���ɕ��ѕς��܂����B");
		score = ArrayReversal(score);
		
		for(int i=0;i<score.length;i++){
			System.out.println((i+1)+"�l��:"+score[i]);
		}
	}
}