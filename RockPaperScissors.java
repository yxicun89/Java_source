import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("PC�ƃW�����P�����s���܂��B");
		System.out.println("0:�O�[, 1:�p�[, 2;�`���L");
		int n = stdIn.nextInt();
		int PChand = rand.nextInt(3);
		
		while(n==PChand){
			System.out.println("PC��"+PChand+"�������̂Ńh���[�ł��B");
			System.out.println("������x�W�����P�����s���܂�");
			System.out.println("0:�O�[, 1:�p�[, 2;�`���L");
			n = stdIn.nextInt();
			PChand = rand.nextInt(3);
		}
		
		if(n==2){
			if(PChand==1){
				System.out.println("PC��"+PChand+"�������̂ł��Ȃ��̏����ł��B");
			}else{
				System.out.println("PC��"+PChand+"�������̂ł��Ȃ��̕����ł��B");
			}
		}else if(n==0){
			if(PChand==2){
				System.out.println("PC��"+PChand+"�������̂ł��Ȃ��̏����ł��B");
			}else{
				System.out.println("PC��"+PChand+"�������̂ł��Ȃ��̕����ł��B");
			}
		}else if(PChand==n+1){
			System.out.println("PC��"+PChand+"�������̂ŁA���Ȃ��̕����ł��B");
		}else if(PChand==n-1){
			System.out.println("PC��"+PChand+"�������̂ł��Ȃ��̏����ł��B");
		}else{
			System.out.println("�W�����P�����������܂���B");
		}
	}
}