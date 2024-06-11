class BodyData{
	public String name;
	public double height;
	public double weight;
	public String sex;
	
	public BodyData(String a,double b,double c,String d){
		name = a;
		height = b;
		weight = c;
		sex = d;
	}
	
	public void DataDisplay(){
		System.out.println(name+"さんの身体データを表示します。");
		System.out.println("身長："+height);
		System.out.println("体重："+weight);
		System.out.println("性別:"+sex);
	}
}