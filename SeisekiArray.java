class SeisekiArray implements SeisekiSet{
	public int[] arrayKokugo, arraySugaku, arrayEigo;
	public String[] arrayName;
	public int num;
	
	public SeisekiArray(){
	arrayKokugo = new int[8];
	arraySugaku = new int[8];
	arrayEigo = new int[8];
	arrayName = new String[8];
	num = 0;
	}
	
	public void addScore(int Kokugo,int Sugaku,int Eigo,String name){
		if(num >= arrayName.length){
			int[] newArrayKokugo = new int[arrayKokugo.length+8];
			int[] newArraySugaku = new int[arraySugaku.length+8];
			int[] newArrayEigo = new int[arrayEigo.length+8];
			String[] newArrayName = new String[arrayName.length+8];
			for(int i=0;i<arrayName.length;i++){
				newArrayKokugo[i] = arrayKokugo[i];
				newArraySugaku[i] = arraySugaku[i];
				newArrayEigo[i] = arrayEigo[i];
				newArrayName[i] = arrayName[i];
			}
			arrayKokugo = newArrayKokugo;
			arraySugaku = newArraySugaku;
			arrayEigo = newArrayEigo;
			arrayName = newArrayName;
		}
		int x = num++;
		arrayKokugo[x] = Kokugo;
		arraySugaku[x] = Sugaku;
		arrayEigo[x] = Eigo;
		arrayName[x] = name;
	}
	
	public int size(){
		return num;
	}
	
	public int sumKokugo(){
		int a = 0;
		for(int i=0;i<arrayKokugo.length;i++){
			a = a + arrayKokugo[i];
		}
		return a;
	}
	
	public int sumSugaku(){
		int b = 0;
		for(int i=0;i<arraySugaku.length;i++){
			b = b + arraySugaku[i];
		}
		return b;
	}
	
	public int sumEigo(){
	    int c = 0;
		for(int i=0;i<arrayEigo.length;i++){
			c = c + arrayEigo[i];
		}
		return c;
	}
		
	public String Display(int index){
		return arrayName[index]+"‚Ì¬Ñ ‘ŒêF"+arrayKokugo[index]+"”Šw:"+arraySugaku[index]+"‰pŒêF"+arrayEigo[index];
	}
}