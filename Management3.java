import java.util.Scanner;
public class Management3{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�G�߂����߂Ă��܂��B����͉����ł����H");
		int n = stdIn.nextInt();
		
		if(n==1||n==2||n==12){
			System.out.println("����͓~�ł��B");
		}else if(n==3||n==4||n==5){
			System.out.println("����͏t�ł��B");
		}else if(n==6||n==7||n==8){
			System.out.println("����͉Ăł��B");
		}else if(n==9||n==10||n==11){
			System.out.println("����͏H�ł��B");
		}else{
			System.out.println("����ł��܂���B");
		}
	}
}
	