class SeisekiList implements SeisekiSet{
	public SeisekiNode head;
	public int sum=0;
	
	public SeisekiList(){
		head = null;
	}
	
	public void addScore(int Kokugo,int Sugaku,int Eigo,String name){
		SeisekiNode node = new SeisekiNode(Kokugo,Sugaku,Eigo,name);
		node.next = head;
		head = node;
	}
	
	public int size(){
		int s = 0;
		SeisekiNode node = head;
		while(node != null){
			s++;
			node = node.next;
		}
		return s;
	}
	
	public int sumKokugo(){
		int a = 0;
		SeisekiNode node = head;
		while(node!=null){
			a = a + node.Kokugo;
			node = node.next;
		}
		return a;
	}
	
	public int sumSugaku(){
		int b = 0;
		SeisekiNode node = head;
		while(node!=null){
			b = b + node.Sugaku;
			node = node.next;
		}
		return b;
	}
	
	
	public int sumEigo(){
	    int c = 0;
		SeisekiNode node = head;
		while(node!=null){
			c = c + node.Eigo;
			node = node.next;
		}
		return c;
	}
	
	public String Display(int index){
		SeisekiNode node = head;
		while(index-->0){
			node = node.next;
		}
		return node.name+"‚Ì¬Ñ ‘Œê:"+node.Kokugo+"”Šw:"+node.Sugaku+"‰pŒê:"+node.Eigo;
		}
}

class SeisekiNode{
	public int Kokugo, Sugaku, Eigo;
	public String name;
	public SeisekiNode next;
	
	public SeisekiNode(int a,int b,int c,String d){
		Kokugo = a;
		Sugaku = b;
		Eigo = c;
		name = d;
		next = null;
	}
}