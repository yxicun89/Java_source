public interface SeisekiSet{
	void addScore(int Kokugo,int Sugaku,int Eigo,String name);
	String Display(int index);
	int size();
	int sumKokugo();
	int sumSugaku();
	int sumEigo();
}