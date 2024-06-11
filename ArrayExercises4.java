import java.util.Random;
import java.util.Scanner;

public class ArrayExercises4{
	public static boolean EnglishMonthCheck(int number,String japanese){
		String[] Japaneseday = {"月","火","水","木","金","土","日"};
		String[] Japaneseday2 = {"月曜","火曜","水曜","木曜","金曜","土曜","日曜"};
		String[] Japaneseday3 = {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
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
		System.out.println("曜日を表す英単語の勉強を始めます。");
		System.out.println("問題;"+Englishday[num]);
		while(true){
			System.out.println("何月ですか:");
			String answer = stdIn.next();
			if(EnglishMonthCheck(num,answer)!=true){
				System.out.println("違います。もう一度解答してください");
			}else{
				System.out.println("正解です。勉強を終了します。");
				break;
			}
		}
	}
}