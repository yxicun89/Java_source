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
		System.out.println(name+"����̐g�̃f�[�^��\�����܂��B");
		System.out.println("�g���F"+height);
		System.out.println("�̏d�F"+weight);
		System.out.println("����:"+sex);
	}
}