import java.util.Random;
import java.util.Scanner;

public class ArrayExercises4{
	public static boolean EnglishMonthCheck(int number,String japanese){
		String[] Japaneseday = {"��","��","��","��","��","�y","��"};
		String[] Japaneseday2 = {"���j","�Ηj","���j","�ؗj","���j","�y�j","���j"};
		String[] Japaneseday3 = {"���j��","�Ηj��","���j��","�ؗj��","���j��","�y�j��","���j��"};
		boolean check = false;
		if(japanese.equals(Japaneseday[number])==true){
			check = true;
		}else if(japanese.equals(Japaneseday2[number])==true){
			check = true;
		}else if(japanese.equals(Japaneseday3[number])==true){
			check = true;
		}
		return check;
	}
	
	public static void main(String[] args){
		String[] Englishday={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		Random rand = new Random();
		int num = rand.nextInt(Englishday.length);
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�j����\���p�P��̕׋����n�߂܂��B");
		System.out.println("���;"+Englishday[num]);
		while(true){
			System.out.println("�����ł���:");
			String answer = stdIn.next();
			if(EnglishMonthCheck(num,answer)!=true){
				System.out.println("�Ⴂ�܂��B������x�𓚂��Ă�������");
			}else{
				System.out.println("�����ł��B�׋����I�����܂��B");
				break;
			}
		}
	}
}