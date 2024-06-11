public class Management2{
	public static void main(String[] args){
		Aho a = new Aho();
		a.countup2();
	}
}

class Aho{
	public static void countup2(){
		System.out.println("1～30の数字を出力します。");
		System.out.println("3の倍数のみに、アホになります。");
		for(int i=1;i<=30;i++){
			if(i%3==0){
				System.out.println("アホになる。");
			}else{
				System.out.println(i);
			}
		}
	}
}