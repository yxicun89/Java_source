import java.util.Scanner;
public class Method{
	public static String Syozoku2(int a){
		String department;
		switch(a){
			case 1: 
			  department ="情報科学部";
			  break;
			case 2: 
			  department ="外国語学部";
			  break;
			case 3: 
			  department ="教育福祉学部";
			  break;
			case 4: 
			  department ="日本文化学部";
			  break;
			case 5: 
			  department ="看護学部";
			  break;
			default: 
			  department ="無所属";
			  break;
		}
		return department;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.println("下記のリストからあなたの所属を入力してください。");
		System.out.println("1:情報科学部、2:外国語学部、3:教育福祉学部");
		System.out.println("4:日本文化学部、5:看護学部、6:無所属");
		System.out.print("所属番号");
		int a = stdIn.nextInt();
		
		String dt = Syozoku2(a);
		System.out.println("あなたの所属は"+dt+"ですね。");
	}
}