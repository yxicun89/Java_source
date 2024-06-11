import java.util.Scanner;
class ImputBodyData{
	public static void main(String[] args){
		System.out.println("あなたの身体データを基に肥満度を計測します");
		System.out.println("あなたの身体データを入力してください");
		Scanner stdIn = new Scanner(System.in);
		System.out.println("名前は？？");
		String name = stdIn.next();
		System.out.println("身長は何cmですか？");
		double height = stdIn.nextDouble();
		System.out.println("体重は何kgですか？？");
		double weight = stdIn.nextDouble();
		System.out.println("性別は？");
		String sex = stdIn.next();
		System.out.println("何歳ですか？");
		int age = stdIn.nextInt();
		BMI bmi = new BMI(name,height,weight,sex,age); //ここにnew BMIをする。
		System.out.println("あなたの身体データは下記になります。");
		bmi.DataDisplay2(); //ここでDisplayをする。
		System.out.println("あなたの肥満度は下記になります。");
		bmi.DodyFatness(); //ここでDodyFatnessをする。
	}
}