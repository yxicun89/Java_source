import java.util.Random;
public class ObjectExercise{
	public static void main(String[] args){
		HighSchoolAchievement[] studentArray = new HighSchoolAchievement[3];
		Random rand = new Random();
		for(int i=0;i<studentArray.length;i++){
			int score1 = 30 + rand.nextInt(70);
			int score2 = 30 + rand.nextInt(70);
			int score3 = 30 + rand.nextInt(70);
			int score4 = 30 + rand.nextInt(70);
			int score5 = 30 + rand.nextInt(70);
			studentArray[i] = new HighSchoolAchievement(score1,score2,score3,score4,score5);
			System.out.println((i+1)+"�l�ڂ̐��т�\�����܂�");
			studentArray[i].AllScoreDisPlay();
			studentArray[i].SumAveScoreDisPlay();
			studentArray[i].AveHighSub();
			studentArray[i].AveLowSub();
			}
	}
}

class HighSchoolAchievement{
	public int Kokugo,Sugaku,Eigo,Syakai,Rika;
	public int sum;
	public double ave;
	
	public HighSchoolAchievement(int score1,int score2,int score3,int score4, int score5){
		Kokugo = score1;
		Sugaku = score2;
		Eigo = score3;
		Syakai = score4;
		Rika = score5;
	}
	
	public void AllScoreDisPlay(){
		System.out.println("����̓_��"+Kokugo);
		System.out.println("���w�̓_��"+Sugaku);
		System.out.println("�p��̓_��"+Eigo);
		System.out.println("�Љ�̓_��"+Syakai);
		System.out.println("���Ȃ̓_��"+Rika);
	}
	
	public void SumAveScoreDisPlay(){
		System.out.println("���v�_��"+ScoreSum());
		System.out.println("���ϓ_��"+ScoreAve());
	}
	
	public void AveHighSub(){
		System.out.println("���ϓ_�ȏ�̉Ȗڂ͉��L�ɂȂ�܂��B");
	    System.out.println(KokugoHigh()+" "+SugakuHigh()+" "+EigoHigh()+" "+SyakaiHigh()+" "+RikaHigh());
	}
	
	public void AveLowSub(){
		System.out.println("���ϓ_�ȉ��̉Ȗڂ͉��L�ɂȂ�܂��B");
		System.out.println(KokugoLow()+" "+SugakuLow()+" "+EigoLow()+" "+SyakaiLow()+" "+RikaLow());
	}
	
	public int ScoreSum(){
		sum = Kokugo + Sugaku + Eigo + Syakai + Rika;
		return sum;
	}
	
	public double ScoreAve(){
		ave = sum/5;
		return ave;
	}
	
	public String KokugoHigh(){
		if(Kokugo >= ave){
			return "����";
		}else{
			return "";
		}
	}
	
	public String SugakuHigh(){
		if(Sugaku >= ave){
			return "���w";
		}else{
			return "";
		}
	}
		
	public String EigoHigh(){
		if(Eigo >= ave){
			return "�p��";
		}else{
			return "";
		}
	}
			
	public String SyakaiHigh(){
		if(Syakai >= ave){
			return "�Љ�";
		}else{
			return "";
		}
	}
			
	public String RikaHigh(){
		if(Rika >= ave){
			return "����";
		}else{
			return "";
		}
	}
	
		
	public String KokugoLow(){
		if(Kokugo <= ave){
			return "����";
		}else{
			return "";
		}
	}
	
		
	public String SugakuLow(){
		if(Sugaku <= ave){
			return "���w";
		}else{
			return "";
		}
	}
	
		
	public String EigoLow(){
		if(Eigo <= ave){
			return "�p��";
		}else{
			return "";
		}
	}
	
		
	public String SyakaiLow(){
		if(Syakai <= ave){
			return "�Љ�";
		}else{
			return "";
		}
	}
	
		
	public String RikaLow(){
		if(Rika <= ave){
			return "����";
		}else{
			return "";
		}
	}
	


}