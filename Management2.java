public class Management2{
	public static void main(String[] args){
		Aho a = new Aho();
		a.countup2();
	}
}

class Aho{
	public static void countup2(){
		System.out.println("1�`30�̐������o�͂��܂��B");
		System.out.println("3�̔{���݂̂ɁA�A�z�ɂȂ�܂��B");
		for(int i=1;i<=30;i++){
			if(i%3==0){
				System.out.println("�A�z�ɂȂ�B");
			}else{
				System.out.println(i);
			}
		}
	}
}