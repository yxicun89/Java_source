import java.util.Random;
public class InterfaceTask{
	public static void main(String[] args){
		SeisekiSet classA = new SeisekiList();
		SeisekiSet classB = new SeisekiArray();
		
		Random rand = new Random();
		int score1 = 30 + rand.nextInt(70);
		int score2 = 30 + rand.nextInt(70);
		int score3 = 30 + rand.nextInt(70);
		int score4 = 30 + rand.nextInt(70);
		int score5 = 30 + rand.nextInt(70);										
		int score6 = 30 + rand.nextInt(70);
		int score7 = 30 + rand.nextInt(70);
		int score8 = 30 + rand.nextInt(70);
		int score9 = 30 + rand.nextInt(70);
		int score10 = 30 + rand.nextInt(70);
		int score11 = 30 + rand.nextInt(70);
		int score12 = 30 + rand.nextInt(70);
		int score13 = 30 + rand.nextInt(70);
		int score14 = 30 + rand.nextInt(70);
		int score15 = 30 + rand.nextInt(70);
	    int score16 = 30 + rand.nextInt(70);
		int score17 = 30 + rand.nextInt(70);
		int score18 = 30 + rand.nextInt(70);
		int score19 = 30 + rand.nextInt(70);
		int score20 = 30 + rand.nextInt(70);
		int score21 = 30 + rand.nextInt(70);
		int score22 = 30 + rand.nextInt(70);
		int score23 = 30 + rand.nextInt(70);
		int score24 = 30 + rand.nextInt(70);
		int score25 = 30 + rand.nextInt(70);
		int score26 = 30 + rand.nextInt(70);
		int score27 = 30 + rand.nextInt(70);
		int score28 = 30 + rand.nextInt(70);
		int score29 = 30 + rand.nextInt(70);
		int score30 = 30 + rand.nextInt(70);
		
		String[] nameA = {"����A ","����B","����C","����D","����E"};
		int[] KokugoA = {score1,score2,score3,score4,score5};
		int[] SugakuA = {score6,score7,score8,score9,score10};
		int[] EigoA = {score11,score12,score13,score14,score15};
		String[] nameB = {"���A","���B","���C","���D","���E"};
		int[] KokugoB = {score16,score17,score18,score19,score20};
		int[] SugakuB = {score21,score22,score23,score24,score25};
		int[] EigoB = {score26,score27,score28,score29,score30};
		
		for(int i=0;i<nameA.length;i++){
			classA.addScore(KokugoA[i],SugakuA[i],EigoA[i],nameA[i]);
		}
		
		System.out.println("�N���XA�̐��т͉��L�ɂȂ�܂��B");
		for(int i=0;i<classA.size();i++){
			System.out.println(classA.Display(i));
		}
		
		System.out.println("�N���XA�̊e���Ȃ̕��ϓ_�͉��L�ɂȂ�܂��B");
		System.out.println("����F"+classA.sumKokugo()/5);
		System.out.println("���w�F"+classA.sumSugaku()/5);
		System.out.println("�p��F"+classA.sumEigo()/5);
		System.out.println();
		
		for(int i=0;i<nameB.length;i++){
			classB.addScore(KokugoB[i],SugakuB[i],EigoB[i],nameB[i]);
		}
		
		System.out.println("�N���XB�̐��т͉��L�ɂȂ�܂��B");
		for(int i=0;i<classB.size();i++){
			System.out.println(classB.Display(i));
		}
		
		System.out.println("�N���XB�̊e���Ȃ̕��ϓ_�͉��L�ɂȂ�܂��B");
		System.out.println("����F"+classB.sumKokugo()/5);
		System.out.println("���w�F"+classB.sumSugaku()/5);
		System.out.println("�p��F"+classB.sumEigo()/5);
		System.out.println();
		
		System.out.println("�N���XA��B�ɂ��e���Ȃ̕��ς͉��L�ɂȂ�܂��B");
		System.out.println("����:"+AllClassAve(classA.sumKokugo(),classB.sumKokugo()));
		System.out.println("���w:"+AllClassAve(classA.sumSugaku(),classB.sumSugaku()));
		System.out.println("�p��:"+AllClassAve(classA.sumEigo(),classB.sumEigo()));
		}
		
		public static double AllClassAve(int a,int b){
			double c = (a + b)/10;
			return c;
		}
}