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
			System.out.println((i+1)+"人目の成績を表示します");
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
		System.out.println("国語の点数"+Kokugo);
		System.out.println("数学の点数"+Sugaku);
		System.out.println("英語の点数"+Eigo);
		System.out.println("社会の点数"+Syakai);
		System.out.println("理科の点数"+Rika);
	}
	
	public void SumAveScoreDisPlay(){
		System.out.println("合計点数"+ScoreSum());
		System.out.println("平均点数"+ScoreAve());
	}
	
	public void AveHighSub(){
		System.out.println("平均点以上の科目は下記になります。");
	    System.out.println(KokugoHigh()+" "+SugakuHigh()+" "+EigoHigh()+" "+SyakaiHigh()+" "+RikaHigh());
	}
	
	public void AveLowSub(){
		System.out.println("平均点以下の科目は下記になります。");
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
			return "国語";
		}else{
			return "";
		}
	}
	
	public String SugakuHigh(){
		if(Sugaku >= ave){
			return "数学";
		}else{
			return "";
		}
	}
		
	public String EigoHigh(){
		if(Eigo >= ave){
			return "英語";
		}else{
			return "";
		}
	}
			
	public String SyakaiHigh(){
		if(Syakai >= ave){
			return "社会";
		}else{
			return "";
		}
	}
			
	public String RikaHigh(){
		if(Rika >= ave){
			return "理科";
		}else{
			return "";
		}
	}
	
		
	public String KokugoLow(){
		if(Kokugo <= ave){
			return "国語";
		}else{
			return "";
		}
	}
	
		
	public String SugakuLow(){
		if(Sugaku <= ave){
			return "数学";
		}else{
			return "";
		}
	}
	
		
	public String EigoLow(){
		if(Eigo <= ave){
			return "英語";
		}else{
			return "";
		}
	}
	
		
	public String SyakaiLow(){
		if(Syakai <= ave){
			return "社会";
		}else{
			return "";
		}
	}
	
		
	public String RikaLow(){
		if(Rika <= ave){
			return "理科";
		}else{
			return "";
		}
	}
	


}