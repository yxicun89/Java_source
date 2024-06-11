import java.util.Random;
import java.util.Scanner;

public class ArrayExercises4{
	public static boolean EnglishMonthCheck(int number,String japanese){
		String[] Japaneseday = {"Œ","‰Î","…","–Ø","‹à","“y","“ú"};
		String[] Japaneseday2 = {"Œ—j","‰Î—j","…—j","–Ø—j","‹à—j","“y—j","“ú—j"};
		String[] Japaneseday3 = {"Œ—j“ú","‰Î—j“ú","…—j“ú","–Ø—j“ú","‹à—j“ú","“y—j“ú","“ú—j“ú"};
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
		System.out.println("—j“ú‚ğ•\‚·‰p’PŒê‚Ì•×‹­‚ğn‚ß‚Ü‚·B");
		System.out.println("–â‘è;"+Englishday[num]);
		while(true){
			System.out.println("‰½Œ‚Å‚·‚©:");
			String answer = stdIn.next();
			if(EnglishMonthCheck(num,answer)!=true){
				System.out.println("ˆá‚¢‚Ü‚·B‚à‚¤ˆê“x‰ğ“š‚µ‚Ä‚­‚¾‚³‚¢");
			}else{
				System.out.println("³‰ğ‚Å‚·B•×‹­‚ğI—¹‚µ‚Ü‚·B");
				break;
			}
		}
	}
}